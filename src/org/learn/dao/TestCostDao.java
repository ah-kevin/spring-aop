package org.learn.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by kevin on 2015/1/8.
 */
public class TestCostDao {
    public static void main(String[] args) {
        String conf ="spring-config.xml";
        ApplicationContext ac =new ClassPathXmlApplicationContext(conf);
        CostDao dao =ac.getBean("costDao", CostDao.class);
        dao.find();
        dao.delete();
        dao.add();
        dao.update();
    }
}
