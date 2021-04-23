package api.automation.learning;

public class PrintWitoutLoop {

	public static void main(String[] args) {
		printNumber(1);
		System.out.println("done");
		System.out.println("done");

	}
	
	public static void printNumber(int number){
		if(number<=10){
			System.out.println(number);
			printNumber(number+1);
		}
		
	}
	
	public static void printNumber1(int number){
		if(number<=10){
			System.out.println(number);
			printNumber(number+1);
		}
		
	}
	public static void printNumber2(int number){
		if(number<=10){
			System.out.println(number);
			printNumber(number+1);
		}
		
	}
   
}
