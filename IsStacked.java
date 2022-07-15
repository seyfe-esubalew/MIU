public class IsStacked {
    public static void main(String[] args) {
        System.out.println(isStacked(1));
        System.out.println(isStacked(3));
        System.out.println(isStacked(6));
        System.out.println(isStacked(10));
        System.out.println(isStacked(15));
        System.out.println(isStacked(7));
        System.out.println(isStacked(8));
        System.out.println(isStacked(9));
    }
    static int isStacked(int n){
        int sum=0;
        for(int i=1; i<=n;i++){
            sum=sum+i;
            if(sum==n){
                return 1;
            }
            if(sum>n){
                return 0;
            }
        }
        return 0;
    }
}
