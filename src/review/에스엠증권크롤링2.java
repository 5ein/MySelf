package review;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//나혼자 다시 해본것

public class 에스엠증권크롤링2 {
//크롤링은 인터넷 문서(html)를 다 받아와서,
//html문서를 분석(parser, 파싱!)을 해서 내가 원하는 정보를 추출하는 것.
	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=041510");

		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			doc = con.get(); // html코드를 다 가지고온다.!
			Elements list = doc.select("em .blind"); //em 아래 blind 클래스
			
			//for이용해서 현재가, 최고가, 최저가 위치 찾기
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(i + ": " + list.get(i));
//			}
			//현재 2,최고 6,최저 10
			
			//현재가
			Element tag = list.get(2);
			String today = tag.text();
			System.out.println("현재가 " + today);
			
			//최고가
			Element tag1 = list.get(6);
			String high = tag1.text();
			System.out.println("최고가 " + high);
			
			//최저가
			Element tag2 = list.get(10);
			String low = tag2.text();
			System.out.println("최저가 " + low);
			
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}