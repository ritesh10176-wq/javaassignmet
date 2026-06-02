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
System.out