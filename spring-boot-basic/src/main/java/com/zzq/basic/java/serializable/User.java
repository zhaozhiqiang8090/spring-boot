package com.zzq.basic.java.serializable;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -6994564163940493571L;

    private String username;
//    public static String username;

//    private String passwd;
    private transient String passwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * 反序列化用
     * @return
     */
    private Object readResolve() {
        return this;
    }

}
