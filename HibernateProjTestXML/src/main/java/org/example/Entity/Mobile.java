package org.example.Entity;

import java.util.List;
import java.util.Set;

public class Mobile {
    Integer id;
    String brand;
    Set<Model> modelList;


    public Mobile() {
        super();
    }

    public Mobile(String brand, Set<Model> modelList) {
        this.brand = brand;
        this.modelList = modelList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Set<Model> getModelList() {
        return modelList;
    }

    public void setModelList(Set<Model> modelList) {
        this.modelList = modelList;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
