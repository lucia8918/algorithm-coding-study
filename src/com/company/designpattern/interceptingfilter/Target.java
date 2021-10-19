package com.company.designpattern.interceptingfilter;

public class Target {

  public void execute(String request) {
    System.out.println("Target... request ::: " + request);
  }
}
