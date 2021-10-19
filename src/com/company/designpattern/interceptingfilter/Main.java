package com.company.designpattern.interceptingfilter;

/**
 * Intercepting Filter Pattern<br>
 * 요청이나 응답의 전/후 어떤 작업을 하고자 할 때 사용할 수 있다.<br>
 * http://wildpup.cafe24.com/archives/596
 */
public class Main {
  public static void main(String[] args) {
    //
    FilterManager filterManager = new FilterManager(new Target()); // 실제 요청으로 FilterManager 생성
    filterManager.setFilter(new IssueOwnerFilter()); // 필터 추가
    filterManager.setFilter(new IssueStatusFilter()); // 필터 추가</pre>

    Client client = new Client();
    client.setFilterManager(filterManager);
    client.sendRequest("INTERCEPTING FILTER EXAM!"); // 요청
  }
}
