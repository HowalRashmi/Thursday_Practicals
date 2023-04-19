/* Find largest and smallest elements of an array.*/
package facePrep;

public class SmallLargeEx {

	public static void main(String[] args) {
		int arr[]= {6,50,28,69,79,5,1,80};
		int large= arr[0];
		int small= arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(large<arr[i])
			{
				large=arr[i];
			}
			else if(small>arr[i])
			{
				small=arr[i];
			}
		}
		System.out.println("Largest number is: "+large);
		System.out.println("Smallest number is: "+small);

	}

}
