package com.example.demojpa.util;

import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.stereotype.Component;
/**
 * 继承设置mysql引擎
 */
@Component
public class MySQL5TableType extends MySQL5Dialect {


    //设置数据库引擎
    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}