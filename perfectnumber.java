import java.util.Scanner;
class perfectnumber
{
public static void main(String args[])
{
int i=1,n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number : ");
n=sc.nextInt();
while(i <= n/2)
{
if(n%i==0)
{
sum+=i;
}
i++;
}
if(sum==n)
{
System.out.print(n+" is a perfect number");
}
else
{
System.out.print(n+" is not a perfect number");
}
}
}