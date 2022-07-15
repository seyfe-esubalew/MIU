public class StantonMeasure{
    public static void main(String[] args) {
        System.out.println(isStantonMeasure(new int[] {1,3,1,1,3,3,2,3,3,3,4}));
        System.out.println(isStantonMeasure(new int[] {3,1,1,4}));
    }
    static int isStantonMeasure(int[] a){
        int counter =0;
        int stantonMeasure = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1){
                counter++;
            }
        }
        for(int j=0;j<a.length;j++){
            if(a[j] ==counter){
                stantonMeasure++;
            }
        }
        if(stantonMeasure==0){
            return 0;
        }else{
            return 1;
        }

    }
}