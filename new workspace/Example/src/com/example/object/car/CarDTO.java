package com.example.object.car;

public class CarDTO {
    public CarDTO(){}

    public CarDTO(int carSn, String carName, int carPrice, String carOwner, int carYear, String carType){
        this.carSn = carSn;
        this.carName = carName;
        this.carPrice = carPrice;
        this.carOwner = carOwner;
        this.carYear = carYear;
        this.carType = carType;
    }

    public CarDTO(CarDTO c){
        carSn = c.carSn;
        carName = c.carName;
        carPrice = c.carPrice;
        carOwner = c.carOwner;
        carYear = c.carYear;
        carType = c.carType;
    }
    public int carSn;
    public String carName;
    public int carPrice;
    public String carOwner;
    public int carYear;
    public String carType;

//    @Override
//    public String toString() {
//        return "CarDTO{" +
//                "carSn=" + carSn +
//                ", carName='" + carName + '\'' +
//                ", carPrice=" + carPrice +
//                ", carOwner='" + carOwner + '\'' +
//                ", carYear=" + carYear +
//                ", carType='" + carType + '\'' +
//                '}';
//    }
}