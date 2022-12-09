package tlTest;

import com.alibaba.fastjson.JSON;

/**
 * @author yuxiang_chu
 * @date 2022/11/22 17:29
 */
public class TestJsonNull {

    public static void main(String[] args) {
        String s = JSON.toJSONString(null);
        System.out.println(s);
        if (s == null) {
            System.out.println(true);
        }
        System.out.println(false);
    }
}
