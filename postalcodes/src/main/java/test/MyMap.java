package test;

import net.openhft.chronicle.core.values.LongValue;
import net.openhft.chronicle.map.ChronicleMap;
import net.openhft.chronicle.map.ChronicleMapBuilder;
import net.openhft.chronicle.values.Values;

import java.io.File;
import java.io.IOException;
import java.util.stream.IntStream;

/**
 * Created by bischofa on 10/05/16.
 */
public class MyMap implements AutoCloseable {

    private final ChronicleMap<LongValue, PostalCodeRange> map;

    public MyMap(File file) throws IOException {

        map = ChronicleMapBuilder.of(LongValue.class, PostalCodeRange.class).entries(50).createPersistedTo(file);

        LongValue longValue = Values.newHeapInstance(LongValue.class);
        PostalCodeRange postalCodeRange = Values.newHeapInstance(PostalCodeRange.class);

        IntStream.range(1, 20).forEach(value -> {
            longValue.setValue(value);
            postalCodeRange.minCode(value);
            postalCodeRange.maxCode(value*42);
            map.put(longValue, postalCodeRange);
        });
    }

    public PostalCodeRange get(Object o) {
        return map.get(o);
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
