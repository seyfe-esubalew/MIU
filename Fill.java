import java.util.Arrays;

public class Fill{
    public static void main(String[] args) {
        fill(new int[] {1,2,3,4,5,5,6,4,1}, 3, 10);
    }
    static void fill(int[] a,int k,int n){
        int[] arr2 = new int[n];
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<k;j++){
                if(j<=i){
                    arr2[i] =a[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
    
}