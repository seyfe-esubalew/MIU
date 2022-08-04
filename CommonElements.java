
public class CommonElements {
    public static void main(String[] args) {
      System.out.println(commonElements(new int[] {1,8,3,2}, new int[] {4,2,4,1}));
      System.out.println(commonElements(new int[] {1,8,3,2,6}, new int[] {4,2,4,1}));
    }
    static int[] commonElements(int[] a1, int[] a2){
        int counter = 0;
        int commonArr;
        if(a1.length > a2.length){
            commonArr=a2.length;
        }else{
            commonArr=a1.length;
        }
        int[] newArr = new int[commonArr];
        for (int i = 0; i < a1.length; i++) {
            for(int j=0;j<a2.length;j++){
                if(a1[i] == a2[j]){
                    newArr[counter] = a2[j];
                    counter++;
                }
            }
        }
        int[] newReturnedArray = new int[counter];
        for(int i=0;i<newReturnedArray.length;i++){
            newReturnedArray[i] = newArr[i];
        }
        return newReturnedArray;
    }
}
