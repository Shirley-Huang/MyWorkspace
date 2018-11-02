package com.dandan.image.loader;

import javax.swing.*;
import java.awt.*;

public class ImageLoaderTest{
    public static void main(String[] args){
        new Test("图片加载器");
    }

}

class Test extends JFrame {

    Image image = GameUtils.getImage("images/img01.png");

    public Test(String title){
        super(title);
        init();
    }

    public void init(){
        System.out.println("-----------------init----------------");
        //设置窗口的大小
        this.setSize(500,500);
        //设置窗口位置、以左上角为原点
        this.setLocation(100,100);
        //能否修改窗口大小 false-锁定、不能修改
        this.setResizable(true);
        //是否展示
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics graphics) {
        System.out.println("--------toPrint------------");
        graphics.drawImage(image,100,100,image.getWidth(null),image.getHeight(null),this);
        graphics.drawRect(1000,1000,1000,1000);

        //***添加文字时，需提前设置好其字体样式和文字颜色，否则会使用默认样式（即有先后顺序）
        //文字的颜色
        graphics.setColor(Color.CYAN);
        //文字的字体样式 name/style/size - 字体/字形/字号
        graphics.setFont(new Font("华文行楷",Font.BOLD,50));
        //添加文字 str-文字内容 x、y-以窗口左上角为原点
        graphics.drawString("hello world",100,100);
    }
}
