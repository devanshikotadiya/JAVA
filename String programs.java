• String programs
1. Java program to get character from the given string.
=> import java.util.Scanner;
public class index {
public static void main(String[] args){
 Scanner obj = new Scanner(System.in);
 System.out.println("enter any string:");
 String str= obj.nextLine();
 System.out.println("Enter the index of the chracter:");
 Integer index=obj.nextInt();
 if(index >= 0 && index < str.length()){
 System.out.println("character at index"+index+":"+str.charAt(index));
 }
 else{
 System.out.println("invalid index.");
 }
}
}

2. Java program to reverse a string using stacks.
=> public class reveresestring {
 public static void main(String[] args){
 String str="Devanshi";
 StringBuilder reversed=new StringBuilder(str).reverse();
 System.out.println(reversed);
 }
}
 
3. Java program to sort a string.
=> import java.util.Arrays;
public class sortstring {
 public static void main(String[] args){
 String str="rensi";
 char array[]=str.toCharArray();
 Arrays.sort(array);
 str=new String(array);
 System.out.println(str);
 }
}

4. Java program swapping pair of character.
=> import java.util.*;
import java.lang.*;
import java.io.*;
class swappingpair {
 public static void main(String[] args){
 String name="rensi";
 char arr[]=name.toCharArray();
 char temp;
 for(int i=0;i<arr.length-1;i+=2){
 temp=arr[i];
 arr[i]=arr[i+1];
 arr[i+1]=temp;
 }
 System.out.println(arr);
 }
}

5. Java program to check whether the given string is pangram.
=> class pangram {
 static int size = 26;
 static boolean isLetter(char ch){
 if (!Character.isLetter(ch)){
return false;
return true;
 }
 static boolean allLetter(String str,int len){
str = str.toLowerCase();
boolean[] present = new boolean[size];
for (int i = 0; i < len; i++) {
 if (isLetter(str.charAt(i))) {
int letter = str.charAt(i) - 'a';
present[letter] = true;
}
 }
 for (int i = 0; i < size; i++) {
if (!present[i])
 return false;
}
return true;
}
 public static void main(String args[])
 {
String str = "Abcdefghijklmnopqrstuvwxyz";
int len = str.length();
if (allLetter(str, len))
 System.out.println(str+":This is a pangram.");
else
 System.out.println(str+":This is a Not pangram.");
}
}

6. Java program to remove leading zeros.
=> import java.util.Arrays;
import java.util.List;
class removeleading {
 public static String removeZero(String str){
 int i = 0;
 while (i < str.length() && str.charAt(i) == '0')
i++;
StringBuffer sb = new StringBuffer(str);
sb.replace(0, i, "");
return sb.toString();
}
 public static void main(String[] args){
String str = "00000123569";
str = removeZero(str);
System.out.println(str);
}
} 

7. Java program to compare two strings.
=> class comparestr {
 public static void main(String[] args){
 String first = "java programing";
 String second = "java programing";
 String third = "python programing";
 boolean result1=first.equals(second);
 System.out.println("string first and second are equal:"+result1);
 boolean result2=first.equals(third);
 System.out.println("string first and third are equal:"+result2);
 }
}

8. Java program to compare two strings lexicographically.
=> import java.lang.*;
public class comparelexicographically {
 public static void main(String[] args) {
 String str1 = "tutorials", str2 = "point";
 int retval = str1.compareTo(str2);
 if (retval < 0) {
 System.out.println("str1 is greater than str2");
 } else if (retval == 0) {
 System.out.println("str1 is equal to str2");
 } else {
 System.out.println("str1 is less than str2");
 }
 }
}

9. Java program to insert a string into another string.
=> import java.lang.*;
public class onestrtoanotherstr {
 public static void main(String[] args) {
 String str = "i made using";
 String newSub = "java ";
 int index = 6;
 System.out.println("first String = " + str);
 System.out.println("Index no inserted = " + index);
 StringBuffer resString = new StringBuffer(str);
 resString.insert(index + 1, newSub);
 System.out.println("Resultant String = "+resString.toString());
 }
}

10. Java program to splitting into a number of sub-strings.
=> public class splitstr {
 public static void main(String[] arg) {
 String str = "dev:an:shi";
 String[] arrOfStr = str.split(":");
 for (String a : arrOfStr) {
 System.out.println(a);
 }
 }
}