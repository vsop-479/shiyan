package shiyan.test.socket.framer;

import java.io.*;

/**
 * Created by Administrator on 2015/10/15.
 */
public class DelimFramer implements Framer {
    private InputStream in;
    private static final byte DELIMITER = '\n';

    public DelimFramer(InputStream in){
        this.in = in;
    }

    @Override
    public void frameMsg(byte[] message, OutputStream out) throws IOException {
        for(byte b : message){
            if(b == DELIMITER){
                throw new IOException("Message contains delimiter");
            }
        }
        out.write(message);
        out.write(DELIMITER);
        out.flush();
    }

    @Override
    public byte[] nextMsg() throws IOException {
        ByteArrayOutputStream messageBuffer = new ByteArrayOutputStream();
        int nextByte;
        while ((nextByte = in.read()) != DELIMITER) {
            if(nextByte == -1){
                if(messageBuffer.size() == 0){
                    return null;
                }else{
                    throw new EOFException("Non-empty message without delimiter");
                }
            }
            messageBuffer.write(nextByte);
        }
        return messageBuffer.toByteArray();
    }
}
