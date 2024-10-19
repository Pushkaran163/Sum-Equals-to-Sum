import java.util.*;
// import java.io.*;

public class Java{

    class pair{
        int first, second;
        pair(int f, int s){
            this.first = f;
            this.second = s;
        }
    };

    boolean findPair(int[] arr){
        HashMap<Integer, pair> map = new HashMap<Integer, pair>();
        int n  = arr.length;

        for(int i=0; i<n;++i){
            for(int j=i+1;j<n;++j){
                int sum = arr[i] + arr[j];
                if(!map.containsKey(sum)){
                    map.put(sum,new pair(i, j));
                }
                else{
                    pair p = map.get(sum);
                    System.out.println("("+arr[p.first]+", "+arr[p.second]+
                                      ") and ("+arr[i]+", "+arr[j]+")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int arr[] = {3, 4, 7, 1, 2, 9, 8};
        Java a = new Java();
        a.findPair(arr);
    }
}