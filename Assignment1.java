/*15
import java.util.Scanner;
class Gender
{
public static void main(String[] args)
{
char m, f;

System.out.println("Enter your gender: ");
Scanner input = new Scanner(System.in);
String gen = input.nextLine();

System.out.println("Enter your age: ");
Scanner input2 = new Scanner(System.in);
int age = input2.nextInt();

if(age>=18 && age<=30)
{
System.out.println("Eligible for marriage");
}
else 
{
System.out.println("Not eligible for marriage");
}
}
}
*/


/*================================================================*/


/*14
import java.util.Scanner;
class Leap 
{
public static void main(String[] args)
{

System.out.println("Year: ");
Scanner input = new Scanner(System.in);
int y = input.nextInt();

if(y % 4 == 0)
{
  if (y % 100 ==0)
	{ 
	  if (y % 400 ==0)
	    {
	      System.out.print("LEAP YEAR");
	     }
	  else
	     {
	      System.out.print("NOT A LEAP YEAR");
	     }
	 }
   else 
	{
	System.out.print("LEAP YEAR");
	}
}
else
{
System.out.print("NOT A LEAP YEAR");
}
}
}
*/

/*================================================================*/



import java.util.Scanner;
class Temp
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter 1st number: ");
int n1 = s.nextInt();

System.out.print("Enter 2nd number: ");
int n2 = s.nextInt();

System.out.print("Enter 3rd number: ");
int n3 = s.nextInt();

//int temp = n1>n2 ? n1:n2;
//int result= n3>temp ? n3:temp;
//System.out.print("Greatest number is "+result);

if(n1 > n2 && n1 > n3)
{
System.out.print("Greatest number is "+n1);
}
else if(n2 > n3)
{
System.out.print("Greatest number is "+n2);
}
else
{
System.out.print("Greatest number is "+n3);
}

/*================================================================*/


/*12
import java.util.Scanner;
class Salary
{
public static void main(String[] args)
{
double hra, da;
Scanner s = new Scanner(System.in);
System.out.print("Enter your basic salary: ");
double n = s.nextDouble();

if(n<10000)
{
hra = (n*0.1);
 da= (n*0.9);
}
else
{
hra = (2000);
da= (n*0.98);
}

System.out.print("GS= "+(n+da+hra));
}
}
*/

/*================================================================*/

/*11
import java.util.Scanner;
class Swap
{
public static void main(String[] args)
{
int n, m;
Scanner s = new Scanner(System.in);
System.out.println("Enter 2 numbers: ");
n = s.nextInt();
m = s.nextInt();

System.out.println("Before swap: "+n+" "+m);
n=n+m;
m=n-m;
n=n-m;

System.out.println("After swap: "+n+" "+m);
}
}
*/

/*================================================================*/

/*10
import java.util.Scanner;
class Temperature
{
public static void main(String[] args)
{
int f;
Scanner s = new Scanner(System.in);
System.out.println("Enter a numbers: ");
f = s.nextInt();

System.out.println("C: "+(5*(f-32)/9));
}
}
*/

/*================================================================*/

/*9
import java.util.Scanner;
class Temp
{
public static void main(String[] args)
{
double n, years, weeks, days;
Scanner s = new Scanner(System.in);
System.out.println("Enter a number of days: ");

n = s.nextDouble();

years = n/365;
System.out.println("years: "+years);
n = n%365;
System.out.println(+n);

weeks = n/7;
System.out.println("weeks: "+weeks);
n=n%7;
System.out.println(+n);

days = n;
System.out.println("days: "+days);
}
}
*/

/*================================================================*/

/*8
import java.util.Scanner;
class Temp
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("enter 3 values (write rate in decimal): ");
int p = sc.nextInt();
float r = sc.nextFloat();
int t = sc.nextInt();
float si = (p*r*t);
System.out.println("Simple Intrest: "+si);
}
}*/

/*================================================================*/



/*7
import java.util.Scanner;
class Temp
{
public static void main(String[] args)
{
int sub1, sub2, sub3, sub4, sub5;
float sum, avg, percentage;
Scanner sc = new Scanner(System.in);
System.out.print("Enter 5 marks: ");

sub1 = sc.nextInt();
sub2 = sc.nextInt();
sub3 = sc.nextInt();
sub4 = sc.nextInt();
sub5 = sc.nextInt();


sum = (sub1+sub2+sub3+sub4+sub5);
avg = (sum/5);
percentage = (sum/500)*100;

System.out.print("Percentage marks:"+percentage+"%");
}
} 
*/

/*================================================================*/

/*6
import java.util.Scanner;
class Temp
{
public static void main(String[] args)
{
double r, a, c;
System.out.println("Enter radius: ");
Scanner sc = new Scanner(System.in);
r = sc.nextDouble();

a = Math.PI*(r)*(r);
c = 2*Math.PI*(r);

System.out.println("Area of circle for radius "+r+": "+a);
System.out.println("Circumference of circle for radius "+r+": "+c);

}
} */

/*================================================================*/

/*5
class Temp
{
public static void main(String[] args)
{
String s1 = "Welcome";
String s2 = args[1];
System.out.print(s1);
System.out.println(s2);
}
}
*/


/*================================================================*/

/*4

class Temp
{
public static void main(String[] args)
{
byte a = 10;
byte b = 20;

byte c = (byte) (a+b);

System.out.println(+c);
}
}
*/


/*================================================================*/

/*2

class Temp
{
public static void main(String[] args)
{
int rollNo;
rollNo = 100;

System.out.println("Roll No = "+rollNo);
}

/*================================================================*/

/*1
class Temp
{
public static void main(String[] args)
{
System.out.println("Hello World");
}

/*================================================================*/



