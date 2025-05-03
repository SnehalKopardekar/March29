package javapractices;

public class ArrayPrograms {

	public static void main(String[] args) {
		
		int arr[]= {5,10,2,100,200,50,30};
		
		
		//Print array in ascending order 2,5,10,20,30,50,100,200
		//Print array in descending order 200,100,50,30,20,10,5,2
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					int c = arr[i];
					arr[i]=arr[j];
					arr[j]=c;
					
				}
					}
	
		}
		for(int k=0;k<arr.length;k++) {
               System.out.println(arr[k]);
		}
		System.out.println("min="+arr[0]);
		System.out.println("max="+arr[arr.length-1]);
	
		}
	}


