public class IsFancy {
    public static void main(String[] args) {
        System.out.println(isFancy(new int[] {1,1,5,17,61}));
    }
    static int isFancy(int[] a){
        if(a[0] !=1 || a[1] !=1) return 0;
        for (int i = 2; i < a.length; i++) {
            if(3 * a[i-1] + 2 * a[i-2] != a[i]){
                return 0;
            }
        }
        return 1;
    }
}
