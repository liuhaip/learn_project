package com.javaconfig.spring.dependson;

import java.io.IOException;

/**
 * PACKAGE_NAME:com.javaconfig.spring.dependson.DependentBean DESCRIPTION: User: liuhp date:
 * 16-7-13下午4:56
 */
public class DependentBean {

    private ResourceBean resourceBean;

    public void write(String content) throws IOException {
        System.out.println("DependentBean:======写资源");
        resourceBean.getFos().write(content.getBytes());
    }

    public void init() throws IOException {
        System.out.println("DependentBean:======初始化");
        resourceBean.getFos().write("DependentBean:======初始化======".getBytes());
    }

    public void destroy() throws IOException {
        System.out.println("DependentBean:======销毁");
        resourceBean.getFos().write("DependentBean:======销毁======".getBytes());
    }

    public ResourceBean getResourceBean() {
        return resourceBean;
    }

    public void setResourceBean(ResourceBean resourceBean) {
        this.resourceBean = resourceBean;
    }
}
