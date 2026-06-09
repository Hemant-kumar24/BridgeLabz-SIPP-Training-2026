public class PallindromeNumber {
    public boolean isPalindrome(int x) {
        int sum=0;
        if(x<0){
            return false;
        }
        int rev;
        int temp=x;
        while(x>0){
            rev=x%10;
            sum=sum*10+rev;
            x=x/10;
        }
        if (temp==sum){
            return true;
        }
        else{
            return false;
        }
    
    }

}
