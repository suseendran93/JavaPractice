package org.collections.practice;

public class CountOfChars {

	public static void main(String[] args) {
		String s="Welcome Java Java Class";
		String[] sub=s.split(" ");
		int j=0;
		for(int i=0;i<sub.length;i++) {
			if(sub[i].equals("Java") ){
				
				char[] arr=sub[i].toCharArray();
				for(int i1=0; i1<arr.length;i1++)
				{
					if(arr[i1]=='a')
					{
						j++;
					}
				}
				
			}
		}
	
		
	
System.out.println(j);
				
	}

}
