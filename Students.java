import java.util.Scanner;



class HW6_2{

	public static void main(String [] args){

		String name;

		int age;

		double grade;

		Scanner s = new Scanner(System.in);

		

		System.out.print("�̸�: ");

		name = s.nextLine();

		System.out.print("����: ");

		age = s.nextInt();

		System.out.print("����: ");

		grade = s.nextDouble();

		

		//�ֿܼ��� �Է¹��� ������ �л� ��ü ����

		Student st = new Student(name, age, grade);

		

		System.out.println("������ 4.3���� �����մϴ�. ");

		st.setGrade(4.3);//������ 4.3���� �� ����

		

		System.out.println("�л�����");

		System.out.println(st);

	}

}



class Student{

	private String name;

	private int age;

	private double grade;

	

	Student(){

		this("ȫ�浿", 20, 3.0);

	}

	

	Student(String name, int age, double grade){

		setName(name);//�����ڿ��� setter ȣ�� ����. 

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

		return String.format("�̸�: %s, ����: %d, ����: %.1f", name, age, grade);

	}

	

}