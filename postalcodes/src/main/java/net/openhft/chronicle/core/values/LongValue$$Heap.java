package net.openhft.chronicle.core.values;

import net.openhft.chronicle.bytes.BytesIn;
import net.openhft.chronicle.bytes.BytesMarshallable;
import net.openhft.chronicle.bytes.BytesOut;
import net.openhft.chronicle.core.Jvm;
import net.openhft.chronicle.values.Copyable;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by bischofa on 10/05/16.
 */
public class LongValue$$Heap implements LongValue, Copyable<LongValue>, BytesMarshallable {
  private static final Unsafe UNSAFE;

  private static final long valueOffset;

  static {
    try {
      Field theUnsafe = Jvm.getField(Unsafe.class, "theUnsafe");
      UNSAFE = (Unsafe) theUnsafe.get(null);
      valueOffset = UNSAFE.objectFieldOffset(Jvm.getField(LongValue$$Heap.class, "__fieldvalue"));
    } catch (IllegalAccessException e) {
      throw new AssertionError(e);
    }
  }

  private long __fieldvalue;

  @Override
  public long getValue() {
    return __fieldvalue;
  }

  @Override
  public long getVolatileValue() {
    return UNSAFE.getLongVolatile(this, valueOffset);
  }

  @Override
  public void setValue(long _value) {
    this.__fieldvalue = _value;
  }

  @Override
  public void setOrderedValue(long _value) {
    UNSAFE.putOrderedLong(this, valueOffset, _value);
  }

  @Override
  public long addValue(long addition) {
    long _value = __fieldvalue + addition;
    __fieldvalue = _value;
    return _value;
  }

  @Override
  public long addAtomicValue(long addition) {
    return UNSAFE.getAndAddLong(this, valueOffset, addition) + addition;
  }

  @Override
  public boolean compareAndSwapValue(long oldValue, long newValue) {
    return UNSAFE.compareAndSwapLong(this, valueOffset, oldValue, newValue);
  }

  @Override
  public void copyFrom(LongValue from) {
    this.__fieldvalue = from.getValue();
  }

  @Override
  public void writeMarshallable(BytesOut bytes) {
    bytes.writeLong(getValue());
  }

  @Override
  public void readMarshallable(BytesIn bytes) {
    __fieldvalue = bytes.readLong();
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
    hashCode ^= Long.hashCode(getValue());
    return hashCode;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("LongValue");
    sb.append(", value=").append(__fieldvalue);
    sb.setCharAt(9, '{');
    sb.append(' ').append('}');
    return sb.toString();
  }
}
