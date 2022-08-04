public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        System.out.println(sum(new int[] {1,2,3}));
    }
    static int sum(int[] a){
        int x=0;
        int y=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 ==0){
                y+=a[i];
            }else{
                x+=a[i];
            }
        }
        return x-y;
    }
}
