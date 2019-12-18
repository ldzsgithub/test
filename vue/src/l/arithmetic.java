package l;

public class arithmetic {
    public static void main(String[] args) {
        String a = "qwewqe";
        StringBuilder sb = new StringBuilder();
        sb.reverse();
        String b = a.replace("q", "");
        a.indexOf("w");
        System.out.printf(b);
    }
    public int numJewelsInStones(String J, String S) {
        char[]j = J.toCharArray();
        int a = J.length();
        for (int k=0; k<j.length; k++) {
            J.replace(String.valueOf(j[k]),"");
        }

        return a-J.length();
    }
}
