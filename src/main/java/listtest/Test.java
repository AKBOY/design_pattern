package listtest;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yuxiang.chu
 * @date 2022/6/8 10:14
 **/
public class Test {

    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
//        test.forEach(a -> {
//            if (a == 2) {
//                test.remove(a);
//            }
//        });
        Iterator<Integer> iterator = test.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 2) {
                iterator.remove();
            }
        }
        System.out.println(JSON.toJSONString(test));
    }
}
