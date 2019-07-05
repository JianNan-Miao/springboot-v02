package com.cheer.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
public class Person {
    private  String lastName;
    private  Integer age;
    private  boolean boss;
    private Date birth;

    private Map<String,Object> map;
    private List<Object> objects;
    private  Dog dog;

    public Person() {
    }

    public Person(String lastName, Integer age, boolean boss, Date birth, Map<String, Object> map, List<Object> objects, Dog dog) {
        this.lastName = lastName;
        this.age = age;
        this.boss = boss;
        this.birth = birth;
        this.map = map;
        this.objects = objects;
        this.dog = dog;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", map=" + map +
                ", objects=" + objects +
                ", dog=" + dog +
                '}';
    }
}
