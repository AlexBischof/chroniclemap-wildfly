package test;

import net.openhft.chronicle.bytes.*;
import net.openhft.chronicle.values.Copyable;
import test.PostalCodeRange;

/**
 * Created by bischofa on 11/05/16.
 */
public class PostalCodeRange$$Native implements PostalCodeRange, Copyable<PostalCodeRange>, BytesMarshallable, Byteable {
  private BytesStore bs;

  private long offset;

  @Override
  public int minCode() {
    return bs.readInt(offset + 0);
  }

  @Override
  public void minCode(int _minCode) {
    bs.writeInt(offset + 0, _minCode);
  }

  @Override
  public int maxCode() {
    return bs.readInt(offset + 4);
  }

  @Override
  public void maxCode(int _maxCode) {
    bs.writeInt(offset + 4, _maxCode);
  }

  @Override
  public void copyFrom(PostalCodeRange from) {
    minCode(from.minCode());
    maxCode(from.maxCode());
  }

  @Override
  public void writeMarshallable(BytesOut bytes) {
    bytes.writeInt(bs.readInt(offset + 0));
    bytes.writeInt(bs.readInt(offset + 4));
  }

  @Override
  public void readMarshallable(BytesIn bytes) {
    bs.writeInt(offset + 0, bytes.readInt());
    bs.writeInt(offset + 4, bytes.readInt());
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
    sb.append(", minCode=").append(minCode());
    sb.append(", maxCode=").append(maxCode());
    sb.setCharAt(15, '{');
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
