package Exceptionss;


public class Voter {

	
	int age ;
	String name ;
	String sex;
	
	public Voter() {
		super();
	}
	 Voter( String name , String sex, int age ) {
		super();
		this.name=name;
		this.sex=sex;
	try {
		if(age<18)
		{throw new UnderAgeException();}
	else
		this.age=age;}
	catch(Exception e) {
		System.out.println("your not eligible for voting");
	}
	
	
	

	}

	public String toString() {
		return "Voter [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}

}

