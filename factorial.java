import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
int n,i,fact=1;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number : ");
n=sc.nextInt();
for(i=1;i<=n;i++){
fact=fact*i;
}
System.out.print("Factorial of "+n+" is : "+fact);
}
}