package com.chuyx.filter;

import java.util.List;

/**
 * @author yuxiang.chu
 * @date 2021/11/26 10:56
 **/
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);
}
