//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            int n = Integer.parseInt(s);
            String S = br.readLine();
            String[] s1 = S.split(" ");
            List<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a.add(Integer.parseInt(s1[i]));
            }
            Solution ob = new Solution();
            int ans = ob.findPeakElement(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
     public int findPeakElement(List<Integer> a) {
        
        int l=0, n=a.size(), r=n-1;
        
        while(l<r){
            int middle = l+(r-l)/2;
            
            if(a.get(l)<=a.get(middle)){
                if(a.get(middle)<a.get(middle+1)){
                    l=middle+1;
                }else{
                    r=middle;
                }
            }else{
                r=middle;
            }
        }
        
        return a.get(l);
    }
}

