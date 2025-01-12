//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxWater(int arr[]) {
        // code here
        if(arr.length<=2){
            return 0;
        }
        int MAXLEFT = arr[0];
        int MAXRIGHT = arr[arr.length-1];
        
        int i=1;
        int j=arr.length-2;
        int sum =0;
        while(i<=j){
            MAXLEFT = Math.max(MAXLEFT, arr[i]);
            MAXRIGHT = Math.max(MAXRIGHT, arr[j]);
            
            int MIN = Math.min(MAXLEFT, MAXRIGHT);
            int leftWater = MIN-arr[i];
            int rightWater = MIN-arr[j];
            
            if(MAXLEFT>MAXRIGHT){
                sum += rightWater<0?0 : rightWater;
                j--;
            }
            else{
                sum += leftWater<0?0 : leftWater;
                i++;
            }
        }
        return sum;
    }
}
