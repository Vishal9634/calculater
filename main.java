import java.util.Scanner;
import java.util.*;
public class main{
 public static void main(String [] args)
   {  int opr;
  
     Scanner s=new Scanner(System.in);
     while(true){
     System.out.println("Enter a number to perform Arithmetic opration");
     System.out.println("1 for addition");
     System.out.println("2 for subtraction");
     System.out.println("3 for multiplication");
     System.out.println("4 for Division");
     System.out.println("5 for Exit the program");
     opr=s.nextInt();
     switch(opr)
     {
       case 1:  int a,b;
               System.out.println("Enter two number");
               a=s.nextInt();
               b=s.nextInt();
               sum c=new sum();
               System.out.println("Addition of two number is="+c.sum(a,b));
               break;
      case 2:  int a,b;
               System.out.println("Enter two number");
               a=s.nextInt();
               b=s.nextInt();
               sub c=new sub();
               System.out.println("Addition of two number is="+c.sub(a,b));
               break;
      case 3:  int a,b;
               System.out.println("Enter two number");
               a=s.nextInt();
               b=s.nextInt();
               mul c=new mul();
               System.out.println("Addition of two number is="+c.mul(a,b));
               break;
      case 4:  int a,b;
               System.out.println("Enter two number");
               a=s.nextInt();
               b=s.nextInt();
               div c=new div();
               System.out.println("Addition of two number is="+c.div(a,b));
               break;
       case 5:  System.exit(0);
       default: 
       System.out.println("Enter correct input");
     } //switch close
     } //while close
   }// main close
} //class close
