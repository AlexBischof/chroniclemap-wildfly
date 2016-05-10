package test;

import net.openhft.chronicle.bytes.BytesIn;
import net.openhft.chronicle.bytes.BytesMarshallable;
import net.openhft.chronicle.bytes.BytesOut;
import net.openhft.chronicle.values.Copyable;
import test.PostalCodeRange;

/**
 * Created by bischofa on 10/05/16.
 */
public class PostalCodeRange$$Heap implements PostalCodeRange, Copyable<PostalCodeRange>, BytesMarshallable {
  private int __fieldminCode;

  private int __fieldmaxCode;

  @Override
  public int minCode() {
    return __fieldminCode;
  }

  @Override
  public void minCode(int _minCode) {
    this.__fieldminCode = _minCode;
  }

  @Override
  public int maxCode() {
    return __fieldmaxCode;
  }

  @Override
  public void maxCode(int _maxCode) {
    this.__fieldmaxCode = _maxCode;
  }

  @Override
  public void copyFrom(PostalCodeRange from) {
    this.__fieldminCode = from.minCode();
    this.__fieldmaxCode = from.maxCode();
  }

  @Override
  public void writeMarshallable(BytesOut bytes) {
    bytes.writeInt(minCode());
    bytes.writeInt(maxCode());
  }

  @Override
  public void readMarshallable(BytesIn bytes) {
    __fieldminCode = bytes.readInt();
    __fieldmaxCode = bytes.readInt();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof PostalCodeRange)) return false;
    PostalCodeRange other = (PostalCodeRange) obj;
    if (minCode() != other.minCode()) return false;
    if (maxCode() != other.maxCode()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;
    hashCode *= 1000003;
    hashCode ^= Integer.hashCode(minCode());
    hashCode *= 1000003;
    hashCode ^= Integer.hashCode(maxCode());
    return hashCode;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("PostalCodeRange");
    sb.append(", minCode=").append(__fieldminCode);
    sb.append(", maxCode=").append(__fieldmaxCode);
    sb.setCharAt(15, '{');
    sb.append(' ').append('}');
    return sb.toString();
  }
}
