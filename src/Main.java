public class Main {
    public static void main(String[] args) {
        System.out.println(insertStarV2("Hello"));
        System.out.println(countX("Hexlxosxxo"));
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

    }

    public static int isPallindromeHelper (String str){
        if (str.length() <= 1) return 1;
        return 1 + isPallindromeHelper()
    }
}
