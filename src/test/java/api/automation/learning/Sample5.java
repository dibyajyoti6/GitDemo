package api.automation.learning;

public class Sample5 implements Runnable{
   
	
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		Sample5 s=new Sample5();
		Thread th=new Thread(s);
		Sample5 s1=new Sample5();
		th.start();
		//Thread.sleep(2000);
		//s.start();
	}
	

}
