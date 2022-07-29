public class nswerOne {
    public static void main(String[] args) {
        System.out.println(answerOne(50));
    }
    static int answerOne(int n){
        for(int i=1;i<n;i++){
            for(int j=n;j>0;j--){
                if(i*i + j*j == n && j *j + j*j == n){
                    return 1;
                }
            }
        }
        return 0;
    }
}
