package com.company.project.model;

import javax.persistence.*;

@Table(name = "sys_role")
public class SysRole {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色
     */
    private String name;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取角色
     *
     * @return name - 角色
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色
     *
     * @param name 角色
     */
    public void setName(String name) {
        this.name = name;
    }
}