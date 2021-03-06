package com.pyl.mvcframework.webmvc.annotaion;

import java.lang.annotation.*;

/**
 * @Auther: Administrator
 * @Date: 2018/6/22/022 15:54
 * @Description:
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PYLRequestParam {
    String value() default "";
}
