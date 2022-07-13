public class ContenatedSum {
    public static void main(String[] args) {
        System.out.println(checkContenatedSum(198, 2));
        System.out.println(checkContenatedSum(198, 3));
        System.out.println(checkContenatedSum(2997, 3));
        System.out.println(checkContenatedSum(2997, 2));
        System.out.println(checkContenatedSum(13332, 4));
        System.out.println(checkContenatedSum(9, 1));
    }
    public static int checkContenatedSum(int a,int n){
        int total = 0;
        int number = a;
        while(a!=0){
            int concatSum=0;
            for(int i=0;i<n;i++){
                concatSum = (concatSum *10) + a%10;
            }
            total+=concatSum;
            a=a/10;
        }
        if(total ==number){
            return 1;
        }else{
            return 0;
        }

    }
}
