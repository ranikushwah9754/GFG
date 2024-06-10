//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(n, nuts, bolts);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static char[] order = { '!', '#', '$', '%', '&', '*', '?', '@', '^' };

    void matchPairs(int n, char[] nuts, char[] bolts) {
        int[] nutsCount = new int[order.length];
        int[] boltsCount = new int[order.length];
        for (char nut : nuts) {
            int index = getIndex(nut);
            if (index != -1) {
                nutsCount[index]++;
            }
        }
        for (char bolt : bolts) {
            int index = getIndex(bolt);
            if (index != -1) {
                boltsCount[index]++;
            }
        }
        int index = 0;
        for (int i = 0; i < order.length; i++) {
            while (nutsCount[i] > 0) {
                nuts[index++] = order[i];
                nutsCount[i]--;
            }
        }

        index = 0;
        for (int i = 0; i < order.length; i++) {
            while (boltsCount[i] > 0) {
                bolts[index++] = order[i];
                boltsCount[i]--;
            }
        }
    }

    static int getIndex(char ch) {
        for (int i = 0; i < order.length; i++) {
            if (order[i] == ch) {
                return i;
            }
        }
        return -1;  
    }
}