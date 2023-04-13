/* Create two thread.one thread is finding average of first 50 numbers and other thread is
printing square of number store in array arr={10,15,20,25,30}*/

package practicals130423;

class Thread1 extends Thread           //creating threads
{
	public void run()     //run method for threads
	{
		int sum=0;
		for(int i=1;i<=50;i++)       //making for loop to calculate sum of first 50 numbers
		{
			sum = sum+i;     //calculating sum
		}
		System.out.println("Average of first 50 numbers is : "+(sum/50));       //printing average of first 50 numbers
	}
}

class Thread2 extends Thread       //creating second thread
{
	public void run()      //run method of thread
	{
		int arr[]= {10,15,20,25,30};      //given array of integer elements
		for(int i=0;i<5;i++)
		{
			int s1= arr[i]*arr[i];          //calculating square of elemets of array
			System.out.println("Square of "+arr[i]+" : "+s1);     //printing output
		}
	}
}
public class Threads {

	public static void main(String[] args) {        //main method
		Thread1 t1 = new Thread1();     //creating objects for new threads
		Thread2 t2 = new Thread2();
		t1.start();       //starts execution of threads
		t2.start();
	}

}
