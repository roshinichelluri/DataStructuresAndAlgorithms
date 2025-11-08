public class EncodeString4 {
    public static void main(String[] args) {
        String s = "abcza";
        int d = 3;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                char c = (char) (((s.charAt(i) - 'a' - d + 26) % 26) + 'a');                 		res.append(c);
            } else {
                char c = (char) (((s.charAt(i) - 'a' + d) % 26) + 'a');
                res.append(c);
            }
        }

        System.out.println(res);
    }
}
