public class ResEqual {
    public static void main(String[] args) {
        System.out.println(isResEqual(new int[] {3,2,0,5,3}, 32053));
        System.out.println(isResEqual(new int[] {3,2,0,5}, 32053));
        System.out.println(isResEqual(new int[] {3,2,0,5,3,4}, 32053));
    }
    static int isResEqual(int[] a,int n){
        int number = n;
        for (int i = a.length-1; i>0; i--) {
            if(a[i] != number%10){
                return 0;
            }
            number = number /10;
        }
        return 1;
    }
}
