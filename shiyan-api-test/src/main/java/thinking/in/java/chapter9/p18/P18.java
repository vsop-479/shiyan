package thinking.in.java.chapter9.p18;

/**
 * Created by Administrator on 2016/2/26.
 */
public class P18 {
}

interface Cycle{

}

class Unicycle implements Cycle{

}
class Bicycle implements Cycle{

}
class Tricycle implements Cycle{

}

interface CycleFactory{
    Cycle getCycle();
}
class UnicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
class BicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
class TricycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}