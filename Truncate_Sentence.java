class Solution {
    public String truncateSentence(String s, int k) {
        String str[] = s.split(" ");
        String str2[] = new String[k];
        for (int i = 0; i < k; i++) {
            str2[i] = str[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2[0]);
        for (int i = 1; i < str2.length; i++) {
            sb.append(" " + str[i]);
        }
        return sb.toString();
    }
}