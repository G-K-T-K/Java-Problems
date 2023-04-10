import java.util.Scanner;
class reversenumber
{  
public static void main(String args[])   
{  
int n,rev = 0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number : ");
n=sc.nextInt();  
while(n != 0)   
{  
int rem = n % 10;  
rev = rev * 10 + rem;  
n = n/10;  
}  
System.out.println("The reverse of the given number is: " + rev);  
}  
}  