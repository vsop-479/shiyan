package thinking.in.java.chapter5.p6;

/**
 * Created by zhouhui on 2015/11/8.
 */
public class Dog {
    public void bark(int i, String s){
        System.out.println("barking! barking!int: " + i + "; String: " + s);
    }
    public void bark(String s, int i){
        System.out.println("howling! howling!String: " + s + "; int: " + i);
    }

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.bark(2, "dog");
        dog.bark("dog", 2);
    }
}
