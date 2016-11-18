package shiyan.test.headfirst.iterater.menu;

import java.util.List;

/**
 * Created by Administrator on 2016/11/18.
 */
public class PancakeHouseIterator implements Iterator<MenuItem> {
    private List<MenuItem> menuItems;
    private int cursor;
    public PancakeHouseIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(menuItems.size() - 1 > cursor){
            return true;
        }
        return false;
    }

    @Override
    public MenuItem next() {
        if(hasNext()){
            MenuItem menuItem = menuItems.get(cursor);
            cursor++;
            return menuItem;
        }else{
            return null;
        }

    }
}
