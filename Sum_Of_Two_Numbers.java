import java.util.Scanner;
class SumOfTwoNumbers
{
    public static void main(String args[])
    {
        int a,b,sum;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a=sc.nextInt();
        System.out.print("Enter the value of b : ");
        b=sc.nextInt();
        sum=a+b;
        System.out.print("The Sum of a and b is : "+ sum);
    }
}