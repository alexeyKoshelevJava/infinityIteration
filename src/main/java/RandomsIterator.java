import java.util.Iterator;
import java.util.Random;

public class RandomsIterator implements Iterator<Integer> {


    private Random random;
    private Integer max;
    private Integer min;
    private int value;


    public RandomsIterator(Integer min, Integer max) {
        this.max = max;
        this.min = min;
        random = new Random();
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            value = random.nextInt((max - min) + 1);
            value += min;
            return value;
        } else {
            return 0;
        }
    }
}

