public class IsVanila {
    public static void main(String[] args) {
        System.out.println(isVanila(new int[] {1,11,1111,1111111}));
        System.out.println(isVanila(new int[] {11,22,13,34,125}));
    }
    static int isVanila(int a[]){
        int mainDigit = a[0] %10;
        int element = 0;
        int tempDigit = 0;
        for (int i = 0; i < a.length; i++) {
            element=a[i];
            while(element !=0){
                tempDigit = element%10;
                if(mainDigit != tempDigit){
                    return 0;
                }
                element = element/10;
            }
        }
        return 1;
    }
}
