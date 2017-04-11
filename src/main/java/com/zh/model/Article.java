package com.zh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zhanghao on 2017/4/11.
 */


@Entity
@Table(name = "Article")
public class Article {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;


    @Column(name = "title", unique = true, nullable = false)
    private String title;
}
