public class IsMera {
    public static void main(String[] args) {
        System.out.println(isMera(new int[] {7,9,0,10,1}));
        System.out.println(isMera(new int[] {6,10,8}));
        System.out.println(isMera(new int[] {7,6,1}));
        System.out.println(isMera(new int[] {9,10,0}));
        System.out.println(isMera(new int[] {1,1,0,8,0,9,9,1}));
    }
    static int isMera(int[] a){
        int isOne = 0;
        int isNine = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1){
                isOne++;
            }if(a[i] ==9){
                isNine++;
            }
            if(isOne>0 && isNine >0){
                return 1;
            }
        }
        if(isOne ==0 && isNine==0){
            return 1;
        }
        return 0;
    }
}
