public class RespEqual {
    public static void main(String[] args) {
      System.out.println(respEqual(new int[] {3,2,0,5,3},  32053));
    }
    static int respEqual(int[] a,int n){
        int number = n;
        while(number != 0){
            number =number %10;
            for (int i = a.length-1; i >= 0; i--) {
                if(number != a[i]){
                    return 0;
                }
                break;
            }
            number = number/10;
        }
        return 1;
        // int resNum = 0;
        // for (int i = a.length-1; i >=0; i--) {
        //     int lastDigit = n%10;
        //     n=n/10;
        //     if(lastDigit == a[i]){
        //         resNum = 1;
        //     }
        //     else{
        //         resNum = 0;
        //         break;
        //     }
        // }
        // return resNum;
    }
}
