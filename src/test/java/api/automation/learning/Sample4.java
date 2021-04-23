package api.automation.learning;

public class Sample4 {
	
	String name;
	int rollNumber;
	
	public Sample4(String name,int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
	}

	public static void main(String[] args) {
		Sample4 sample=new Sample4("dibya",101);
		System.out.println(sample);
		

	}
	public String toString(){
		return name+"\t"+rollNumber;
		
	}

}
