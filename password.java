import java.util.*;
public class password
{
	public static void main(String[] args) 
	{
	    int roomno;
	    Scanner input=new Scanner(System.in);
          System.out.print("Enter the Name : ");
	    String name=input.nextLine();
          System.out.print("Enter the Room No. : ");
	    roomno=input.nextInt();
	    name=name.substring(0,2);
	    System.out.print("Wifi Password is : "+name+""+roomno+"$@");
	}
}