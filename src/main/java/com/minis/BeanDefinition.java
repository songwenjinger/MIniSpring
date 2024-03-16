package com.minis;

/**
 * @Date：2024/3/12 19:01
 * @Description
 */
public class BeanDefinition {
    private String id;
    private String className;


    public BeanDefinition(String id, String className) {
        this.id = id;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
