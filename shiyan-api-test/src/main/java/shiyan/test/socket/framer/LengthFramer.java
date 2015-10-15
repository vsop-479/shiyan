package shiyan.test.socket.framer;

import java.io.*;

/**
 * Created by Administrator on 2015/10/15.
 */
public class LengthFramer implements Framer {
    public static final int MAXMESSAGELENGTH = 65535;
    public static final int BYTEMASK = 0xff;
    public static final int SHORTMASK = 0xffff;
    public static final int BYTESHIFT = 8;
    private DataInputStream in;
    public LengthFramer(InputStream in){
        this.in = new DataInputStream(in);
    }

    @Override
    public void frameMsg(byte[] message, OutputStream out) throws IOException {
        if(message.length > MAXMESSAGELENGTH){
            throw new IOException("message too long");
        }
        //先写两个字节的消息长度
        out.write((message.length >> BYTESHIFT) & BYTEMASK);
        out.write(message.length & BYTEMASK);
        out.write(message);
        out.flush();
    }

    @Override
    public byte[] nextMsg() throws IOException {
        ByteArrayOutputStream messageBuffer = new ByteArrayOutputStream();
        int nextByte;
        int length;
        try{
            //读取两个字节作为short值
            length = in.readUnsignedShort();// read 2 bytes
        }catch (EOFException e){
            return null;
        }
        byte[] msg = new byte[length];
        //readFully() 方法将阻塞等待，直到给定的数组完全填满
        in.readFully(msg);
        return msg;
    }
}
