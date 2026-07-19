/*  Ques 1. Given a dynamic array A.
Return a Dynamic Array that has all even numbers from A.

Note :
Dynamic Array in JAVA: ArrayList
Dynamic Array in C++: vector
Dynamic Array in Python: List */

import java.util.ArrayList;
import java.util.*;
public class ques1 {
    static ArrayList<Integer> evenNumber(ArrayList<Integer>A){
        ArrayList<Integer>Result = new ArrayList<>();
        for(int i = 0; i<A.size(); i++){
            if(A.get(i) % 2 ==0){
                Result.add(A.get(i));
            }
        }
        return Result;
    }
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Integer> Anew = new ArrayList<>();
            for(int i=0; i<n; i++){
                Anew.add(sc.nextInt());
            }
            ArrayList<Integer> evenNumber = evenNumber(Anew);
            System.out.println(evenNumber);


        }
    }


    

