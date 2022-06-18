package setTest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 结论：hashSet无须，TreeSet有序，且可自定义排序规则（使用Compare接口实现）
 * @author yuxiang.chu
 * @date 2022/6/9 17:47
 **/
public class TestHashSetAndTreeSet {

    public static void main(String[] args) {
        Set<String> hashSet = getCommonHashSet();
        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------------");
        Set<String> treeSet = getCommonTreeSet();
        for (String s : treeSet) {
            System.out.println(s);
        }
    }

    private static Set<String> getCommonTreeSet() {
        Set<String> result = new TreeSet<>();
        result.add("Bob");
        result.add("AMy");
        result.add("YAsir");
        result.add("Fliex");
        return result;
    }

    private static Set<String> getCommonHashSet() {
        Set<String> result = new HashSet<>();
        result.add("Bob");
        result.add("AMy");
        result.add("YAsir");
        result.add("Fliex");
        return result;
    }
}
