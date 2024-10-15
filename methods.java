• Java methods programs
10/1. Java program to show use of static and non-static method.
=> class statictest {
 //non-static method
 int multiply(int a,int b){
 return a*b;
 }
 //static method
 static int add(int a,int b){
 return a+b;
 }
}
public class staticmethod {
 public static void main(String[] args){
 statictest st=new statictest();
 System.out.println("2*2="+st.multiply(2,2));
 System.out.println("2+3="+statictest.add(2,3));
 }
}

2. Java program to show usage of forEach() method.
=> import java.util.ArrayList; 
import java.util.List; 
public class ForEachExample { 
 public static void main(String[] args) { 
 List<String> gamesList = new ArrayList<String>(); 
 gamesList.add("Football"); 
 gamesList.add("Cricket"); 
 gamesList.add("Chess"); 
 gamesList.add("Hocky"); 
 System.out.println("------------Iterating by passing lambda expression--------------"); 
 gamesList.forEach(games -> System.out.println(games)); 
 
 } 
}

3. Java program to show usage of toString() Method.
=> class Student1{ 
int rollno; 
String name; 
String city; 
 
Student1(int rollno, String name, String city){ 
this.rollno=rollno; 
this.name=name; 
this.city=city; 
} 
 
public String toString(){//overriding the toString() method 
 return rollno+" "+name+" "+city; 
} 
public static void main(String args[]){ 
 Student1 s1=new Student1(101,"Raj","lucknow"); 
 Student1 s2=new Student1(102,"Vijay","ghaziabad"); 
 
 System.out.println(s1);//compiler writes here s1.toString() 
 System.out.println(s2);//compiler writes here s2.toString() 
} 
} 

4. Java program to show usage of compare() method.
=> public class CompareToExample{ 
public static void main(String args[]){ 
String s1="hello"; 
String s2="hello"; 
String s3="meklo"; 
String s4="hemlo"; 
String s5="flag"; 
System.out.println(s1.compareTo(s2));//0 because both are equal 
System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m" 
System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m" 
System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f" 
}} 

5. Java program to show usage of equals() method.
=> class equalmethod {
 public static void main(String[] args) {
 String str1 = "java";
 String str2 = "java";
 
 boolean result = str1.equals(str2);
 System.out.println(result);
 }
}

6. Java program to show usage of hasNext() and next() method.
=> import java.util.*;
public class hasnextint {
 public static void main(String[] argv)
 throws Exception
 {
 String s = "gfg 2 geeks!"; 
 Scanner scanner = new Scanner(s);
 scanner.useLocale(Locale.US);
 while (scanner.hasNext()) {
 System.out.print("" + scanner.hasNextInt(3)); 
 System.out.print(" -> " + scanner.next() + "\n");
 }
 scanner.close();
 }
}