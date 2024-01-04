package bitcamp.io;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedDataInputStream extends DataInputStream {

  int size;
  int cursor;
  private byte[] buffer = new byte[8192];

  public BufferedDataInputStream(String name) throws FileNotFoundException {
    super(name);
  }

  @Override
  public int read() throws IOException {
    if (cursor == size) {
      // 커서가 읽은 사이즈에 도달하면 cursor 0으로 세팅, 다시 읽음. 이때 -1이면 -1 return
      cursor = 0;
      size = super.read(buffer);
      if (size == -1) {
        return -1;
      }
    }
    return buffer[cursor++] & 0xff;
    // 주의!
    // 바이트 값으로 봤을 때 음수일 경우 int로 리턴할 때도 음수가 됨
    // 이를 방지하기 위해 앞 3byte를 0으로 처리하여 양수화시킨다.
  }

  @Override
  public int read(byte[] arr) throws IOException {
    return read(arr, 0, arr.length);
  }

  @Override
  public int read(byte[] arr, int off, int len) throws IOException {
    for (int i = off, count = 0; count < len; i++, count++) {
      int b = read();
      if (b == -1) {
        // 파일의 끝 도달했는데 한번 더 호출 ~> read(0)=-1, count=0. ~> -1 리턴해줌
        return count > 0 ? count : -1;
      }
      arr[i] = (byte) b;
    }
    return len;
  }
}
