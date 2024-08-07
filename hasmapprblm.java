
package hashmap;
import java.util.*;

public class hasmapprblm {

    public static void main(String[] args) {
        

        HashMap<String,Integer> map= new HashMap<>();
        map.put("madhu",123);
        map.put("revanth",456);
        map.put("prasanna",789);

        System.out.println("<--------------- Printing all the value below through 1st itteration --------------------->");
        for(Map.Entry<String,Integer> e :map.entrySet()){

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println("Map values before adding new entry and updating value ="+map);
        map.put("madhu", 567);
        map.put("aromal",1001);
        System.out.println("Map values after adding new entry and updating value ="+map);
        System.out.println(map.get("prasanna"));
        //map.remove("prasanna");
        //System.out.println(map);
        System.out.println("<--------------- Printing all the value below through 2nd itteration --------------------->");
        for (Map.Entry<String,Integer> iterateval : map.entrySet()) {
            iterateval.getKey();
            iterateval.getValue();
            System.out.println(iterateval.getKey());
            System.out.println(iterateval.getValue());

            
        }

        HashMap<Integer,String> map2=new HashMap<>();

        map2.put(57418,"Madhu");
        map2.put(57419,"prasanna");
        map2.put(57420,"revanth");
        map2.put(57421,"aromal");
        map2.put(57421,"deepak");
        System.out.println(map2.get(57418));

        System.out.println("<--------------- Printing all the value below through 3rd itteration --------------------->");

        for(Map.Entry<Integer,String> val :map2.entrySet()){

            System.out.println(val.getKey());
            System.out.println(val.getValue());
        }

        HashMap<Integer,String> studentval=new HashMap<>();

        studentval.put(1, "madhu");



    }
    
}
