import java.util.Scanner;
class SumOfDigits
{
public static void main(String args[])
{
int n,n1,sum=0;
System.out.print("Enter the value of n : ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

while(n>0)
{
n1=n%10;
sum=sum+n1;
n=n/10;
}
System.out.print("Sum of digits is : "+(sum));
}
}