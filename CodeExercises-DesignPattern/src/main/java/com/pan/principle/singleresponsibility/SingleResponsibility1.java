package com.pan.principle.singleresponsibility;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/8 10:31
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("自行车");
    }

    static class Vehicle {
        public void run(String vehicle) {
            System.out.println(vehicle + "在公路上运行----");
        }
    }
}

