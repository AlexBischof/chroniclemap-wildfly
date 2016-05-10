package net.openhft.chronicle.core.values;

import net.openhft.chronicle.bytes.*;
import net.openhft.chronicle.values.Copyable;

public class LongValue$$Native implements LongValue, Copyable<LongValue>, BytesMarshallable, Byteable {
    private BytesStore bs;

    private long offset;

    @Override
    public long getValue() {
        return bs.readLong(offset + 0);
    }

    @Override
    public long getVolatileValue() {
        return bs.readVolatileLong(offset + 0);
    }

    @Override
    public void setValue(long _value) {
        bs.writeLong(offset + 0, _value);
    }

    @Override
    public void setOrderedValue(long _value) {
        bs.writeOrderedLong(offset + 0, _value);
    }

    @Override
    public long addValue(long addition) {
        long oldValue = bs.readLong(offset + 0);
        long newValue = oldValue + addition;
        bs.writeLong(offset + 0, newValue);
        return newValue;
    }

    @Override
    public long addAtomicValue(long addition) {
        return bs.addAndGetLong(offset + 0, addition);
    }

    @Override
    public boolean compareAndSwapValue(long oldValue, long newValue) {
        return bs.compareAndSwapLong(offset + 0, oldValue, newValue);
    }

    @Override
    public void copyFrom(LongValue from) {
        setValue(from.getValue());
    }

    @Override
    public void writeMarshallable(BytesOut bytes) {
        bytes.writeLong(bs.readLong(offset + 0));
    }

    @Override
    public void readMarshallable(BytesIn bytes) {
        bs.writeLong(offset + 0, bytes.readLong());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LongValue)) return false;
        LongValue other = (LongValue) obj;
        if (getValue() != other.getValue()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode *= 1000003;
        hashCode ^= java.lang.Long.hashCode(getValue());
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LongValue");
        sb.append(", value=").append(getValue());
        sb.setCharAt(9, '{');
        sb.append(' ').append('}');
        return sb.toString();
    }

    @Override
    public void bytesStore(BytesStore bytesStore, long offset, long length) {
        if (length != maxSize()) {
            throw new IllegalArgumentException("Constant size is 8, given length is " + length);
        }
        this.bs = bytesStore;
        this.offset = offset;
    }

    @Override
    public BytesStore bytesStore() {
        return bs;
    }

    @Override
    public long offset() {
        return offset;
    }

    @Override
    public long maxSize() {
        return 8;
    }
}