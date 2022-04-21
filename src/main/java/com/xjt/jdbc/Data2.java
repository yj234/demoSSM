package com.xjt.jdbc;

import java.util.List;
import java.util.Map;

/**
 * @author jianyao
 * @Description TODO
 * @Date 2022/2/15 16:36
 */
public class Data2 {
    private List list;
    private Map map;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Data2{" +
                "list=" + list +
                ", map=" + map +
                '}';
    }
}
