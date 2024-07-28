//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String str) {
          // Create a LinkedHashSet to maintain the order of characters
        Set<Character> charSet = new LinkedHashSet<>();
        
        char[] chars = str.toCharArray();
        
        for (char c : chars) {
            charSet.add(c);
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }
        
        return result.toString();
    

    }
}