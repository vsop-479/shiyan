package shiyan.test.headfirst.observer.actionListener;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2016/11/11.
 */
public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should i do it?");

//        增加监听者（观察者）
        button.addActionListener(new ActionListener() {
//            观察者实现actionPerformed，等同于update
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("just do it");
            }
        });
//        增加监听者（观察者）
        button.addActionListener(new ActionListener() {
//            观察者实现actionPerformed，等同于update
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("don't do it, you will regret it");
            }
        });
        frame.getContentPane().add(BorderLayout.CENTER, button);
    }
}
