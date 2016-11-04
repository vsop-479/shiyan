package thinking.in.java.chapter19.demo.enumset;

import java.util.EnumSet;

import static thinking.in.java.chapter19.demo.enumset.AlarmPoints.*;

/**
 * Created by Administrator on 2016/11/4.
 */
public class EnumSets {
    public static void main(String[] args){
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        points.add(BATHROOM);
        System.out.println(points);
        points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);
        points = EnumSet.allOf(AlarmPoints.class);
        System.out.println(points);
        System.out.println(points.contains(BATHROOM));
        System.out.println(points.parallelStream().count());
    }
}
