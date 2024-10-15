
• Array programs
1. Java program for linear search.
=> public class LinearSearchExample{ 
public static int linearSearch(int[] arr, int key){ 
 for(int i=0;i<arr.length;i++){ 
 if(arr[i] == key){ 
 return i; 
 } 
 } 
 return -1; 
 } 
 public static void main(String a[]){ 
 int[] a1= {10,20,30,50,70,90}; 
 int key = 50; 
 System.out.println(key+" is found at index: "+linearSearch(a1, key)); 
 } 
} 

2. Java program for binary search.
=> class BinarySearchExample{ 
public static void binarySearch(int arr[], int first, int last, int key){ 
 int mid = (first + last)/2; 
 while( first <= last ){ 
 if ( arr[mid] < key ){ 
 first = mid + 1; 
 }else if ( arr[mid] == key ){ 
 System.out.println("Element is found at index: " + mid); 
 break; 
 }else{ 
 last = mid - 1; 
 } 
 mid = (first + last)/2; 
 } 
 if ( first > last ){ 
 System.out.println("Element is not found!"); 
 } 
} 
public static void main(String args[]){ 
 int arr[] = {10,20,30,40,50}; 
 int key = 30; 
 int last=arr.length-1; 
 binarySearch(arr,0,last,key); 
} 
} 

3. Java program to find the largest elements in an array.
=> public class largestelement {
 public static void main(String[] args){
 int[] arr={1,3,5,7,9};
 int largest=arr[0];
 for(int num:arr){
 if(num>largest){
 largest=num;
 }
 } 
 System.out.println("large element:"+largest);
 }
}

4. Java program to sort an array.
=> import java.util.Arrays; 
public class SortArrayExample1 
{ 
public static void main(String[] args) 
{ 
 
int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34}; 
Arrays.sort(array); 
System.out.println("Elements of array sorted in ascending order: "); 
for (int i = 0; i < array.length; i++) 
{ 
System.out.println(array[i]); 
} 
} 
} 

5. Java program to merge two array.
=> import java.util.Arrays;
public class MergeTwoArrays1 {
 public static void main(String[] args)
 {
Name:-Devanshi Kotadiya
En roll no:-2302040601053
Sub:-core java-1020406304
|14|
 int[] a = { 10, 20, 30, 40 };
 int[] b = { 50, 60, 70, 80 }; 
 int a1 = a.length; 
 int b1 = b.length; 
 int c1 = a1 + b1; 
 int[] c = new int[c1]; 
 System.arraycopy(a, 0, c, 0, a1);
 System.arraycopy(b, 0, c, a1, b1);
 System.out.println(Arrays.toString(c));
 }
}

6. Java program to copy all the elements of one array to another array.
=> public class CopyArray { 
 public static void main(String[] args) { 
 int [] arr1 = new int [] {1, 2, 3, 4, 5}; 
 int arr2[] = new int[arr1.length]; 
 for (int i = 0; i < arr1.length; i++) { 
 arr2[i] = arr1[i]; 
 } 
 System.out.println("Elements of original array: "); 
 for (int i = 0; i < arr1.length; i++) { 
 System.out.print(arr1[i] + " "); 
 } 
 System.out.println(); 
 System.out.println("Elements of new array: "); 
 for (int i = 0; i < arr2.length; i++) { 
 System.out.print(arr2[i] + " "); 
 } 
 } 
} 
Output:
7. Java program to print a 2D array.
=> class twoDArray {
 public static void main(String[] args) {
 int[][] a = {
 {1, 2, 3}, 
 {4, 5, 6, 9}, 
 {7}, 
 };
 System.out.println("Length of row 1: " + a[0].length);
 System.out.println("Length of row 2: " + a[1].length);
 System.out.println("Length of row 3: " + a[2].length);
 }
}

8. Java program to add two matrix.
=> public class MatrixAdditionExample{ 
public static void main(String args[]){ 
 
int a[][]={{1,3,4},{2,4,3},{3,4,5}}; 
int b[][]={{1,3,4},{2,4,3},{1,2,4}}; 
 
 
int c[][]=new int[3][3]; 
 
for(int i=0;i<3;i++){ 
for(int j=0;j<3;j++){ 
c[i][j]=a[i][j]+b[i][j]; 
System.out.print(c[i][j]+" "); 
} 
System.out.println();
} 
}} 

9. Java program to find the transpose.
=> public class MatrixTransposeExample{ 
public static void main(String args[]){ 
 
int original[][]={{1,3,4},{2,4,3},{3,4,5}}; 
 
int transpose[][]=new int[3][3]; //3 rows and 3 columns 
 
for(int i=0;i<3;i++){ 
for(int j=0;j<3;j++){ 
transpose[i][j]=original[j][i]; 
} 
} 
 
System.out.println("Printing Matrix without transpose:"); 
for(int i=0;i<3;i++){ 
for(int j=0;j<3;j++){ 
System.out.print(original[i][j]+" "); 
} 
System.out.println();//new line 
} 
System.out.println("Printing Matrix After Transpose:"); 
for(int i=0;i<3;i++){ 
for(int j=0;j<3;j++){ 
System.out.print(transpose[i][j]+" "); 
} 
System.out.println();//new line
} 
}} 
 

10. Java program to print boundry elements of a matrix. 
=> import java.io.*;
public class boundryelements{
public static void printBoundary(int a[][], int m,int n){
 for (int i = 0; i < m; i++) {
for (int j = 0; j < n; j++) {
 if (i == 0)
System.out.print(a[i][j] + " ");
 else if (i == m - 1)
System.out.print(a[i][j] + " ");
 else if (j == 0)
System.out.print(a[i][j] + " ");
 else if (j == n - 1)
 System.out.print(a[i][j] + " ");
 else
 System.out.print(" ");
 }
 System.out.println("");
 }
}
public static void main(String[] args){
 int a[][] = { { 1, 2, 3, 4 },
 { 5, 6, 7, 8 },
 { 1, 2, 3, 4 },
 { 5, 6, 7, 8 } };
printBoundary(a, 4, 4);
}
}
