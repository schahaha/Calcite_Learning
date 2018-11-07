package cn.schahaha.day01;

import scala.Int;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义excel table的字段类型
 */
public enum ExcelFieldType {

    String(java.lang.String.class,"string"),
    Integer(java.lang.Integer.class,"int"),
    Double(java.lang.Double.class,"double"),
    Boolean(java.lang.Boolean.class,"boolean");

    public final static Map<String,Class> MAP=new HashMap<String, Class>();

    private Class clz;

    private String name;

    private  ExcelFieldType(Class clz,String name){

        this.clz=clz;
        this.name=name;

    }

    static {

        ExcelFieldType[] values = values();

        for(int i=0;i<values.length;i++){
            MAP.put(values[i].name,values[i].clz);


        }


    }
}
