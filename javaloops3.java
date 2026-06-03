/*Loops Based Questions */
import java.util.Scanner;

public class javaloops3{

    public static void main( String[] args){
    //Q1->1. Print Even Numbers from 1 to N 
    //Input N and print all even numbers between 1 and N.
    Scanner in = new Scanner(System.in);
    System.out.println("q1-> Print Even Numbers from 1 to N \n Enter value of n ");
    int n = in.nextInt();
    print_even_num(n);
    /*2. Sum of Digits . Input a number and find the sum of its digits */
    System.out.println("q2-> Sum of Digits . Input a Integer number and find the sum of its digits");
    n = in.nextInt();
    System.out.println("Sum of invidual digits of "+n+" is : "+sumof_digits(n)+"\n");
    /*33. Reverse a Number Input a number and print its reverse.*/    
    System.out.println("q3-> Reverse a Number ,\nInputs a number and print its reverse.\n");
    n = in.nextInt();
    System.out.println(reversedigit(n)+"\n");
    /*4. Palindrome Number ,Check whether a number is a palindrome.*/
    System.out.println("q4-> Palindrome Number ,\nChecks whether a number is a palindrome.");
    n=in.nextInt();
    palindromechecker(n);
    /*5. Armstrong Number ,Check whether a number is an Armstrong number.*/
    System.out.println("q5-> Armstrong Number ,\nChecks whether a number is an Armstrong number.");
    n=in.nextInt();
    isarmstrong_checker(n);
    /*6. Factorial of a Number ,Find the factorial of a given number using a loop.*/
    System.out.println("q6-> Factorial of a Number ,\nFinds the factorial of a given number using a loop.");
    n=in.nextInt();
    System.out.println("factorail of "+n+" is "+cal_factorial(n)+"\n");
    /*7. Prime Number Checker ,Check whether a given number is prime or not.*/
    System.out.println("q7-> Prime Number Checker ,\nChecks whether a given number is prime or not.");
    n=in.nextInt();
    checkprime(n);
    /*8. Count Even and Odd Digits ,Input a number and count how many even and odd digits it contains.*/
    System.out.println("q8-> Count Even and Odd Digits ,\nInputs a number and count how many even and odd digits it contains.");
    n=in.nextInt();
    countdigitw_nature(n);
    /*9. Multiplication Table Generator ,Input a number and print its multiplication table up to 10 or 20.*/
    System.out.println("q9-> Multiplication Table Generator ,\nInputs a number and print its multiplication table up to 20.");
    n=in.nextInt();
    gen_table20(n); 
    /*10. Number Guessing Pattern  ,Print all numbers from 1 to N: If divisible by 3 → print "Fizz" ,If divisible by 5 → print "Buzz" ,If divisible by both → print "FizzBuzz" ,Otherwise print the number */ 
    System.out.println("10. Number Guessing Pattern  ,\nPrint all numbers from 1 to N:- \nIf divisible by 3 -> print \"Fizz\" ,If divisible by 5 -> print \"Buzz\" ,\nIf divisible by both -> print \"FizzBuzz\" ,\nOtherwise print the number ");
    n=in.nextInt();
    numguess_pattern(n);

    in.close();
    }


    public static void print_even_num(int n){
        int k = 2;
        while(k<=n){
            System.out.print( k+" ," );
            k+=2;
        }
        System.out.println("\n\n");
    }
    public static int countnum_len(int num){
        int lenofnum=0;
        for(int i =0;num>0;i++){
        lenofnum++;
        num/=10;
        }
        return lenofnum;
    }
    public static int sumof_digits(int n){
        int sumofdigits=0,sizeofnum=0;
        sizeofnum=countnum_len(n);

        for(int i =1;i<=sizeofnum;i++){
        sumofdigits+=n%10;
        n/=10;
        }
        return sumofdigits;
    }
    public static int reversedigit(int n){
        int sizeofn,revdigit=0;
        sizeofn=countnum_len(n);
        for(int i =1;i<=sizeofn;i++){
        int k = n%10;
        revdigit*=10;
        revdigit+=k;
        n/=10;
        }
        return revdigit;
    }
    public static void palindromechecker(int n){
    int revdigit1=reversedigit(n);
    if(n<0)System.out.println("Number is not a palindorme ");
    else if(n==revdigit1)System.out.println("Entered number is a palindorme");
    else System.out.println("Number is not a palindorme ");
    System.out.println("\n");
    }
    public static void isarmstrong_checker(int n){
        int ncopy1=n,armstrong_sum=0;
        for(int i=0;ncopy1>0;++i){
            int temp =ncopy1%10;
            armstrong_sum += (int)Math.pow(temp,i); //
            ncopy1/=10;
        }
        if(armstrong_sum==n)System.out.println("Given number is an Armstrong number");
        else System.out.println("Given number is not a Armstrong number");
        System.out.println("\n");
    }
    public static double cal_factorial(int n){
        double fsum=1;
        for(int i=n;i>0;i--){
         fsum*=i;
        }
        return fsum;
    }
    public static void checkprime(int n){
        boolean isprime = true;
        if(n==0||n==1)System.out.println("Enterd number is not prime\\n");
        else{
        for(int i=2;i*i<=n;i++){
        if(n%i==0)isprime=false;
        }
        if(isprime)
        System.out.println("Enterd number is prime\n");
        else System.out.println("Enter number is not prime\n");  
         } 
    }
    public static void countdigitw_nature(int n){
        int ncopy=n,oddcount=0,evencount=0;
        for(int i=0;ncopy>0;i++){
            int temp = ncopy%10;
            if((temp&1)==1)oddcount++;
            else evencount++;
            ncopy/=10; 
        }
        System.out.println("Total number of even digits in "+n+" : "+evencount);
        System.out.println("Total number of odd digits in "+n+" : "+oddcount+"\n");
    }
    public static void gen_table20(int n){
        for(int i=1;i<=20;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        System.out.println("\n");
    }
    public static void numguess_pattern(int n){
    for(int i=1;i<=n;i++){
        if(i%3==0&&i%5!=0){System.out.print("Fizz");}
        else if(i%5==0&&i%3!=0){System.out.print("Buzz");}
        else if(i%5==0&&i%3==0){System.out.print("FizzBuzz");}
        else System.out.print(i);
        
    }
    }
}