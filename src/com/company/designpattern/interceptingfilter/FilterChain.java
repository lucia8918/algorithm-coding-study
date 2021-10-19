package com.company.designpattern.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
  private List<Filter> filters = new ArrayList<>();
  private Target target;

  public void addFilter(Filter filter) {
    filters.add(filter);
  }

  public void execute(String request) {
    for (Filter filter : filters) {
      filter.execute(request); // 필터들을 순차적으로 실행
    }
    target.execute(request); // 실제 요청 대상 수행
  }

  public void setTarget(Target target) {
    this.target = target;
  }
}
