# Students

학생 class를 만들고 정보를 입력받아 학생 객체를 만들고 출력하는 코드입니다.


main에서 학생의 이름, 나이, 성적을 변수로 만들어줍니다.

    public static void main(String [] args){
	
    String name;

		int age;

		double grade;

		Scanner s = new Scanner(System.in);

	

콘솔에서 입력받은 정보로 학생 객체를 생성합니다.

		 Student st = new Student(name, age, grade);



학생 class를 만든 뒤 디폴트값을 홍길동, 20살, 3.0으로 설정합니다.


class Student{

	private String name;

	private int age;

	private double grade;

	
	Student(){

		this("홍길동", 20, 3.0);

	}

	
main에서 받은 값으로 설정해줍니다.


	Student(String name, int age, double grade){

		setName(name);//생성자에서 setter 호출 가능. 

		setAge(age);

		setGrade(grade);

	}

	

	void setName(String name){

		this.name = name;

	}

예외 발생시 20살, 3.0으로 만들어 줍니다.

set으로 기존에 받은 값을 수정할 수 있습니다.

ex) st.setGrade(4.3);//학점을 4.3으로 재 설정

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

	
  학생의 정보를 출력합니다.

	public String toString(){

		return String.format("이름: %s, 나이: %d, 학점: %.1f", name, age, grade);

	}

	

}
