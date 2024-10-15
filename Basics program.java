
• Basic program
1. Java program to get input from the user.
=> import java.util.Scanner;
public class input {
 public static void main(String[] args) {
 System.out.println("enter your name:");
 Scanner obj = new Scanner(System.in);
 String user = obj.nextLine();
 System.out.println("user name:"+user);
 }
}

2. Java program to swap two numbers.
=> import java.util.*;
public class swapnum {
 public static void main(String[] args) {
 int x=12;
 int y=34;
 int z=0;
 z=x;
 x=y;
 y=z; 
 System.out.println("x:"+x);
 System.out.println("y:"+y);
 }
}

3. Java program to add two complex number.
=> class complexnum {
int real, image;
public complexnum(int r, int i)
{
this.real = r;
this.image = i;
}
public void showC()
{
System.out.print(this.real + " +i" + this.image);
}
public static complexnum add(complexnum n1,complexnum n2){
complexnum res = new complexnum(0, 0);
res.real = n1.real + n2.real;
res.image = n1.image + n2.image
return res;
}
public static void main(String arg[])
{
complexnum c1 = new complexnum(4, 5);
complexnum c2 = new complexnum(10, 5);
System.out.print("first Complex number: ");
c1.showC();
System.out.print("\nSecond Complex number: ");
c2.showC();
complexnum res = add(c1, c2);
System.out.println("\nAddition is :");
res.showC();
}
}

4. Java program to check Even or odd integers.
=> import java.util.Scanner;
public class even {
 public static void main(String[] args) {
 System.out.print("enter your number:-");
 Scanner obj = new Scanner(System.in);
 Integer number = obj.nextInt();
 if(number % 2 == 0){
 System.out.println(number+ ":number is even");
 }
 else{
 System.out.println(number+ ":number is odd");
 }
 }
}

5. java program to find largest among 3 number .
=> import java.util.Scanner;
public class largenum {
 public static void main(String[] args){
 Scanner obj = new Scanner(System.in);
 System.out.print("1 numbers:-");
 Integer num1 = obj.nextInt();
 System.out.print("2 numbers:-");
 Integer num2 = obj.nextInt();
 System.out.print("3 numbers:-");
 Integer num3 = obj.nextInt();
 
 
 int largest = ( num1 > num2 ) ? ( num1 > num3 ? num1 : num3) :(num2 > num3 ? num2 : num3);
 System.out.println("largest number is:"+largest);
 }
}

6. Java program to display all prime numbers from 1 to n.
=> public class primenum {
 public static void main(String[] args) {
 int num=9;
 boolean isprime=true;
 for(int i=2;i<=Math.sqrt(num);i++){
 if(num%i==0){
 isprime=false;
 break;
 }
 }
 System.out.println("This primenum " +num+ " is :" +isprime);
}
}

7. Java program to check whether input character is vowel and cosonant.
=> import java.util.Scanner;
public class vowel {
 public static void main(String[] args){
 System.out.print("input a character:");
 Scanner obj = new Scanner(System.in);
 char ch = obj.next().charAt(0);
 if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='o'||ch=='O'||ch=='u'||ch=='U'||ch=='i'||ch=='I'){
 System.out.println(ch+ " is vowel.");
 }
 else{
 System.out.println(ch+" “ is consonant.");
 }
 }
 }
 
8. Java program to find factorial of a number.
=> import java.util.Scanner;
public class fact {
 public static void main(String[] args) {
 Scanner obj = new Scanner(System.in);
 System.out.print("enter a factorial:");
o Integer num = obj.nextInt();
 int factorial=1;
 
 for(int i=1;i<=num;i++){
 factorial*=i;
 }
 System.out.println("factorial of "+num+ " is:"+factorial);
 }
}
 
9. Java program to find even sum of fibonacci series till number n.
=> public class fibonacci {
 public static void main(String[] args){
 int n=15,num1=0,num2=1;
 System.out.print("Fibonacci series:"+num1+","+num2);
 for(int i=2;i<n;i++){
 int num3= num1+num2;
 System.out.print(","+num3);
 num1=num2;
 num2=num3;
 }
 }
}

10. Java program to calculate simple interest.
=> import java.uitl.Scanner;
public class simpleinterest {
 public static void main(String[] args){
 Scanner obj = new Scanner(System.in);
 System.out.print("principle amount:");
 double principle=Scanner.nextdouble();
 System.out.print("rate amount:");
 double rate=Scanner.nextdouble();
 System.out.print("time :");
 double time=Scanner.nextdouble();
 double interest=(principle*rate*time)/100;
 double amount=principle+interest;
 System.out.print("simple interest:"+interest);
 System.out.print("Amount:"+amount);
 }
}

