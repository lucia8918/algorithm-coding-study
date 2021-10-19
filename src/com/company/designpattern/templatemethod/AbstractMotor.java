package com.company.designpattern.templatemethod;

public abstract class AbstractMotor {
  public abstract void on();

  public abstract void run();

  public abstract void off();

  public final void move() {
    on();
    run();
    run();
    run();
    off();
  }
}
