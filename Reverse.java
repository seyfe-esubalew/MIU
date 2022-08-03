public class Reverse{
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
    static int reverse(int n){
        if(n==0) return 0;
        int output=0;
        
        while(n!=0){
            output = (output * 10) + n%10;
            n=n/10;
        }
        return output;
    }
}