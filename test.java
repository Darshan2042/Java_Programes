// public class test {
//     public static void main(String args[]){
//        int n = 5;
//        for(int i=0;i<n;i++){
//         for (int j=0;j<n;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//        }
//     }
// }
/*
*****
*****
*****
*****
*****
*/

// public class test{
//     public static void main(String args[]){
//         int n = 5;
//         for (int i=0;i<n;i++){
//             for (int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
/*
*
**
***
****
*****
*/


// public class test {
//     public static void main(String args[]){
//        int n =5;
//        for (int i=1;i<n;i++){
//         for (int j=1;j<=i;j++){
//             System.out.print(j);
//         }
//         System.out.println();
//        }

//     }
// }
/*
1
12
123
1234
*/

// public class test{
//     public static void main(String args[]){
//         int n =5;
//         for (int i=1;i<n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }
/*
1
22
333
4444
*/

// public class test{
//     public static void main(String args[]){
//         int n = 5;
//         for (int i=0;i<=n;i++){
//             for(int j=n ;j>i;j--){  // use this formula also  n-i+1..
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
/*
*****
****
***
**
*
*/

// public class test{
//     public static void main(String args[]){
//         int n = 5;
//         for (int i = 0;i<n;i++){
//             for (int j=1;j<n-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
/*
12345
1234
123
12
1
*/


// public class test{
//     public static void main(String args[]){
//         int n= 5;
//         for(int i=0;i<n;i++){
//             for (int j=0;j<n-i-1;j++){
//                 System.out.print(" ");
//             }

//             for (int j=0;j<2*i+1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/*
    *
   ***
  *****
 *******
*********
*/

// public class test{
//     public static void main(String args[]){
//         int n= 5;
//         for(int i=0;i<n;i++){
//             for (int j=0;j<i;j++){
//                 System.out.print(" ");
//             }

//             for (int j=0;j<2*(n-i)-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/*
*********
 *******
  *****
   ***
    *
*/


// public class test {
//     public static void main(String args[]){
//         int n =5;
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n-1;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
/*
*
**
***
****
*****
****
***
**
*
*/

// public class pratice{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n-1;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/