package api.automation.learning;

public class Bubblesort {

	public static void main(String[] args) {
		
		int array[]={10,50,5,20,7};
		 for(int i=1;i<=array.length-1;i++){
			 for(int j=0;j<=array.length-1-i;j++){
				 if(array[j+1]>array[j]){
					 int temp=array[j];
					 array[j]=array[j+1];
					 array[j+1]=temp;
				 }
				 
			 }
		 }
        for(int i=0;i<=array.length-1;i++){
        	System.out.print(array[i]+" ");
        }
	}

}
