import java.util.*;

//Even and odd
// public class HelloWorld{
//     public static void main(String args[]){

//         // System.out.println("Enter a number");
//         // Scanner scan = new Scanner(System.in);
//         // int num = scan.nextInt();
//         int num = 20;

//         if(num%2==0){
//             System.out.println("Its an even number");
//         } else {
//             System.out.println("its an odd number");
//         }

//         // scan.close();
//     }
// }






//Loops
// class HelloWorld{
//     public static void main(String args[]){
//         // int num = 5;
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int fact = 1;

//         for(int i=1; i<=num; i++){
//             fact*=i;
//         }

//         System.out.println(fact);
//         sc.close();
//     }
// }





//Fibonacci Sequence
// class HelloWorld{
//     public static void main(String args[]){
//         int n1=0, n2=1, temp=0, limit=5;

//         System.out.println(n1);
//         System.out.println(n2);

//         for(int i=1; i<limit; i++){
//             temp = n1+n2;
//             n1 = n2;
//             n2 = temp;

//             System.out.println(temp);
//         }
//     }
// }






//Amstrong number
class HelloWorld{
    public static void main(String args[]){
        int staticNum = 321;
        int num = staticNum, sum=0;
        int digit;

        while(num!=0){
            digit=num%10;
            sum += digit*digit*digit;
            num/=10;
        }

        if(sum==staticNum){
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("It is not an armstrong number");
            System.out.println(sum);
        }
    }
}







// class HelloWorld{
//     public static void main(String args[]){
//         String str = "MonnoM";
//         boolean flag = true;

//         for(int i=0; i<=str.length(); i++){
//             if(str.charAt(i)!=str.charAt(str.length()-i)){
//                 flag = false;
//                 break;
//             }
//         }

//         if(flag==false){
//             System.out.println("String is not palindrome");
//         } else {
//             System.out.println("String is palindrome");
//         }
//     }
// }