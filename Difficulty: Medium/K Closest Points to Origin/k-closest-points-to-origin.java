//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        HashMap<int[], Integer> mp = new HashMap<>();

        // Calculate distance and store in HashMap
        for (int i = 0; i < n; i++) {
            int distance = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            mp.put(points[i], distance);
        }

        // Convert HashMap to a List of Entries and Sort by Distance
        List<Map.Entry<int[], Integer>> sortedList = new ArrayList<>(mp.entrySet());
        sortedList.sort(Comparator.comparingInt(Map.Entry::getValue));

        // Extract the first k elements
        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            res[i] = sortedList.get(i).getKey();
        }

        return res;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] points = new int[n][2];
            for (int i = 0; i < n; i++) {
                points[i][0] = scanner.nextInt();
                points[i][1] = scanner.nextInt();
            }
            Solution solution = new Solution();
            int[][] ans = solution.kClosest(points, k);

            Arrays.sort(ans, (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            });
            for (int[] point : ans) {
                System.out.println(point[0] + " " + point[1]);
            }
            System.out.println("~");
        }

        scanner.close();
    }
}
// } Driver Code Ends