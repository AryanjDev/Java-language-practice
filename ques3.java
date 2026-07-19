/* Given an array A[] and an element B.
Return Count of element which are greater than B. */

import java.util.*;
public class ques3 {
  static int element(int []A, int B){
    int count = 0;
    for(int i = 0; i < A.length; i++){
      if(A[i] > B){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int []arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    System.out.print(element(arr,x));

  }
}
