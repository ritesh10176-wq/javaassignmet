import java.util.Scanner;
public class q1 {
// Data Type Programs
// q1-> Write a program to declare and display all primitive data types (byte, short, int, long, float, double, char, boolean).
    /**
     * @param args
     */
    public static void main(String[] args){

    byte var1=  2; //->size 1 byte
    short var2= 2; //->size 2 byte
    int var3 =  2; //->size 4 byte
    long var4=  2L; //->size 8 byte

    float var5= 2f;//->size 4 byte
    double var6=2.0;//->size 8 byte
    
    char var7 = 'a';//->size 1 byte
    boolean var8= true ;//->size 1 bit

    System.out.println("\nvar1 =" + var1 + "\n, var2 ="+ var2  + "\n, var3 ="+ var3  + "\n, var4 ="+ var4 + "\n, var5 ="+ var5 + "\n, var6 ="+ var6 + "\n, var7 ="+ var7+ "\n, var8 ="+ var8 );


System.out.println();
System.out.println();
System.out.println();

// q2-> Write a program to take an integer input from the user and display its square and cube.

Scanner numins = new Scanner(System.in);
System.out.println("Enter number to print its square and cube ");
int num = numins.nextInt();
int sqr,cub;
sqr=num*num;
cub=num*num*num;
System.out.println("Square of entered Number => "+sqr+"\nCube of entered number =>"+cub);

System.out.println();
System.out.println();
System.out.println();



//q3-> Write a program to store your name, age, and percentage using appropriate data types and display them.

Scanner stringins = new Scanner(System.in);
System.out.println("Enter your name : ");
String storename0 = stringins.nextLine();
System.out.println("Enter your age");
int age0=numins.nextInt();
System.out.println("Enter your percentage");
int percentage0=numins.nextInt();

System.out.println();
System.out.println("STORED YOUR DATA \n");
System.out.println("Your name ->"+storename0+"\n Your age ->"+age0+"\nYour percentage ->"+percentage0);


System.out.println();
System.out.println();
System.out.println();


//q4-> Write a program to swap two numbers using a third variable.
int numx,numy,tmp;
System.out.println("Enter two numbers num x and num y respectively : ");
numx=numins.nextInt();
numy=numins.nextInt();
tmp=numx;
numx=numy;
numy=tmp;
System.out.println("Given numbers are swapped \nnumx = "+numx+"\nnumy = "+numy);

System.out.println();
System.out.println();
System.out.println();

//operators based question
// q->5 Write a program to perform all arithmetic operations (+, -, *, /, %) on two numbers.
System.out.println("This is a simple calculator\n");
int numcacl1,numcacl2;
String optr;
boolean running = true;
while (running) {
    System.out.println("Enter your number : ");
    numcacl1=numins.nextInt();
    System.out.println("Select your operation (+, -, *, /, %) or press 0e to EXIT");
    optr=stringins.nextLine();
    System.out.println("Enter your number : ");
    numcacl2=numins.nextInt();
    switch(optr){
        case "+" : System.out.println("="+(numcacl1+numcacl2)+"\n"); 
                 break;
        case "-" : System.out.println("="+(numcacl1-numcacl2)+"\n"); 
                 break;  
        case "*" : System.out.println("="+(numcacl1*numcacl2)+"\n"); 
                 break;     
        case "/" : System.out.println("="+(numcacl1/numcacl2)+"\n"); 
                 break;           
        case "%" :System.out.println("="+(numcacl1%numcacl2)+"\n"); 
                 break;       
        case "0e" :System.out.println("program ENDS");
                  running=false;    
                  break;      
                
        default  :System.out.println("Input selection is Invalid !\nplease select the operator as required  ");
    }System.out.println("\n");

}
System.out.println();
System.out.println();
System.out.println();

//q->6 Write a program to calculate the area and perimeter of a rectangle using operators.

 System.out.println("The following code calculates area of rectangle");
 System.out.println("Enter length and width of rectangle respectively \n");
 int rLen = stringins.nextInt();
 int rWid = stringins.nextInt();
System.out.println("Area of rectangle ->"+(rLen*rWid)+"\nperimeter -> "+(2*(rLen+rWid)));

System.out.println("\n");
System.out.println("\n");
System.out.println("\n");

//q->7 Write a program to check whether a number is even or odd using the modulus operator.
System.out.println("The following program will identify nature of a given number\n");
int identnum = numins.nextInt();
if(identnum%2==0)System.out.println("Number is Even\n"); 
else System.out.println("NUmber is odd\n");

System.out.println();
System.out.println();
System.out.println();


//q->8 Write a program to find the largest of two numbers using the relational operator and if statement.
System.out.println("The following program Identifies largest of two number");
System.out.println("Enter any two numbers respectively \n");
int numl1 = numins.nextInt();
int numl2 = numins.nextInt();
if(numl1>numl2)System.out.println( numl1 + " is greater");
else System.out.println(numl2+"is greater");

System.out.println();
System.out.println();
System.out.println();

// q->9 Write a program to calculate the percentage of 5 subjects and display whether the student passed or failed (pass marks = 40%).
System.out.println("The following program verifies a student's pass/fail status");
    
int i=0, sum=0;
float student_percentage=0.f;
while(i<5){
    System.out.println("Enter your marks for subject "+(i+1)+":");
    int temp = numins.nextInt();
    sum+=temp;
    i++;
}
student_percentage= (sum/5.0f)*100;
if(student_percentage>=40.0f)  //  x.0**"f"**     is necessary to wirte since java is expanding lanuguage 
System.out.println("pass");
else System.out.println("fail");
}

}