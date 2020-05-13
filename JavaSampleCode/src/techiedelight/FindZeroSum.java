package techiedelight;

public class FindZeroSum {

	public static void findZeroSum(int[] arr,int zsum){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==0){
					System.out.println("The zero sum is found at elements "+arr[i]+" "+arr[j]);
				    System.out.println("The zero sum is found at position "+i+" "+j);
				    return;
				}
					
			}
			
		}
		System.out.println("No match found");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] a={0,1,2,-3,-2,3,4,5,-3,2};
	int zerosum=0; 
	findZeroSum(a,zerosum);
	}

}
