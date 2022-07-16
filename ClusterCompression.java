import java.util.Arrays;

public class ClusterCompression {
    public static void main(String[] args) {
       clusterCompression(new int[]{3,3,3,4,4,3,2,2,2,4});
    }
    static void clusterCompression(int[] a){
        int[] returnedArr = new int[a.length];
        int prevElement = a[0];
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if(prevElement == a[i]){
                continue;
            }
            else{
                returnedArr[count] = prevElement;
                prevElement =a[i];
                count++;
            }
        }
        if(prevElement != a[a.length -1]){
            returnedArr[count] = a[a.length-1];
        }
        System.out.println(Arrays.toString(returnedArr));
    }
}
