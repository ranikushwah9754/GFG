//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution {
    public static String doSort(String input){
        char[] arr=input.toCharArray();
        Arrays.sort(arr);
        
        return new String(arr);

    }
    
    
    
    public ArrayList<ArrayList<String>> anagrams(String[] arr) { 
        // code here
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        
        Map<String,ArrayList<String>> map=new TreeMap<>();
        for(String st:arr){
            String sorted=doSort(st);
            
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(st);
            
        }
        
        for(Map.Entry<String,ArrayList<String>> mpEle : map.entrySet()){
            ans.add(mpEle.getValue());
            
        }
        
        return ans;
        
        
        
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline after the test case input
        while (t-- > 0) {
            String inputLine = sc.nextLine();
            String[] arr = inputLine.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.anagrams(arr);
            result.sort(Comparator.comparing(a -> a.get(0)));
            for (ArrayList<String> group : result) {
                for (String word : group) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends