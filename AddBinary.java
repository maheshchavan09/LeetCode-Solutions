class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry=0;
        StringBuilder sb = new StringBuilder();

        while(i>=0||j>=0)
        {
            int num1=0;
            int num2=0;

            if(i>=0)
                num1=Character.getNumericValue(a.charAt(i));
            
            if(j>=0)
                num2=Character.getNumericValue(b.charAt(j));
            
            int k=num1+num2+carry;

            int c = k%2;

            carry= k/2;

            sb.append(c);

            i--;
            j--;
        }
        if(carry!=0)
            sb.append(carry);
        
        return sb.reverse().toString();

    }
}
