import java.util.Scanner;

public class HelloWorld{

    public static void main(String []args){

Scanner sc= new Scanner(System.in);
System.out.println("Enter the String:-");
String ss=sc.nextLine();

       String str=ss;
       String res="";
   
       for (int var = str.length()-1; var >=0; var--) {
        res= res+ str.charAt(var);
        res=res.toLowerCase();
        str=str.toLowerCase();
          
       }
       if (str.equals(res)){
        System.out.println("String Is Palandron");
      }else{
        System.out.println("String Is Not Palandron");
      }
    }
   
    }

