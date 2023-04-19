/* Find largest and smallest elements of an array.*/
package facePrep;

public class SmallLargeEx {

	public static void main(String[] args) {
		int arr[]= {6,50,28,69,79,5,1,80};     //initializing an array
		int large= arr[0];                     //initializing variables with first element of array 
		int small= arr[0];
		for(int i=0;i<arr.length;i++)       //for loop to access individual elements of array
		{
			if(large<arr[i])          //if condition to compare and assign values
			{
				large=arr[i];     //if value of large is less than the next element of array then the value of large will be changed
			}
			else if(small>arr[i])      //if condition to compare and assign values
			{
				small=arr[i];      ////if value of small is more than the next element of array then the value of small will be changed
			}
		}
		System.out.println("Largest number is: "+large);
		System.out.println("Smallest number is: "+small);    //printing output

	}

}
