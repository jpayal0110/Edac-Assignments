/*1
import java.util.Scanner;
class Ab
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
int n= sc.nextInt();
 
for(int i=0;i<10;i++)
{
System.out.println(n +" x "+(i+1)+"= "+(n*(i+1)));
}
}
}
*/


/*=============================================================*/

/*2
import java.util.Scanner;
class Ab
{
public static void main(String args[])
{
int rev = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n= sc.nextInt();

while(n !=0)
{
int num = n%10;
rev = rev*10+num;
n/10;
}
System.out.println("Reversed number: "+rev);
}
}
*/


/*=============================================================*/


/*3

import java.util.Scanner;
class Ab
{
public static void main(String args[])
{
int flag=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n= sc.nextInt();

for(int i=2; i<=n/2; i++)
{
if(n%2==0)
{
flag=1;
break;
}
}

if(flag !=1)
System.out.println(n + " is a prime number.");
else
System.out.println(n + " is not a prime number.");

}
}

*/

/*=============================================================*/


           
/*=============================================================*/


/*6
import java.util.Scanner;
class Ab
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int[] a = new int[10];
int sum = 0;
int avg = 0;

System.out.println("Enter the elements:");

for (int i=0; i<10; i++)
{
a[i] = sc.nextInt();
}
for( int num : a) 
{
sum = sum+num;
avg = sum/10;
}
System.out.println("Sum of array elements is:"+sum);
System.out.println("Average of array elements is:"+avg);
}
}
*/

/*=============================================================*/

/*7
import java.util.Scanner;
class Ab
{
public static void main(String args[])
{
int temp = 0;
Scanner sc = new Scanner(System.in);
int[] a = new int[10];
System.out.println("Enter the elements:");

for (int i=0; i<10; i++)
{
a[i] = sc.nextInt();
}

for (int i = 0; i < a.length; i++) 
{     
for (int j = i+1; j < a.length; j++) 
{     
if(a[i] < a[j]) //if(a[i] > a[j])
{    
temp = a[i];    
a[i] = a[j];    
a[j] = temp;    
}     
}
}          

System.out.println();

System.out.println("Elements of array sorted in descending order: ");    

for (int i = 0; i < a.length; i++)
{     
System.out.print(a[i] + " ");    
}    
}    
}    

*/

/*=============================================================*/

/*8
import java.util.Scanner;
class Ab
{
public static void main(String args[])
{
int temp = 0;
Scanner sc = new Scanner(System.in);
int[] a = new int[10];
System.out.println("Enter the elements:");

for (int i=0; i<10; i++)
{
a[i] = sc.nextInt();
}

System.out.println("Original Array:");
for(int i=0;i<a.length;i++)
System.out.print(a[i] + "  ");
     
System.out.println();
System.out.println("Original Array printed in reverse order:");
for(int i=a.length-1;i>=0;i--)
System.out.print(a[i] + "  ");
}
}
*/

/*=============================================================*/

/*10

import java.util.Scanner;
class Ab
{
public static void main(String[] args)
{
int flag=0;
int even = 0, odd = 0;
Scanner sc = new Scanner(System.in);

int []a = new int [10];

System.out.println("enter element: ");
for(int i=0; i<10; i++)
{
a[i] = sc.nextInt();
}

for(int i=0;i<a.length; i++)
{
if(a[i] % 2  == 0)
{
even= even + a[i];
flag = 1
}
else
{
odd= odd + a[i];
}
}
System.out.println("sum of even element: "+even);
System.out.println("sum of odd element: "+odd);
}
}
*/

/*=============================================================*/


/*9
           
import java.util.Scanner;
class Ab
{
public static void main(String[] args)
{
int num, flag=0;

Scanner sc = new Scanner(System.in);
int a[] = new int [10];
System.out.println("enter element: ");
for(int i=0; i<10; i++)
{
a[i] = sc.nextInt();
}

System.out.println("search element: ");
Scanner sc2 = new Scanner(System.in);
num = sc2.nextInt();


for(int i=0;i<a.length; i++)
{
if(a[i]==num)
{
System.out.println("match found at "+i+" position");
flag=1;
break;
}
}              
if(flag==0)
{
System.out.println("match not found");
}
}
}

*/
/*=============================================================*/

