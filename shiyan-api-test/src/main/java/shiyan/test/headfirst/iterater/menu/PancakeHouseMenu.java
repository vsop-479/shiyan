package shiyan.test.headfirst.iterater.menu;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/18.
 */
public class PancakeHouseMenu {
    private List<MenuItem> menuItems;

    public PancakeHouseIterator createIterator(){
        return new PancakeHouseIterator(menuItems);
    }

    public PancakeHouseMenu(){
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem());
    }

}
