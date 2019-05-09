package com.demo.model;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: springboottest
 * @Package: com.demo.model
 * @ClassName:
 * @Description: java类作用描述
 * @Author: 陈铭
 * @CreateDate: 2019/5/6 10:10
 * @UpdateUser: 陈铭
 * @UpdateDate: 2019/5/6 10:10
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */

public class demo {
    private  int id ;
    private List<demo2> list ;

    public demo(int id, List<demo2> list) {
        this.id = id;
        this.list = list;
    }

    public demo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<demo2> getList() {
        return list;
    }

    public void setList(List<demo2> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "demo{" +
                "id=" + id +
                ", list=" + list +
                '}';
    }
}
