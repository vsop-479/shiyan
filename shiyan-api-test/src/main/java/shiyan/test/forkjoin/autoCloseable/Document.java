package shiyan.test.forkjoin.autoCloseable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Document {
    private final List<String> lines;
    Document(List<String> lines){
        this.lines = lines;
    }
    List<String> getLines(){
        return lines;
    }

    static Document fromFile(File file)throws IOException{
//        <>钻石操作符使得范型处理更容易，其避免了重复类型，因为这些类型在编译时就能被轻易的推断出来。
        List<String> lines = new LinkedList<>();
//        任何实现了java.lang.AutoClosable的类都可以在try块中打开, 任何在try块中声明的资源将会在执行离开try块时合理地关闭。
//        关闭io不需要再if/try/catch/finally
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = reader.readLine();
            while(line != null){
                lines.add(line);
                line = reader.readLine();
            }
        }
        return new Document(lines);
    }
}
