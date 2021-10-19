package com.company.designpattern.templatemethod;

/**
 * 어떤 작업을 처리하는 일부분을 서브 클래스로 캡슐화해 전체 일을 수행하는 구조는 바꾸지 않으면서 특정 단계에서 수행하는 내역을 바꾸는 패턴<br>
 * 즉, 전체적으로는 동일하면서 부분적으로는 다른 구문으로 구성된 메서드의 코드 중복을 최소화 할 때 유용하다<br>
 * 예를 들어, 전체적인 알고리즘은 상위 클래스에서 구현하면서 다른 부분은 하위 클래스에서 구현할 수 있도록 함으로써 전체적인 알고리즘 코드를 재사용하는 데 유용하도록 한다.
 * <br>
 */
public class Main {

  public static void main(String[] args) {

    AbstractMotor lgMotor = new LGMotor();
    AbstractMotor samsungMotor = new SamsungMotor();
    lgMotor.move();
    samsungMotor.move();
  }
}
