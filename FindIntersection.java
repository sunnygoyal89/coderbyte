
// Find Intersection
// Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements: the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the string false.
// Examples
// Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
// Output: 1,4,13
// Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
// Output: 1,9,10

import java.util.*; 
import java.io.*;

class Main {

  public static String FindIntersection(String[] strArr) {
    // code goes here 
    String[] arr1 = strArr[0].split(",");
     String[] arr2 = strArr[1].split(",");

    StringBuilder output = new StringBuilder("false");
    String output1 = "";
    //outerLook: 
    for(int i=0;i<arr1.length; i++) {
      
      for(int j=0; j<arr2.length;j++) {
        int a = Integer.parseInt(arr1[i].trim());
        int b = Integer.parseInt(arr2[j].trim());
        if(a==b) {
          // System.out.println(a);
          if(output1.isEmpty()) {
            output1 = String.valueOf(a);
          }else {
            output1 = String.join(",", output1, String.valueOf(a));
          }
          
          // output.append(a);
          //continue outerLook;
          break;

        } else if(b>a) {
            break;
        }

      }

    }
    return output1.isEmpty() ? "false" : output1.toString();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }

}
