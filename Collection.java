
import java.util.*;

public class Collection {
    public static void main(String[] args) {
         List<String> str=new ArrayList<>();
         str.add("Ankit");
         str.add("Ankit");
         str.add("dsavc");
         str.add("Ahgvjt");
         str.add("Ahgvjt");
         str.add("hmvjb");
         str.add("Ahvt");

        //  System.out.println(str);
          System.out.println("-----------------------");
         
         List srt=new LinkedList<>();
         srt.add("jahd");
         srt.add(45);
         srt.add(465.15);
         srt.add(true);
         srt.add(956312);
        
        //  System.out.println(srt);
        
        Set<Object> has=new HashSet<>(5);
        has.add("jahd");
        has.add(true);
        has.add(956312);
        has.add(5);
        has.add(51);
        has.add("hgnbhg");
        has.add("trtrg");
        has.add(956312);
    //    for(Object obj:has){
    //     System.out.print(obj+" ");
        

    //    }
    //    System.out.println("========= ");
    //    Set<Object> shoSet=new TreeSet<>();
    //    shoSet.addAll(str);
    //    System.out.print(shoSet+" ");

          str.set(1,"xxx" );

          Set<Object> ss =new TreeSet<>();
          ss.addAll(str);
          System.out.println(str.size()+ " "+ss);
          System.out.println("=====================");
        
          System.out.println(str.isEmpty());
        
    }
    }

