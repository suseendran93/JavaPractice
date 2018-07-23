package practice;

public class BinarySearch {
	
	
	static int[] a= {2,3,4,5,6,7,56,43,8};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=3;
		int min=0;
		int max=a.length-1;
		int mid=(min+max)/2;
			int res=BinarySearch2(n,min,mid,max);
			System.out.println(res);
		
	}
	
	public static int BinarySearch2(int n,int min,int mid,int max) {
		// TODO Auto-generated constructor stub
		for(int i=0;i<mid;i++) {
			if(a[mid]==n)
				return n;
			
			else if(a[mid]>n)
				max=mid;
			
			else
				min=mid;
		}
		return a[n];
	}

}
