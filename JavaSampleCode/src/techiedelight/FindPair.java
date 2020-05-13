package techiedelight;
//comment
public class FindPair {

	public static void findpair(int[] a,int sum){
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==sum){
					System.out.println("They matched elements are  "+a[i]+" and "+a[j]);
					System.out.println("They matched elements are at positions  "+i+" and "+j);
					return;
					}
			}
		}
		System.out.println("Pair not found ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={17,5,12,4,5,6};
		int sum=10;
		findpair(arr,sum);		
	}

}
