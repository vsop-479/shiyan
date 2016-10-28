package thinking.in.java.chapter15.demo.tuple;

/**
 * Created by Administrator on 2016/10/27.
 * 类型参数
 * 告诉便西起想使用什么类型，然后编译器帮你处理一切细节。
 */
public class Holder3<T> {
    private T a;
//    类型参数
    public Holder3(T a){
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args){
        Holder3<String> h1 = new Holder3<String>("dsf");
        Holder3<Integer> h2 = new Holder3<Integer>(23);
    }
}
