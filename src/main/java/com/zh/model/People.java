package com.zh.model;

import javax.persistence.*;

/**
 * Created by zhanghao on 2017/4/11.
 */


@Entity
@Table(name = "People")
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 36, nullable = false)
//    @GeneratedValue(generator = "uuid")   //指定生成器名称
//    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private int id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}