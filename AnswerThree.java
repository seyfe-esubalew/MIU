public class AnswerThree {
    public static void main(String[] args) {
        System.out.println(answerThree(new int[] {5,4,3,2,3,4,6,1}));
    }
    static int answerThree(int[] a){
        if(a.length % 2 != 0) return 0;
        int fitstHalf = (a.length / 2);
        int secondHalf = a.length/2;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 0; i < fitstHalf; i++) {
            firstHalfSum+=a[i];
        }
        for(int j=secondHalf;j<a.length;j++){
            secondHalfSum+=a[j];
        }
        
        if(firstHalfSum == secondHalfSum){
            return 1;
        }
        else {
            return 0;
        }
    }
}
