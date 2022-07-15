public class SumFactor {
    public static void main(String[] args) {
        System.out.println(sumFactor(new int[] {1,2,3,4}));
        System.out.println(sumFactor(new int[] {3,0,2,-5,0}));
        System.out.println(sumFactor(new int[] {1}));
    }
    static int sumFactor(int[] a){
        int occurenceCouner = 0;
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        for(int j=0;j<a.length;j++){
            if(a[j] == sum){
                occurenceCouner++;
            }
        }
        return occurenceCouner;
    }
}
