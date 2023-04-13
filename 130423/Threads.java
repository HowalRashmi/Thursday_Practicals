/* Create two thread.one thread is finding average of first 50 numbers and other thread is
printing square of number store in array arr={10,15,20,25,30}*/
package practicals130423;

class Thread1 extends Thread
{
	public void run()
	{
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			sum = sum+i;
		}
		System.out.println("Average of first 50 numbers is : "+(sum/50));
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		int arr[]= {10,15,20,25,30};
		for(int i=0;i<5;i++)
		{
			int s1= arr[i]*arr[i];
			System.out.println("Square of "+arr[i]+" : "+s1);
		}
	}
}
public class Threads {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}

}
