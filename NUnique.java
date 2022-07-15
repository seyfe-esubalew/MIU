public class NUnique {
    public static void main(String[] args) {
        System.out.println(isNunique(new int[]{7,3,3,2,4}, 6));
        System.out.println(isNunique(new int[]{7,3,3,2,4}, 10));
        System.out.println(isNunique(new int[]{7,3,3,2,4}, 11));
        System.out.println(isNunique(new int[]{7,3,3,2,4}, 8));
    }
    static int isNunique(int[] a,int n){
        int sumCounter = 0;
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<a.length;j++){
                if(j>i){
                    if(a[i] + a[j] == n){
                        sumCounter++;
                    }
                    if(sumCounter>1){
                        return 0;
                    }
                }
            }
        }
        if( sumCounter ==0){
            return 0;
        }
        return 1;
    }
}
