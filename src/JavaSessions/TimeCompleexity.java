package JavaSessions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TimeCompleexity {

	public static void main(String[] args) {

		int n=1;   // O(1)
		System.out.println(n);
		
		
		
		//odd/even number ---O(1)
		int num=21;
		if (num%2==0) {
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
		
		//hashmap and fetch the form ther map : loop up the hashmap
		
		
		Map<String, Integer> studentMark=new HashMap<String, Integer>();
		studentMark.put("Tom", 100);
		studentMark.put("peter", 200);
		studentMark.put("neveen", 500);
		studentMark.put("vivek", 499);
		System.out.println(studentMark.get("vivek"));
		
		
		
		//O(n)
		//1 to 10 or 100 or 1000 or 10000
		int n1=10;
		for(int i=1; i<=n1; i++) {
			System.out.print(i);
		}
		
		
		// 1+n_n_n=====> 1+3n ====>> 3n ignore concentex 1====> n=======O(n)
		
		
		//WAp to find out the largest element on ussorted array
		
		
		
		System.out.println("==========================");
		
		int arr[]= {1,34,44,55,67,89,1};
		
		
		int max=0;
		for(int i=0; i<arr.length;i++) //n
		{
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		//1+n+1 ====> 2+n======> n======O(n)
		
		
		//O(n^2)
		//n^2+n+1
		////2n^2 +2n+3
		
		
		//00 01 02 03
		//10 11 12 13
		//20 21 22 23
		
		
		
		
		
	}

}
