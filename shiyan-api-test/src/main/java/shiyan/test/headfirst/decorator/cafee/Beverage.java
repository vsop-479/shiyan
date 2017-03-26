package shiyan.test.headfirst.decorator.cafee;

/**
 * Created by Administrator on 2016/11/14.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";
    protected String size;

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract double cost();
}
