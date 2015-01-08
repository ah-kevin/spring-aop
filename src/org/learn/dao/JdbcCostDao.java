package org.learn.dao;

/**
 * Created by kevin on 2015/1/8.
 */
public class JdbcCostDao implements CostDao {
    @Override
    public void find() {
        System.out.println("利用jdbc从数据库查询");

    }

    @Override
    public void add() {
        System.out.println("利用jdbc讲数据写入数据库");
    }

    @Override
    public void delete() {
        System.out.println("利用jdbc将数据从数据库删除");

    }

    @Override
    public void update() {
        System.out.println("利用jdbc从数据库更新");

    }
}
