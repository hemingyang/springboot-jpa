
    /**  
     * @Title: MySQL5TableType.java
     * @Package com.example.jpa.util
     * @Description: TODO(用一句话描述该文件做什么)
     * @author hemin
     * @date 2020年6月30日 下午9:22:47 
     * @version V1.0  
     */
    
package com.example.jpa.util;

import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.stereotype.Component;

/**
     * @ClassName: MySQL5TableType
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author hemin
     * @date 2020年6月30日
     *
     */

@Component
public class MySQL5TableType extends MySQL5Dialect {


    //设置数据库引擎
    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}