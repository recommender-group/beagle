package com.beagle.constant;

public class AssignType {
    /**
     * Int Double Long String等常用类型无需特殊配置
     */
    public static final String DEFAULT_TYPE = "";
    /**
     * json解析为list
     */
    public static final String JSON_LIST = "json_list";
    /**
     * es中json格式解析list
     */
    public static final String ES_ARRAY_LIST = "es_array_list";
    /**
     * ES中的object类型
     */
    public static final String JSON_OBJ = "json_obj";
    /**
     * string解析为list
     * abc,bcd或者abc:time1,bcd:time2->[abc,bcd]
     */
    public static final String STR_LIST = "str_list";
    /**
     * string类型偏好权重类型解析为map
     * {"cat1":0.9,"cat2":0.8} -> Map<String,Double> 同时拿到keyList -> [cat1,cat2]
     */
    public static final String PREFER_WEIGHT = "prefer_weight";
}
