//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.countNumberswith4(n);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
   public static int countNumberswith4(int n) {
 
      int ans = 0;
      int i = 1;
      while (i <= n) {
        int num = i;
        boolean isFound = false;
        while (num > 1) {
        if (isFound == false && num % 10 == 4) {
         ans++;
         isFound = true;
         }
        num /= 10;
      }
 
    i++;
   }
  return ans;
 
 }
 
}
