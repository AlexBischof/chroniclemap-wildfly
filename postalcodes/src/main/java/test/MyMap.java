package test;

import net.openhft.chronicle.core.values.LongValue;
import net.openhft.chronicle.map.ChronicleMap;
import net.openhft.chronicle.map.ChronicleMapBuilder;
import net.openhft.chronicle.values.Values;

import java.io.File;
import java.io.IOException;
import java.util.stream.LongStream;

/**
 * Created by bischofa on 10/05/16.
 */
public class MyMap implements AutoCloseable {

    private final ChronicleMap<LongValue, PostalCodeRange> map;
    private LongValue longValue = Values.newHeapInstance(LongValue.class);

    public MyMap(File file) throws IOException {

        //System.setProperty("chronicle.values.dumpCode", "true");

        map = ChronicleMapBuilder.of(LongValue.class, PostalCodeRange.class).entries(50).createPersistedTo(file);

        PostalCodeRange postalCodeRange = Values.newHeapInstance(PostalCodeRange.class);

        LongStream.range(1, 20).forEach(value -> {
            longValue.setValue(value);
            postalCodeRange.minCode((int) value);
            postalCodeRange.maxCode((int) (value*42));
            map.put(longValue, postalCodeRange);
        });
    }

    public PostalCodeRange get(long num) {
        longValue.setValue(num);
        return map.get(longValue);
    }

    @Override
    public void close() throws Exception {
        map.close();
    }

    public static void main(String[] args) throws Exception {
        try (MyMap myMap = new MyMap(new File("test.dat"))) {
            System.out.println(myMap.map.size());
        }
    }
}
