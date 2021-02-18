
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {


    protected RandomsIterator randomsIterator;


    public Randoms(Integer min, Integer max) {
        randomsIterator = new RandomsIterator(min, max);

    }

    @Override
    public Iterator<Integer> iterator() {
        return randomsIterator;
    }


}

