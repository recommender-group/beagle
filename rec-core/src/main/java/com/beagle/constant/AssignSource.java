package com.beagle.constant;

public class AssignSource {
    /**
     * 从ES召回候选集时实现自动解析
     */
    public static final String ES = "ES";
    /**
     * 通过外部服务（dubbo) 实现填充,通常在preContextFiller及filler阶段使用
     */
    public static final String DUBBO = "DUBBO";
    /**
     * 通过es填充候选对象属性，通常用在filler阶段 对应类BaseFillerByEs
     */
    public static final String ES_FILL = "ES_FILL";
}
