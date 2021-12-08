package com.chuyx.flyweight;

/**
 * @author yuxiang.chu
 * @date 2021/12/8 9:26
 **/
public class FlyweightPatternDemo {

    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
        // 需要注意的是，这样类似的对象如果进行修改，map中的数据也会同步修改，因为取出来的是引用对象
        System.out.println("----------------------------");
        for (String color : colors) {
            Circle circle = (Circle) ShapeFactory.getCircle(color);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

}
