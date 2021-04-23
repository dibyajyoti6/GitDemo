package Excel;

public class StringManupulation {

	public static void main(String[] args) {
		
		
		String s="Please email us at dasdibyajyoti0@gmail.com with below template to receive response";
        String text=s.split("at")[1].trim().split(" ")[0];
        System.out.println(text);
       // System.out.println(array[0]);
       // System.out.println(array[1]);
        
	}

}
