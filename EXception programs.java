• Execption and error programs
1. Java program to show runtime exceptions.
=> public class runtimeerror{
public static void main(String[] args){
 System.out.println("1.Runtime Error Execption:");
 try{
 int[] arr=new int[5];
 arr[10]=50;
 }catch(RuntimeException e){
 System.out.println("caught Runtime EXecption:");
}
}
}

2. Java program to show types errors.
=> public class typeserror{
 public static void main(String[] args){
System.out.println("2. Types of error");
System.out.println("Runtime error");
System.out.println("complietime error");
System.out.println("logical error");
}
}

3. Java program to handle the execption hierarchies.
=> public class Exceptionhierarchies{ 
 public static void main(String args[]){ 
 try{ 
 int data=100/0; 
 }catch(ArithmeticException e){System.out.println(e);} 
 //rest code of the program 
 System.out.println("rest of the code..."); 
 } 
} 

4. Java program to handle the exception method.
=> class methodException { 
public static void main(String[] args) 
{ 
 int chocolates[] = { 106, 145, 123, 127, 125 }; 
 int students[] = { 35, 40, 0, 34, 60 }; 
 int numChoc[] = new int[5]; 
 try { 
 for (int i = 0; i < 5; i++) { 
 numChoc[i] = chocolates[i] / students[i]; 
} 
} 
 catch (ArithmeticException error) { 
System.out.println("Arithmetic Exception"); 
System.out.println(error.getMessage()+ " error."); 
} 
} 
}

5. Java program to handle the checked exception. 
=> import java.io.*;
import java.util.*;
class checkedexception {
 public static void main(String[] args)
throws FileNotFoundException{
FileInputStream GFG = null;
try {
 GFG = new FileInputStream("/home/mayur/GFG.txt");
 }
catch (FileNotFoundException e) {
 System.out.println("File does not exist");
}
 }
}

6. Java program to handle the unchecked exception.
=> import java.io.*;
import java.util.*;
class uncheckedexception {
 public static void main(String[] args)
throws FileNotFoundException{
FileInputStream GFG = null;
try {
 GFG = new FileInputStream("/home/mayur/GFG.txt");
 }
catch (FileNotFoundException e) {
 System.out.println("unchecked file");
}
 }
}

7. Java program to handle divide by zero and multiple exceptions.
=> import java.io.*;
class dividezero {
 public static void main(String[] args)
 {
int a = 6;
int b = 0;
System.out.print(a / b); 
 }
}

8. Java program to show thread interface and memory consistency error.
=> import java.io.*;
import java.util.*;
class therad {
 public static void main(String[] args)
throws FileNotFoundException{
FileInputStream GFG = null;
try {
 GFG = new FileInputStream("/home/mayur/GFG.txt");
 }
catch (FileNotFoundException e) {
 System.out.println("thread exception.");
}
 }
}
