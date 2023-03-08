 import java.util.*;
public class Search {
	public static int binary(arr[],s){
	int start = 0;
	int end = arr.length-1;
	while(start<=end){
	int middle = (start+end)/2;

	if(arr[middle]==s){
	return middle;
}
	else if(arr[middle]>s){
	end = middle-1;
}	
	else if(arr[middle]<s){
	start = middle+1;

}
	else{
return middle;
}
return -1;
}
	
	}
	public static void main(String []args) {
		int k;
		System.out.println("Enter the number of elements");
		Scanner sc  =  new Scanner (System.in);
		k = sc.nextInt();
		int []arr = new int[k];
		System.out.println("Enter the array elements");
		for(int i =0;i<k;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number you want to search");
			int s = sc.nextInt();
			Arrays.sort(arr);
		int y = binary(arr,s);
		System.out.println(y);		
	}
}
