package my.fastcamp.week_2.student;

import my.fastcamp.week_2.Goods;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class GoodsExam {
    public static void main(String[] args) {
        Goods g1 = new Goods(1, "java", 1000);
        Goods g2 = new Goods(1, "java", 1000);
        Goods g3 = new Goods(2, "jsp", 5000);

        if (g1.equals((g2))) {
            System.out.println("g1과 g2는 값이 같다.");
        }
        if(!g1.equals(g3)){
            System.out.println("g1과 g3는 값이 같지 않다.");
        }
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
    }
}
