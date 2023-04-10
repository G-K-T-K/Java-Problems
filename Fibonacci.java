import java.util.Scanner;
class Fibonacci {
  public static void main(String[] args) {

    int n, a = 0, b = 1;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no. of terms : ");
    n=sc.nextInt();
    System.out.println("Fibonacci Series till " + n + " terms:");
    for (int i = 1; i <= n; ++i) {
    System.out.print(a + ", ");
    int c = a + b;
    a = b;
    b = c;
    }
  }
}