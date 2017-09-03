package com.utan.app.fastjsonrealm;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/**
 *
 * Created by quanke(http://quanke.name) on 2016/7/18.
 */
public class User extends RealmObject implements Serializable{


    public User() {

    }

    private String          name;
    private int             age;

    @Ignore
    private int             sessionId;

    // Standard getters & setters generated by your IDE…
    public String getName() { return name; }
    public void   setName(String name) { this.name = name; }
    public int    getAge() { return age; }
    public void   setAge(int age) { this.age = age; }
    public int    getSessionId() { return sessionId; }
    public void   setSessionId(int sessionId) { this.sessionId = sessionId; }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sessionId=" + sessionId +
                '}';
    }
}