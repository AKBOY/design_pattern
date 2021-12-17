package com.chuyx.iterator;

/**
 * @author yuxiang.chu
 * @date 2021/12/17 13:59
 **/
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            System.out.println((String)iter.next());
        }
    }
}
