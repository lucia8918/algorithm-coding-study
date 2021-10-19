package com.company.designpattern.interceptingfilter;

public class IssueStatusFilter implements Filter {

  @Override
  public void execute(String request) {
    System.out.println("IssueStatusFilter... request ::: " + request);
  }
}
