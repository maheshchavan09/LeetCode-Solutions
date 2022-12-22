class Solution {
    public String defangIPaddr(String address) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)!='.')
            {
                s.append(address.charAt(i));
            }
            else
            {
                s.append('[');
                s.append('.');
                s.append(']');
            }
        }

        String res = s.toString();
        return res;
        
    }
}