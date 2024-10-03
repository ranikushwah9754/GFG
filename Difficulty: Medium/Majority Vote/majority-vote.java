//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String part : parts) {
                nums.add(Integer.parseInt(part));
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        List<Integer>res=new ArrayList<>();
        int cand1=0,cand2=0,count1=0,count2=0;
        for(int num:nums){
            if(num==cand1)count1++;
            else if(num==cand2)count2++;
            else if(count1==0){
                cand1=num;
                count1=1;
            }
            else if(count2==0){
            cand2=num;
            count2=1;
            }else{
                count1--;
                count2--;
            }
        }
      
        count1=0;count2=0;
        for(int num:nums){
            if(num==cand1)count1++;
            else if(num==cand2)count2++;
        }
        int n=nums.size();
        if(count1>n/3)res.add(cand1);
        if(count2>n/3)res.add(cand2);
        if(res.isEmpty())res.add(-1);
        return res;
    }
}
