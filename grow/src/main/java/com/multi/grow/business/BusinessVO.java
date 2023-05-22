package com.multi.grow.business;

import java.sql.Timestamp;

public class BusinessVO {

		private int b_no;
		private String b_title;
		private Timestamp b_date;
		private String b_write;
		private String b_image;
		private String b_place;
		private int member_no;
		private boolean b_choose;
		private boolean b_share;
		
		public int getB_no() {
			return b_no;
		}
		public void setB_no(int b_no) {
			this.b_no = b_no;
		}
		
		public String getB_title() {
			return b_title;
		}
		public void setB_title(String b_title) {
			this.b_title = b_title;
		}
		
		public Timestamp getB_date() {
			return b_date;
		}
		public void setB_date(Timestamp b_date) {
			this.b_date = b_date;
		}
		
		public String getB_write() {
			return b_write;
		}
		public void setB_write(String b_write) {
			this.b_write = b_write;
		}
		
		public String getB_image() {
			return b_image;
		}
		public void setB_image(String b_image) {
			this.b_image = b_image;
		}
		
		public String getB_place() {
			return b_place;
		}
		public void setB_place(String b_place) {
			this.b_place = b_place;
		}
		
		public int getMember_no() {
			return member_no;
		}
		public void setMember_no(int member_no) {
			this.member_no = member_no;
		}
		
		public boolean isB_choose() {
			return b_choose;
		}
		public void setB_choose(boolean b_choose) {
			this.b_choose = b_choose;
		}
		
		public boolean isB_share() {
			return b_share;
		}
		public void setB_share(boolean b_share) {
			this.b_share = b_share;
		}
		
		@Override
		public String toString() {
			return "BusinessVO [b_no=" + b_no + ", b_title=" + b_title + ", b_date=" + b_date + ", b_write=" + b_write
					+ ", b_image=" + b_image + ", b_place=" + b_place + ", member_no=" + member_no + ", b_choose="
					+ b_choose + ", b_share=" + b_share + "]";
		}
		
	}

