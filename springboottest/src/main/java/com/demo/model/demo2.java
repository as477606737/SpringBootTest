package com.demo.model;

import java.util.List;

/**
 * @ProjectName: springboottest
 * @Package: com.demo.model
 * @ClassName:
 * @Description: java类作用描述
 * @Author: 陈铭
 * @CreateDate: 2019/5/6 16:46
 * @UpdateUser: 陈铭
 * @UpdateDate: 2019/5/6 16:46
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
public class demo2 {

    private int ida ;
    private List<String> lista ;

    public demo2(int ida, List<String> lista) {
        this.ida = ida;
        this.lista = lista;
    }

    public demo2() {
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }
}
