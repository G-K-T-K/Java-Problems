import java.util.Scanner;
class Palindrome
{  
 public static void main(String args[])
{  
  int n,r,sum=0,temp;    
  Scanner sc=new Scanner(System.in);  
  System.out.print("Enter the number : ");
  n=sc.nextInt();
  temp=n;    
  while(n>0){    
   r=n%10; 
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("It is a palindrome");    
  else    
   System.out.println("It is not a palindrome");    
}  
}  