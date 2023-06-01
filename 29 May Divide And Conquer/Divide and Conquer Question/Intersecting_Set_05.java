public class Intersecting_Set_05 {
    public static boolean checkIntervalIntersection(int[][] intervals) {
        int n = intervals.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intervals[i][1] >= intervals[j][0]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {5, 7}, {2, 4}, {6, 8}};
        boolean result1 = checkIntervalIntersection(intervals1);
        System.out.println(result1 ? "Yes" : "No"); // Output : Yes

        int[][] intervals2 = {{1, 3}, {7, 9}, {4, 6}, {10, 13}};
        boolean result2 = checkIntervalIntersection(intervals2);
        System.out.println(result2 ? "Yes" : "No"); // Output : Yes
    }
}
