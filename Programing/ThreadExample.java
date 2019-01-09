class MyfirstThread extends Thread
{
	int array[];
	static int i,sum=0;
	MyfirstThread(int[] array)
	{
		this.array=array;
	}
	public void run()
	{
		for(i=0;i<10;i++) {
			if(i%2==0)
			{
				sum=sum+array[i];
				System.out.println(sum);
			}
		}
		
	}
}

class MysecondThread extends Thread
{
	int array[];
	static int i,sum=0;
	MysecondThread(int[] array)
	{
		this.array=array;
	}
	public void run()
	{
		for(i=0;i<10;i++) {
			if(i%2==0)
			{
				sum=sum+array[i];
				System.out.println(sum);
			}
		}
		
	}
}
public class ThreadExample {

	public static void main(String args[])
	{
	int arr[]=new int[10];
	int i;
	for(i=0;i<10;i++)
	{
		arr[i]=arr[i]+1;
	}
	MyfirstThread obj1=new MyfirstThread(arr);
	Thread t1=new Thread(obj1);
	t1.start();
	
	MysecondThread obj2=new MysecondThread(arr);
	Thread t2=new Thread(obj2);
	t2.start();
	}
}
