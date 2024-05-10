import java.util.*;

class Palandrom{
    public static void main(String[] args) {
        
        System.out.print("Enter the Number : ");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int output=input;
      int value=0;
        while (input>0) {
            
            int rem=input%10;
             value=(value*10)+rem;
              input=input/10;
        }
        if(value==output){
            System.out.println("Number is  a palindrome number");
        }else{
            System.out.println("Number is not a palindrome number");
        }
        }
    }
