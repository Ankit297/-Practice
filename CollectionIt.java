import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIt {
     public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
           list.add("Ankit");
           list.add("Ajay");
           list.add("amit");
           list.add("Sanbj");
           list.add("Vanas");
// Foreach
        //    for(String name:list){
        //     System.out.println(name+"\t"+name.length());
        //     StringBuffer ss=new StringBuffer(name);
        //     System.out.println(ss.reverse()+"\t");
        //    }
           System.out.println("--------");

           //Itreator
            Iterator<String> itr = list.iterator();
             while (itr.hasNext()) {
                  String stt=itr.next();
                  System.out.println(stt);
             }
            

     }
}
