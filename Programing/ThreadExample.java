class MyfirstThread extends Thread
{
	int array[];
	static int i=0;
	static long sum=0;
	MyfirstThread(int[] array)
	{
		this.array=array;
	}
	public void run()
	{
		for(;i<100000;i++) {
			if(i%2==0)
			{
				sum=sum+array[i];
			}
			//System.out.println(sum+"in one");
		}
	System.out.println(sum +"is the sum1");	
	}
}
class MysecondThread extends Thread
{
	int array[];
	static int i=0;
	static long sum=0;
	MysecondThread(int[] array)
	{
		this.array=array;
	}
	public void run()
	{
		for(;i<100000;i++) {
			if(i%2!=0)
			{
				sum=sum+array[i];
			}
			//System.out.println(sum+"in two");
		}
		
		System.out.println(sum +"is sum2");
	}
}
public class ThreadExample {

	public static void main(String args[])
	{
	long start=System.nanoTime();
	int arr[]=new int[100000];
	int i;
	for(i=0;i<100000;i++)
	{
		arr[i]=i+1;
	}
	MyfirstThread obj1=new MyfirstThread(arr);
	Thread t1=new Thread(obj1);
	t1.start();
	
	MysecondThread obj2=new MysecondThread(arr);
	Thread t2=new Thread(obj2);
	t2.start();
	long end=System.nanoTime();
	long total=end-start;
	System.out.println(total);
	
	}
}
