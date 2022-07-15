public class Divisible {
    public static void main(String[] args) {
        System.out.println(isDivisible(new int[] {3,3,6,36}, 3));
        System.out.println(isDivisible(new int[] {3,3,4,6,36}, 3));
        System.out.println(isDivisible(new int[] {}, 3));
    }
    static int isDivisible(int[] a,int n){
        for (int i = 0; i < a.length; i++) {
            if(a[i] % n !=0){
                return 0;
            }
        }
        return 1;
    }
}
