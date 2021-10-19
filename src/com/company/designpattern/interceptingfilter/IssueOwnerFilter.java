package com.company.designpattern.interceptingfilter;

public class IssueOwnerFilter implements Filter {

  @Override
  public void execute(String request) {
    System.out.println("IssueOwnerFilter... request ::: " + request);
  }
}
