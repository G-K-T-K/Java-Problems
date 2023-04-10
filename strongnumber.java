import java.util.*;
class strongnumber 
{
public static void main(String args[]) 
{
int n,i,fact,digit,sum=0,temp;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number : ");
n=sc.nextInt();
temp = n;
while(temp != 0) {
i = 1;
fact = 1;
digit = temp % 10;
while(i <= digit) {
fact = fact * i;
i++;
}
sum = sum + fact;
temp = temp / 10;
}
if(sum == n)
System.out.println(n + " is a strong number\n");
else
System.out.println(n + " is not a strong number\n");
}   
}