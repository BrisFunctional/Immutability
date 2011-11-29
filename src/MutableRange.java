import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MutableRange {

    public static void main(String... args){

        System.out.println(
                makeRangeMutably(10)
        );

        System.out.println(
                makeRangeImmutably(10)
        );

    }

    private static List<Integer> makeRangeMutably(int range) {

        List<Integer> integerList = new LinkedList<Integer>();

        for ( int i=0; i<range; i++ ){
            integerList.add(i);
        }

        return integerList;
    }

    private static List<Integer> makeRangeImmutably(int range){
        return makeRangeRecursively(range, Collections.unmodifiableList(new LinkedList<Integer>()));
    }
    private static List<Integer> makeRangeRecursively(int range, List<Integer> accumulator){

        if (range > 0) {
            return makeRangeRecursively(range-1, cons(range-1, accumulator));

        } else {
            return accumulator;
        }
    }

    private static List<Integer> cons(int i, List<Integer> a){
        List<Integer> l = new LinkedList<Integer>();
        l.add(i);
        l.addAll(a);
        return Collections.unmodifiableList(l);
    }
}
