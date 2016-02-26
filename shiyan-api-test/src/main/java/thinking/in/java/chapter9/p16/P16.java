package thinking.in.java.chapter9.p16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/2/26.
 */
public class P16 implements Readable{
    /**
     * Attempts to read characters into the specified character buffer.
     * The buffer is used as a repository of characters as-is: the only
     * changes made are the results of a put operation. No flipping or
     * rewinding of the buffer is performed.
     *
     * @param cb the buffer to read characters into
     * @return The number of {@code char} values added to the buffer,
     * or -1 if this source of characters is at its end
     * @throws java.io.IOException              if an I/O error occurs
     * @throws NullPointerException             if cb is null
     * @throws java.nio.ReadOnlyBufferException if cb is a read only buffer
     */
    @Override
    public int read(CharBuffer cb) throws IOException {

        return a.f();
    }
    A a;
    public P16(A a){
        this.a = a;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(new P16(new A()));
    }
}

class A{
    char f(){
        return new Character('d');
    }
}