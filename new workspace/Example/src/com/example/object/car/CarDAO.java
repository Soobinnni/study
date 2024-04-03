package com.example.object.car;

public class CarDAO {
    // CREATE
    public void carInsert(CarDTO car){
        System.out.println("car 정보 저장 비즈니스 로직 수행");
    }
    // UPDATE
    public void carUpdate(CarDTO car){
        System.out.println("car 정보 수정 비즈니스 로직 수행");
    }
    // READ
    public void carSelect(CarDTO car){
        System.out.println("car 정보 조회 비즈니스 로직 수행");
    }
    // DELETE
    public void carDelete(CarDTO car){
        System.out.println("car 정보 삭제 비즈니스 로직 수행");
    }
}
