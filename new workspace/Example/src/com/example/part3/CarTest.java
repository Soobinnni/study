package com.example.part3;

import com.example.object.car.CarDAO;
import com.example.object.car.CarDTO;
import com.example.object.car.CarUtility;

import java.util.Scanner;

public class CarTest {
    // Car에 관련된 시작 클래스. ∵시작 메서드인 main이 있는 Class이므로
    public static void main(String[] args){
        CarDTO carDTO = createCarDTOInstance();
        CarDAO carDAO = new CarDAO();
        CarUtility carUtility = new CarUtility();
        carUtility.printCarInfoUsingCarDTO(carDTO);

        // create
        carDAO.carInsert(carDTO);
        // update
        carDAO.carUpdate(carDTO);
        // read
        carDAO.carSelect(carDTO);
        // delete
        carDAO.carDelete(carDTO);
    }
    public static CarDTO createCarDTOInstance(){
        Scanner input = new Scanner(System.in); // Scanner 역시 기본 라이브러리에 있는 Utility Model인 것!
        CarDTO carDTO = new CarDTO();

        System.out.print("자동차 일련번호 입력: ");
//        int carSn = input.nextInt();
        carDTO.carSn = input.nextInt();
        input.nextLine(); // 버퍼 비우기

        System.out.print("자동차 이름 입력: ");
//        String carName = input.nextLine();
        carDTO.carName = input.nextLine();


        System.out.print("자동차 가격 입력: ");
//        int carPrice = input.nextInt();
        carDTO.carPrice = input.nextInt();

        input.nextLine(); // 버퍼 비우기

        System.out.print("자동차 소유자 입력: ");
//        String carOwner = input.nextLine();
        carDTO.carOwner = input.nextLine();

        System.out.print("자동차 연식 입력: ");
//        int carYear = input.nextInt();
        carDTO.carYear = input.nextInt();

        input.nextLine(); // 버퍼 비우기

        System.out.print("자동차 타입 입력: ");
//        String carType = input.nextLine();
        carDTO.carType = input.nextLine();

        input.close(); // 스트림 닫기

//        printCarInfoUsingCarArgs(carSn, carName, carPrice, carOwner, carYear, carType)
//        printCarInfoUsingCarDTO(carDTO);
        return carDTO;
    }
    public static void printCarInfoUsingCarDTO(CarDTO carDTO){
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
    public static void printCarInfoUsingCarArgs(int carSn, String carName, int carPrice, String carOwner, int carYear, String carType){
        System.out.println( "Car{" +
                "carSn=" + carSn +
                ", carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                ", carOwner='" + carOwner + '\'' +
                ", carYear=" + carYear +
                ", carType='" + carType + '\'' +
                '}')
        ;
    }
}