//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        int count = 0; 
        int currSum = 0; 
        HashMap<Integer, Integer> sumMap = new HashMap<>(); 
        sumMap.put(0, 1);
        for (int num : arr) {
            currSum += num;
            if (sumMap.containsKey(currSum - tar)) {
                count += sumMap.get(currSum - tar);
            }
            sumMap.put(currSum, sumMap.getOrDefault(currSum, 0) + 1);
        }
        
        return count; 
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int tar = Integer.parseInt(br.readLine());
            Solution obj = new Solution();
            int res = obj.subArraySum(arr, tar);

            System.out.println(res);
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends