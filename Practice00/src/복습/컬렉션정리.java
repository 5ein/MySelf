package 복습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class 컬렉션정리 {
	public static void main(String[] args) {
		
//		List: 순서가 있는 데이터의 집합, 데이터의 중복을 허용함 
//			ArrayList, LinkedList, Stack, Vector
//		ex) 할일우선순위
		
		/* 1. ArrayList
		 달리기 대회에서 1등이 A군, 2등이 B군, 3등이 C양, 4등이 D양 인데 
		2등이 반칙을 해서 탈락 되었다 등수와 이름이 잘 찍히도록 프로그램! */
		ArrayList runner = new ArrayList();
		runner.add("A군");
		runner.add("B군");
		runner.add("c양");
		runner.add("D양");
		
		for (int i = 0; i < runner.size(); i++) {
			System.out.println((i + 1) + "등: " + runner.get(i));
		}
		System.out.println("-------");
		
		runner.remove(1); //2등 탈락
		for (int i = 0; i < runner.size(); i++) {
			System.out.println((i + 1) + "등: " + runner.get(i));
			
		}
		
		System.out.println("===================");

//		Queue: List + FIFO , 제일먼저 들어간 데이터가 제일먼저 삭제
//			LinkedList, PriorityQueue
		
		/* 2. LinkedList
		시헌일정 순서가 국어, 수학, 영어, 컴퓨터 시럼일정을 담은 컬렉션을 만드세요.
		시험을 보면 한과목씩 사라지게 해주세요. */
		LinkedList subject = new LinkedList();
		subject.add("국어");
		subject.add("수학");
		subject.add("영어");
		subject.add("컴퓨터");
		System.out.println("전체 시험볼 과목: " + subject);
		for (int i = 0; i < subject.size(); i++) {
			subject.remove();
			System.out.println((i + 1) + "일차 시험 후 남은과목: " + subject);
		}
		
		System.out.println("===================");
		
//		Set: 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않음
//			HashSet, TreeSet
		
		/* 3. HashSet 
		 로또번호 6개 생성해서 리스트에 넣어보기(중복되지 않게) */
		Random r = new Random();
		HashSet lotto = new HashSet();
		
		for (int i = 0; lotto.size() < 6; i++) {
			lotto.add(r.nextInt(45)+1); //1~45
		}
		System.out.println(lotto);
		
		System.out.println("===================");
		
//		Map: 키(key)와 값(value)이 쌍으로 이루어진 데이터의 집합
//			HashMap, TreeMap, Hashtable, Properties
		
		/* 4. HashMap 고객관리 시스템에서 
		100번 고객은 A양, 200번 고객은 B군, 
		300번 고객은 C양, 400번 고객은 D군 일때
		200번 고객은 탈퇴, 300번고객은 E양으로 개명 
		==> 고객의 전체리스트를 프린트 */
		HashMap client = new HashMap();
		client.put("100", "A양");
		client.put("200", "B군");
		client.put("300", "C양");
		client.put("400", "D군");
		System.out.println("수정전 고객 리스트 " + client);
		
		client.remove("200", "B군");
		//client.replace("300", "E양");
		client.put("300", "E양");
		System.out.println("현재 고객 리스트 " + client);
		
		
		
	}

}
