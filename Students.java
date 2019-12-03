import java.util.Scanner;



class HW6_2{

	public static void main(String [] args){

		String name;

		int age;

		double grade;

		Scanner s = new Scanner(System.in);

		

		System.out.print("이름: ");

		name = s.nextLine();

		System.out.print("나이: ");

		age = s.nextInt();

		System.out.print("학점: ");

		grade = s.nextDouble();

		

		//콘솔에서 입력받은 정보로 학생 객체 생성

		Student st = new Student(name, age, grade);

		

		System.out.println("학점을 4.3으로 변경합니다. ");

		st.setGrade(4.3);//학점을 4.3으로 재 설정

		

		System.out.println("학생정보");

		System.out.println(st);

	}

}



class Student{

	private String name;

	private int age;

	private double grade;

	

	Student(){

		this("홍길동", 20, 3.0);

	}

	

	Student(String name, int age, double grade){

		setName(name);//생성자에서 setter 호출 가능. 

		setAge(age);

		setGrade(grade);

	}

	

	void setName(String name){

		this.name = name;

	}

	void setAge(int age){

		if(age<0||age>=200) this.age = 20; 

		else this.age = age;

	}

	void setGrade(double grade){

		if(grade<0||grade>4.3) this.grade = 3.0;

		else this.grade = grade;

	}

	

	

	String getName(){

		return name;

	}

	int getAge(){

		return age;

	}

	double getGrade(){

		return grade;

	}

	

	public String toString(){

		return String.format("이름: %s, 나이: %d, 학점: %.1f", name, age, grade);

	}

	

}