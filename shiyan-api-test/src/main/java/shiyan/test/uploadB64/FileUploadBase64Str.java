package shiyan.test.uploadB64;

import org.apache.commons.codec.binary.Base64;
import java.io.*;

/**
 * Created by Administrator on 2015/10/10.
 */
public class FileUploadBase64Str {
    public static void main(String[] args) {
        String path = "E:\\rain-tree.jpg";
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] bytes = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(bytes);
            Base64 base64 = new Base64();
            String strb64 = base64.encodeToString(bytes);
            System.out.println(strb64);
            write(strb64);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void write(String str){
        try {
            Base64 base64 = new Base64();
            byte[] bytes = base64.decode(str);
            String path = "E:\\temp2.jpg";
            File file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(bytes);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
