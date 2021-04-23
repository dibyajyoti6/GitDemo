package api.automation.learning;

public class Student implements Comparable{

	String name;
	int age;
	
	public Student(String name,int rollNumber){
		this.name=name;
		this.age=rollNumber;
	}

	
	public String toString(){
		return name+"\t"+age;
		
	}


	@Override
	public int compareTo(Object obj) {
		Student s=(Student) obj;
		//return age-s.age;
		return name.compareTo(s.name);
	}


}
