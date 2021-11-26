package com.chuyx.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuxiang.chu
 * @date 2021/11/26 10:59
 **/
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
