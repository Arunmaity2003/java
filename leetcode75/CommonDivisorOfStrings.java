
class CommonDivisorOfStrings {

    public static String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            gcdOfStrings(str2, str1);
        }

        if (str2.equals(str1)) {
            return str1;
        }
        if (str1.startsWith(str2)) {
            return str2;
        }

        return "No match";
    }

    public static void main(String[] args) {
        String s1 = "ABABAB";
        String s2 = "abc";
        System.out.println(gcdOfStrings(s1, s2));
    }
}
