package setTest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuxiang.chu
 * @date 2022/6/9 18:24
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private String name;

    private Integer age;
}
