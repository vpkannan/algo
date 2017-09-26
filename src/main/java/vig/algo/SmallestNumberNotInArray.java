import java.io.*;
import java.util.*;

class Solution {
  // function to return the smallest number not present in the array
  // array has unique non-negative numbers
  static int getDifferentNumber(int[] arr) {
    
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == i) continue;
      if(arr[i] >= arr.length) continue;
      int temp = arr[arr[i]];
      arr[arr[i]] = arr[i];
      arr[i] = temp;
      i--;
    }
    
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] != i) return i;
    }
    return arr.length;
  }

  public static void main(String[] args) {

  }

}
