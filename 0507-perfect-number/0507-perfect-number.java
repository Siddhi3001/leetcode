class Solution {
    public boolean checkPerfectNumber(int num) {

        if (num <= 1) {
            return false;
        }
        int den=2;
        int sum=1;
        while(den<num)
        {
            if (num%den==0)
            {
                sum+=den;
            }
            den++;
        }
            if(sum==num)
            {
                return true;
            }
            else
            {
                return false;  
            }
        
        
    }
}