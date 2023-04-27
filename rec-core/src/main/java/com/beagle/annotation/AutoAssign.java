package com.beagle.annotation;

import com.beagle.constant.AssignLoss;
import com.beagle.constant.AssignSource;
import com.beagle.constant.AssignType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自动赋值注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AutoAssign {

    /**
     * 特征字段名
     */
    String name() default "";

    /**
     * 特征数据来源
     */
    String source() default AssignSource.ES;

    /**
     * 特征类型
     */
    String type() default AssignType.DEFAULT_TYPE;

    /**
     * 特征缺失时的告警级别
     */
    String lossLevel() default AssignLoss.IGNORE;
}
