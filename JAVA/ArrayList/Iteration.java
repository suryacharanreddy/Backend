import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
class Iteration{
    public static void main(String []args){
        List<String> enames=new ArrayList<String>();
        enames.add("Rg");
        enames.add("SG");
        enames.add("PG");
        enames.add("Modi");
        System.out.println(enames);
        Iterator itr=enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collections.sort(enames);
        System.out.println(enames);
    }
}