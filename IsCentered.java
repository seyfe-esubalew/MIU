public class IsCentered {
    public static void main(String[] args) {
        System.out.println(isCentered(new int[] {1,2,3,4,5}));
        System.out.println(isCentered(new int[] {3,2,1,4,5}));
        System.out.println(isCentered(new int[] {3,2,1,4,1}));
        System.out.println(isCentered(new int[] {1,2,3,4}));
        System.out.println(isCentered(new int[] {}));
        System.out.println(isCentered(new int[] {10}));
    }
    static int isCentered(int[] a){
        if(a.length%2==0) return 0;
        int middleElement = a.length /2;
        for (int i = 0; i < a.length; i++) {
            if(i == middleElement){
                continue;
            }
            if(a[i] <= a[middleElement]){
                return 0;
            }
        }
        return 1;
    }
}
