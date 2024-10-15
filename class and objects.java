
• Classes and objects programs
1. Java program to create a class and object.
=> class sample{
 sample(){
 System.out.println("sample is created");
 }
public static void main(String args[])
{
 sample b=new sample();
}
}

2. Java program to create an interface.
=> import java.io.*;
// A simple interface
interface In1 {
 
 // public, static and final
 final int a = 10;
 // public and abstract
 void display();
}
// A class that implements the interface.
class TestClass implements In1 {
 
 // Implementing the capabilities of
 // interface.
 public void display(){ 
 System.out.println("Geek"); 
 }
 // Driver Code
 public static void main(String[] args)
 {
 TestClass t = new TestClass();
 t.display();
 System.out.println(t.a);
 }
}

3. Java program to show inheritance in class.
=> class A {
int i,j;
 void showij(){
 System.out.println("i and j:"+i+" "+j);
 }
}
class B extends A {
 int k;
 void showk(){
 System.out.println("k :"+k);
 }
 void sum(){
 System.out.println("i+j+k:"+(i+j+k));
 }
}
class inheritance {
 public static void main(String[] args){
 A obj = new A();
 B sobj = new B();
 obj.i=10;
 obj.j=20;
 System.out.println("first class:");
 obj.showij();
 System.out.println();
 sobj.i=5;
 sobj.j=9;
 sobj.k=4;
 System.out.println("second class:");
 sobj.showij();
 sobj.showk();
 System.out.println();
 System.out.println("i,j and k sum():");
 sobj.sum();
}
}

4. Java program to show data hiding in class.
=> public class datahiding { 
 
 private int hiddenData; 
 public datahiding (int initialData) { 
 this.hiddenData = initialData; 
 } 
 public int getHiddenData() { 
 return hiddenData; 
 } 
 
 public void setHiddenData(int newData) { 
 this.hiddenData = newData; 
 } 
 public static void main(String[] args) { 
 
 datahiding myObject = new datahiding (42); 
 
 int currentData = myObject.getHiddenData(); 
 System.out.println("Initial hiddenData value: " + currentData); 
 myObject.setHiddenData(100); 
 System.out.println("Updated hiddenData value: " + myObject.getHiddenData()); 
 } 
} 

5. Java program to show polymorphism in class.
=> class polymorphism {
 public void animalSound() {
 System.out.println("The animal makes a sound");
 }
}
class Pig extends polymorphism {
 public void animalSound() {
 System.out.println("The pig says: wee wee");
 }
}
class Dog extends polymorphism {
 public void animalSound() {
 System.out.println("The dog says: bow wow");
 }
}
class Main {
 public static void main(String[] args) {
 polymorphism myAnimal = new polymorphism(); // Create a Animal object
 polymorphism myPig = new Pig(); // Create a Pig object
 polymorphism myDog = new Dog(); // Create a Dog object
 myAnimal.animalSound();
 myPig.animalSound();
 myDog.animalSound();
 }
}

6. Java program to show overloading of methods in class.
=> class overloading {
 void sum(int a,long b){
 System.out.println(a+b);
 }
 void sum(int a,int b,int c){
 System.out.println(a+b+c);
 }
 public static void main(String[] args){
 overloading obj = new overloading();
 obj.sum(20,40);
 obj.sum(20,20,20);
 }
}

7. Java program to show overriding of method in class.
=> class overriding {
 void run(){
 System.out.println(“60");
 }
class Bike extends overriding {
 void run(){
 System.out.println(“60");
 }
 public static void main(String[] args){
 Bike obj = new Bike();
 obj.run();
 }
}

8. Java program to show use of super keyword in class.
=> class Animal {
 String color="white";
}
class dog extends Animal {
 String color="red";
 void printcolor() {
 System.out.println(color);
 System.out.println(super.color);
 }
}
class superkeyword {
 public static void main(String args[]) {
 dog d = new dog();
 d.printcolor();
 }
}

9. Java program to show use of this keyword in class.
=> public class thiskeyword {
 int x;
 public thiskeyword(int x) {
 this.x = x;
 }
 public static void main(String[] args) {
 thiskeyword myObj = new thiskeyword(5);
 System.out.println("Value of x = " + myObj.x);
 }
}

