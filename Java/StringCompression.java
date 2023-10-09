public class StringCompression {
    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
        System.out.println(sc.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }

    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder(String.valueOf(chars[0]));
        int freq = 1;
        int j = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == s.charAt(j)) {
                freq++;
            } else {
                if (freq > 1) {
                    s.append(freq);
                    j += String.valueOf(freq).length();
                }
                freq = 1;
                s.append(chars[i]);
                j++;
            }
        }
        if (freq > 1) {
            s.append(freq);
            j += String.valueOf(freq).length();
        }
        for (int i = 0; i <= j; i++) {
            chars[i] = s.charAt(i);
        }
        return j + 1;
    }
}
