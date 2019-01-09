//prime numbers upto given number
var number=10;
var i,j,fact_count=0;
for(i=2;i<=number;i++)
{
	for(j=1;j<=i;j++)
	{
		if(i%j==0)
		{
				fact_count+=1;   //calculating factors
		}
	}
  if(fact_count==2)    //if factor count is 2 it is prime number
  {
  	window.alert(i+" is a prime number");
  }
  fact_count=0;
}
