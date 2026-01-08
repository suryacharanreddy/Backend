/*predefined Prediacte Functional Interface
    for predefined there is no need interface .
*/
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
class PredicateThree{
    public static void main(String[]args){
        Predicate<List> p=enames->enames.isEmpty();
        System.out.println(p.test(Arrays.asList()));
    }
}