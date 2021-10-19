package com.company.designpattern.templatemethod;

public class SamsungMotor extends AbstractMotor {

  @Override
  public void on() {
    System.out.println("삼성 모터 기동");
  }

  @Override
  public void run() {
    System.out.println("삼성 모터 실행 중");
  }

  @Override
  public void off() {
    System.out.println("삼성 모터 종료");
  }
}
