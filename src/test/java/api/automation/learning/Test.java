package api.automation.learning;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student("dibya", 101);
		Student s2=new Student("swdhin", 99);
		Student s3=new Student("abhi", 103);
		Student array[]={s1,s2,s3};
		Arrays.sort(array);
		
		for(int i=0;i<=array.length-1;i++){
			System.out.println(array[i]);
		}
		

	}

}
