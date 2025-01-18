public class Main {
    public static void main(String[] args) {
        System.out.println(insertStarV2("Hello"));
        System.out.println(countX("Hexlxosxxo"));
        System.out.println(isPallindrome("hello"));
        System.out.println(removeAll("hellxxoxoxoxooooxooxooox", "x"));
        System.out.println(groupSum(0, new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 16));
    }

    public static String insertStarV1 (String str) {
        if (str.length() <= 1) {
            return str;
        }
        return insertStarV1(str.substring(0, 1)) + "*" + insertStarV1(str.substring(1));
    }
    public static String insertStarV2 (String str) {
        if (str.length() <= 1) {
            return str;
        }
        return insertStarV2(str.substring(0, str.length()/2)) + "*" + insertStarV2(str.substring(str.length()/2));
    }

    public static int countX (String str) {
        if (str.length() == 1){
            if (str.equals("x")) return 1;
            else return 0;
        }
        int recursion = countX(str.substring(0, str.length()-1));
        if (str.endsWith("x"))
            return 1 + recursion;
        else return recursion;
    }

    public static boolean isPallindrome (String str){
        if (str.length() <= 1){
            return true;
        }
        boolean checkIfFirstAndLastMatch = (str.substring(0, 1).equals(str.substring(str.length()-1)));
        return checkIfFirstAndLastMatch && isPallindrome(str.substring(1, str.length()-1));

    }

    public static String removeAll (String str, String x) {
        if (x.length() > 1) throw new IllegalArgumentException(); //Input validator. Pretend x is of CHAR type.
        if (str.isEmpty()) return "";

        if (str.substring(0, 1).equals(x)) {
            return removeAll(str.substring(1), x);
        }
        else {
            return str.substring(0, 1) + removeAll(str.substring(1), x);
        }

    }

    public static boolean groupSum(int startIndex, int[] arr, int targetSum){
        if (startIndex >= arr.length)
            if (targetSum == 0) return true;

        return groupSum(startIndex+1, arr, targetSum-arr[0]) || groupSum(startIndex + 1, arr, targetSum);
    }

}
