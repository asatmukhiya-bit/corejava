import java.util.*;
public class MINIPRO{
static Scanner sc= new Scanner(System.in);
static int max_Invalid=3;
static int attempt=0;
static void handleinvalid(){
 attempt++;
if(attempt>=max_Invalid){
  System.out.println("Sorry you reach maximum invalid attempt to run this program");
  System.exit(0);
}
else{
  System.out.println("Invalid choice! "+ (max_Invalid-attempt)+" Attempts remaining");
}
}
static  void exit(){
  System.out.println("GOODBYE! THANKS FOR USING SYSTEM");
  System.exit(0);
}
static float division(){
  System.out.println("enter your numbers");
  int a=sc.nextInt();
  int b=sc.nextInt();
  if(b==0){
    System.out.println("NOTE: Division by zero is not allowed.Retake number b:");
    b=sc.nextInt();
  }
  return (a/b);
}
static int multiply(){
System.out.println("enter your numbers");
  int a=sc.nextInt();
  int b=sc.nextInt();
  return (a*b);
}
static double addition(){
  System.out.println("enter your numbers");
  Double a=sc.nextDouble();
  Double b=sc.nextDouble();
  return a+b;
}
static double subtract(){
  System.out.println("enter your numbers");
   Double a=sc.nextDouble();
  Double b=sc.nextDouble();
  return a-b;
}
static int modulus(){
  System.out.println("enter your numbers");
   int a=sc.nextInt();
   int b=sc.nextInt();
  return a%b;
}
static void calculator(){
  boolean flag=true;
  do{
   System.out.println("\n A->DIVISION \n B->MULTIPLICATION\n C->ADDITION\n D->SUBTRACTION\n E->MODULUS\n *->TO GO BACK TO MAIN MENU\n F->EXIT");
  System.out.println("enter your choice:");
  char choice=sc.next().charAt(0);
  switch(choice){
    case 'A': System.out.println(division());break;
    case 'B': System.out.println(multiply()); break;  
    case 'C': System.out.println(addition());break;  
    case 'D':System.out.println(subtract());break;
    case 'E':System.out.println(modulus());break;
    case '*':flag=false;break;
    case 'F':exit(); break;
    default:System.out.println("Invalid choice");
  }
  if(flag!=false){
  System.out.println("---------------------------------------------------------------------------------------");
  System.out.println("DO YOU WANT TO CONTINUE(Y/N):");
  char ch=sc.next().charAt(0);
  if(ch=='n' || ch=='N'){
  break;}
  }
  }while(flag!=false);
}
static void palindrome(int a){
  int temp=a;
  int rev=0;
  while(a>0){
    int rem=a%10;
  rev=rev*10+rem;
  a=a/10;
  }
  if(temp==rev){System.out.println(temp+" is a palindrome no.");}
  else { System.out.println(temp+" is not a palindrome no.");}
}
static void evenodd(int a){
  boolean ans=(a%2==0)?true:false;
  if(ans==true) System.out.println(a+"is even no.");
  else System.out.println(a+" is odd no.");
}
static void armstrong(int a){
  int temp=a;
  int sum=0;
  while(a>0){
    int digit=a%10;
    sum+=(int)Math.pow(digit,3);
    a=a/10;
  }
  if(temp==sum) {System.out.println(temp+" is a armstrong no.");}
  else {System.out.println(temp+"is not a armstrong no.");}
}
static void digitcount(int a){
  int length=0;
  while(a>0){
    length++;
    a=a/10;
  }
  System.out.println("The length of the no is: "+length);
}
static void prime(int a){
  int count=0;
    for(int i=2;i<=(int)Math.sqrt(a);i++){
      if(a%i==0){
        System.out.println(a+"is not prime no.");
        count=1;
        break;
      }
    }
if(count==0)System.out.println(a+"is a prime no.");
}
static void number_analyzer(){
  System.out.println("lets check what's the number is:");
  int a=sc.nextInt();
  if(a<0){
    System.out.println("It's a negative no.,our system automatically generate it to a positive number.");
    a=a*-1;
  }
  boolean flag=true;
  do{
  System.out.println("\n 1->PALINDROME \n 2->EVEN/ODD\n 3->ARMSTRONG\n 4->NO'S OF DIGIT\n 5->PRIME\n 6->TO GO BACK TO MAIN MENU\n 7->EXIT");
  System.out.println("\nenter your choice");
  int choice=sc.nextInt();
  switch(choice){
    case 1:palindrome(a); break;
    case 2:evenodd(a); break;
    case 3:armstrong(a); break;
    case 4:digitcount(a); break;
    case 5:prime(a); break;
    case 6: flag=false; break;
    case 7:exit(); break;
    default:System.out.println("Invalid operation");
  }
  if(flag!=false){
  System.out.println("---------------------------------------------------------------------------------------");
  System.out.println("DO YOU WANT TO CONTINUE(Y/N):");
  char ch=sc.next().charAt(0);
  if(ch=='n' || ch=='N'){
  break;}
  }
   } while(flag!=false);
}
static void factorial(int a){
  int fact=1;
   for(int i=a;i>=1;i--){
   fact*=i;
   }
   System.out.println("\n the factorial of the "+a+" is:"+fact);
}
static void fibonacci(int a){
  int firstterm=0;
  int lastterm =1;
  for(int i=1;i<=a;i++){
    if(i==1)     System.out.println(0+" ");
    else if(i==2) System.out.println(1+" ");
    else{
      int temp=firstterm+lastterm;
      System.out.println((temp)+" ");
      firstterm=lastterm;
      lastterm=temp;
    }
  }
}
static void power(int a,int b){
  int pow=1;
  for(int i=1;i<=b;i++){
    pow*=a;
  }
  System.out.println("\n the power of the no "+a+"is:"+pow);
}
static void gcdlcm(int a,int b){
      int big=(a>b)?a:b;
      int small=(a<b)?a:b;
      for(int i=big+1;i>big;i++){
        if(i%a==0 && i%b==0){
          System.out.println("LCM OF THE NUMBERS IS:"+i);
        break;
      }
    }
      for(int i=small-1;i>1;i--){
        if(a%i==0 && b%i==0){
          System.out.println("HCF OF THE NUMBERS IS:"+i);
          break;
        }
      }
}
static void advancedmath_tools(){
  do { 
    System.out.println("\n enter your no. for the operation you wish to get\n NOTE: if you dont need second no. fill zero in it:");
    int a= sc.nextInt();
    int b=sc.nextInt();
      System.out.println("\n 1.FACTORIAL\n 2.FIBONACCI\n 3.POWER(WITHOUT MAT.pow)\n 4.GCD&LCM");
      System.out.println("enter your choice:");
      int choice = sc.nextInt();
      switch(choice){
        case 1:factorial(a); break;
        case 2:fibonacci(a); break;
        case 3:power(a,b); break;
        case 4:gcdlcm(a,b); break;
        default: System.out.println("invalid operation");
      }
  System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
  System.out.println("DO YOU WANT TO CONTINUE(Y/N):");
  char ch=sc.next().charAt(0);
  if(ch=='n' || ch=='N'){
  break;}
  } while (true);
}
static void pattern_generation(){
  boolean flag=true;
  do { 
     System.out.println("1->\n  *->Star Triangle\t  *->Reverse Star\t  *->Number Triangle\t  *->Pyramid\n  *->to go back to main menu\n 3->Press here to exit"); 
     System.out.println("enter your choice");
     char choice=sc.next().charAt(0);
     switch(choice){
      case '1': System.out.println("ENTER \n 1->STAR TRAINGLE\n 2->REVERSE STAR\n 3->NUMBER TRAINGLE\n 4->PYRAMID");
                 System.out.println("enter your choice");
                 int a=sc.nextInt();
                 switch(a){
                  case 1:System.out.println("enter the length of the traingle");
                         int b=sc.nextInt();
                           for(int i=1;i<=b;i++){
                           for(int j=1;j<=i;j++){
                           System.out.print("* ");
                           }
                            System.out.println();
                           }
                          break;
                  case 2:System.out.println("enter the length of the traingle");
                               int c=sc.nextInt();
                           for(int i=1;i<=c;i++){
                          for(int j=1;j<=c;j++){
                            if(j<i)
                             System.out.print(" ");
                             else
                              System.out.print("*");
                           }
                               System.out.println();
                           }
                           break;
                  case 3:System.out.println("enter the length of the traingle");
                              int d=sc.nextInt();  
                               for(int i=1;i<=d;i++){
                               for(int j=1;j<=i;j++){
                              System.out.print(j+" ");
                               }
                               System.out.println();
                               }break;
                  case 4:System.out.println("enter the length of the traingle");
                              int e=sc.nextInt();  
                              for(int i=5;i>=1;i--){
                               int count=5;
                              for(int j=1;j<=e;j++){
                               if(j>=i){
                                count--;
                                 System.out.print("*");
                                   }
                                   else
                                 System.out.print(" ");
                                 }
                                 for(int k=count+2;k<=5;k++){
                                 System.out.print("*");
                                 }
                                 System.out.println();
                                }break;
                  default: System.out.println("invaid choice");
                   } 
                  break;
        case '*':flag=false; break;
        case '3':exit(); break;
        default:System.out.println("Invalid choice");
        } 
                   if(flag!=false){
                     System.out.println("---------------------------------------------------------------------------------------");
                      System.out.println("DO YOU WANT TO CONTINUE(Y/N):");
                     char ch=sc.next().charAt(0);
                       if(ch=='n' || ch=='N'){
                      break;}
         }    
  } while (flag!=false);
}
public static void user_Name(String name){
  System.out.println("------------------------------------------------------------------");
  System.out.println("                WELCOME "+name+" TO SMART UTILITY SYSTEM");
  System.out.println("------------------------------------------------------------------");
}
public static void Display(){
do{
   System.out.println("MAIN MENU:");
System.out.println("\n 1. CALCULATOR\n 2. NUMBER ANALYZER\n 3. PATTERN GENERATOR\n 4. ADVANCED MATH TOOLS\n 5. EXIT");
System.out.println("\nPRESS KEY TO PERFORM OPERATION:");
int choice=sc.nextInt();
switch(choice){
  case 1:calculator(); break;
  case 2:number_analyzer(); break;
  case 3:pattern_generation(); break;
  case 4:advancedmath_tools(); break;
  case 5:exit(); break;
  default:handleinvalid(); 
}
}while(true);
}
public static void main(String[] args){
     MINIPRO obj =new MINIPRO();
     System.out.println("enter your name");
     String name=sc.nextLine();
     obj.user_Name(name);
     obj.Display();
}
}
