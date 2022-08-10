package Prac2;
import java.util.*;

class Practice{
    public static void main(String args[]){
        System.out.println("Choose a number from 1 to 6");
        System.out.println("Select your choice: \n 1. Factorial \n 2. Reverse of a number \n 3. Armstrong number \n 4. Palindrome \n 5.Prime Number \n 6. Fibonacci series");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int num;
        
        switch(choice){
            case 1: 
                System.out.println("Enter a number to find factorial");
                num = sc.nextInt();
                int fact = 1;

                for(int i=1; i<=num; i++){
                    fact*=i;
                }
 
                System.out.println(fact);
                break;
            

            case 2: 
                System.out.println("Enter a number to find its reverse");
                num = sc.nextInt();
                int newNum = 0;
                
                while(num>1){
                    newNum += num % 10;
                    newNum *= 10;
                    num /= 10;
                }
                newNum/=10;
                System.out.println("Reversed number is:" + newNum);
                break;


            case 3: 
                //ArmStrong number
                System.out.println("Enter a number to find if it is an Armstrong number");
                int staticNum = sc.nextInt();
                num = staticNum;
                int sum=0;
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
                break;


            case 4: 
                //Palindrome
                System.out.println("Enter a string to find if its palindrome or not");
                String str = sc.next();
                boolean flag = true;

                for(int i=0; i<str.length()-1; i++){
                    if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                        flag = false;
                        break;
                    }
                }

                if(flag==false){
                    System.out.println("String is not palindrome");
                } else {
                    System.out.println("String is palindrome");
                }
                break;


            case 5:
                System.out.println("Enter a number to find if it is prime");
                num = sc.nextInt();
                boolean indicator = true;
                
                for(int i=1; i<=num/2+1; i++){
                    if(num%i==0){
                        indicator = false;
                        break;
                    }
                }
                if(indicator==false){
                    System.out.println("It is not a prime number");
                } else {
                    System.out.println("It is a prime number");
                }
                break;


            case 6: 
                int n1=0, n2=1, temp=0;
                System.out.println("Enter the limit of fibonacci series");
                int limit = sc.nextInt();

                System.out.println(n1);
                System.out.println(n2);

                System.out.println("\n");
                for(int i=1; i<limit; i++){
                    temp = n1+n2;
                    n1 = n2;
                    n2 = temp;
                    
                    System.out.print(temp+ ", ");
                }
                break;
        }
        
    } 
}