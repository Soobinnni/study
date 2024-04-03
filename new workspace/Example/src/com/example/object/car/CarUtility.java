package com.example.object.car;

public class CarUtility {
    public void printCarInfoUsingCarDTO(CarDTO carDTO){
        System.out.println( "Car{" +
                "carSn=" + carDTO.carSn +
                ", carName='" + carDTO.carName + '\'' +
                ", carPrice=" + carDTO.carPrice +
                ", carOwner='" + carDTO.carOwner + '\'' +
                ", carYear=" + carDTO.carYear +
                ", carType='" + carDTO.carType + '\'' +
                '}')
        ;
    }
}
