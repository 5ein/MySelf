package 문제풀이;

public class Exercise07 {
	public class Person {
		private String name;
		private int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return name + "," + age;
		}

	}

	public class Employee extends Person {
		private String dept;

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

	}

	public class Student extends Person {
		private String major;

		public String getMajor() {
			return major;
		}

		public void setMajor(String major) {
			this.major = major;
		}

	}

	public class Professor extends Person {
		private String subject;

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

	}

}
