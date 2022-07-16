// public class IsIsolated {
//     public static void main(String[] args) {
//         // System.out.println(isIsolated(2));
//         // System.out.println(isIsolated(3));
//         // System.out.println(isIsolated(8));
//         // System.out.println(isIsolated(9));
//         // System.out.println(isIsolated(14));
//         // System.out.println(isIsolated(24));
//         // System.out.println(isIsolated(28));
//         // System.out.println(isIsolated(34));
//         // System.out.println(isIsolated(58));
//         System.out.println(isIsolated(63));
//         // System.out.println(isIsolated(162));
//     }
//     static int isIsolated(long n){
//         long nSquare = n*n;
//         long nQuibe = n*n*n;
        
//         long nQuibeNum = nQuibe;
//         long nSquareNum = nSquare;
//         while(nQuibeNum !=0){
//            int nsModule = (int)nSquareNum %10;
//             while(nSquareNum !=0){
//                 if(nQuibeNum % 10 == nsModule){
//                     return 0;
//                 }else{
//                     nSquareNum /=10;
//                 }
//             }
//             nSquareNum/=10;
//         }
//         return 1;
//     }
// }
