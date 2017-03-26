package thinking.in.java.chapter19.demo;

/**
 * Created by Administrator on 2016/11/3.
 */
public enum OzWitch {
    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wear of the Ruby Slippers, crushed by Dorothy's house"),
    SOUTH("Good by inference, but missing");
    private String description;
    private OzWitch(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public static void main(String[] args){
        for(OzWitch ozWitch : OzWitch.values()){
            System.out.println(ozWitch + " : " + ozWitch.getDescription());
        }
    }
}
