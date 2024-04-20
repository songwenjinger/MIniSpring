package com.minis.beans.factory.config;

/**
 * @Date：2024/3/16 12:28
 * @Description
 */
public interface SingletonBeanRegistry {
    void registerSingleton(String beanName, Object singletonObject);

    Object getSingleton(String beanName);

    boolean containsSingleton(String beanName);

    String[] getSingletonNames();
}
