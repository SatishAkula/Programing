class MyfirstThread extends Thread
{
	int array[];
	static int i=0;
	int sum=0;
	MyfirstThread(int[] array)
	{
		this.array=array;
	}
	public void run()
	{
		for(;i<10;i++) {
			if(i%2==0)
			{
				sum=sum+array[i];
			}
			System.out.println(sum+"in one");
		}
		
	}
}
class MysecondThread extends Thread
{
	int array[];
	static int i=0;
	int sum=0;
	MysecondThread(int[] array)
	{
		this.array=array;
	}
	public void run()
	{
		for(;i<10;i++) {
			if(i%2!=0)
			{
				sum=sum+array[i];
			}
			System.out.println(sum+"in two");
		}
		
		
	}
}
public class ThreadExample {

	public static void main(String args[])
	{
	long startTime = System.nanoTime();
	int arr[]=new int[10];
	int i;
	for(i=0;i<10;i++)
	{
		arr[i]=i+1;
	}
	MyfirstThread obj1=new MyfirstThread(arr);
	Thread t1=new Thread(obj1);
	t1.start();
	
	MysecondThread obj2=new MysecondThread(arr);
	Thread t2=new Thread(obj2);
	t2.start();
	long endTime   = System.nanoTime();
	long totalTime = endTime - startTime;
	System.out.println(totalTime);
	}
}
