package com.multi.grow.diary;

import java.util.*;

public class diaryVO {
	
	private int D_no;
	private String D_img;
	private String D_nickname;
	private String D_title;
	private String D_contents;
	private String D_mood;
	private Date D_date;
	private int member_no;
	private int card_no;
	
	public int getD_no() {
		return D_no;
	}
	public void setD_no(int d_no) {
		D_no = d_no;
	}
	public String getD_img() {
		return D_img;
	}
	public void setD_img(String d_img) {
		D_img = d_img;
	}
	public String getD_nickname() {
		return D_nickname;
	}
	public void setD_nickname(String d_nickname) {
		D_nickname = d_nickname;
	}
	public String getD_title() {
		return D_title;
	}
	public void setD_title(String d_title) {
		D_title = d_title;
	}
	public String getD_contents() {
		return D_contents;
	}
	public void setD_contents(String d_contents) {
		D_contents = d_contents;
	}
	public String getD_mood() {
		return D_mood;
	}
	public void setD_mood(String d_mood) {
		D_mood = d_mood;
	}
	public Date getD_date() {
		return D_date;
	}
	public void setD_date(Date d_date) {
		D_date = d_date;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public int getCard_no() {
		return card_no;
	}
	public void setCard_no(int card_no) {
		this.card_no = card_no;
	}
	
	@Override
	public String toString() {
		return "diaryVO [D_no=" + D_no + ", D_img=" + D_img + ", D_nickname=" + D_nickname + ", D_title=" + D_title
				+ ", D_contents=" + D_contents + ", D_mood=" + D_mood + ", D_date=" + D_date + ", member_no="
				+ member_no + ", card_no=" + card_no + "]";
	}
	
	
}