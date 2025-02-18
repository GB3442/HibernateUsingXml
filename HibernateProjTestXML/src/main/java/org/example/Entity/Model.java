package org.example.Entity;

import java.util.Arrays;

public class Model {
    Integer mid;
    String name;
    Double price;
    String operatingSystem;
    Integer batteryCapacity;
    Mobile mobileId;


    public Model(String name, Double price, String operatingSystem, Integer batteryCapacity) {
        this.name = name;
        this.price = price;
        this.operatingSystem = operatingSystem;
        this.batteryCapacity = batteryCapacity;


    }

    public Model() {
        super();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public Mobile getMobile() {
        return mobileId;
    }

    public void setMobile(Mobile mobile) {
        this.mobileId = mobile;
    }

    @Override
    public String toString() {
        return "Model{" +
                "mid=" + mid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
