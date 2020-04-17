package com.example.mybaits.domain;

import java.io.Serializable;

public class QueryVo implements Serializable {

    private  Category category;

    public QueryVo(Category category) {

        this.category = category;
    }

    public QueryVo() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
