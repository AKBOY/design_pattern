package setTest;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author yuxiang.chu
 * @date 2022/6/9 18:26
 **/
public class TestCompare {

    public static void main(String[] args) {
        Set<Student> studentSet =  getCompareTreeSet();
        for (Student student : studentSet) {
            System.out.println(student.toString());
        }
        System.out.println("----------------------------------");
        Set<Student> studentSet2 =  getCompareTree2Set();
        for (Student student : studentSet2) {
            System.out.println(student.toString());
        }
    }

    private static Set<Student> getCompareTree2Set() {
        // 负的不换
        Set<Student> result = new TreeSet<>((o1, o2) -> {
            Integer age1 = o1.getAge();
            Integer age2 = o2.getAge();
            return age1 - age2;
        });
        result.add(Student.builder().age(18).name("AA").build());
        result.add(Student.builder().age(1).name("BB").build());
        result.add(Student.builder().age(25).name("CC").build());
        result.add(Student.builder().age(23).name("DD").build());
        return result;
    }

    private static Set<Student> getCompareTreeSet() {
        Set<Student> result = new HashSet<>();
        result.add(Student.builder().age(18).name("AA").build());
        result.add(Student.builder().age(1).name("BB").build());
        result.add(Student.builder().age(25).name("CC").build());
        result.add(Student.builder().age(23).name("DD").build());
        return result;
    }
}
