package org.learn.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by kevin on 2015/1/8.
 */
@Aspect
public class LoggerAspectBean {
    @Before("within(org.learn.dao..*)")
    public void mylog(){
        System.out.println("记录用户操作信息");
    }
}
