class Solution {
    public boolean isSameAfterReversals(int num) {
        String str = Integer.toString(num);
        if (str.length() == 1)
            return true;

        StringBuilder s = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            s.append(str.charAt(i));
        }
        String str2 = s.toString();
        int i = Integer.parseInt(str2);
        StringBuilder str3 = new StringBuilder(String.valueOf(i));
        str3.reverse();

        if (str.equals(str3.toString()))
            return true;
        else
            return false;
    }
}