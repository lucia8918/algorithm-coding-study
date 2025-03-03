package com.company.programmers.gccompany.q1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {

  public static final DateTimeFormatter ORDER_DATE_FORMATTER =
      DateTimeFormatter.ofPattern("yyyy-MM-dd");

  public static class ProductInfo {
    String productId;

    @Override
    public String toString() {
      return "ProductInfo{"
          + "productId='"
          + productId
          + '\''
          + ", totalOrderCount="
          + totalOrderCount
          + ", orderUserIds="
          + orderUserIds
          + ", reOrderUserIds="
          + reOrderUserIds
          + ", orderRate = "
          + getReOrderRate()
          + '}';
    }

    public void setTotalOrderCount(int totalOrderCount) {
      this.totalOrderCount = totalOrderCount;
    }

    public void setOrderUserIds(Set<String> orderUserIds) {
      this.orderUserIds = orderUserIds;
    }

    public Set<String> getReOrderUserIds() {
      return reOrderUserIds;
    }

    public void setReOrderUserIds(Set<String> reOrderUserIds) {
      this.reOrderUserIds = reOrderUserIds;
    }

    int totalOrderCount; // 전체 구매 수
    Set<String> orderUserIds; // 구매자
    Set<String> reOrderUserIds; // 재 주문 구매자

    public ProductInfo(String productId) {
      this.productId = productId;
      this.totalOrderCount = 0;
      this.orderUserIds = new HashSet<>();
      this.reOrderUserIds = new HashSet<>();
    }

    public String getProductId() {
      return productId;
    }

    public int getRealProductId() {
      String pid = productId.replace("pid", "");
      return Integer.parseInt(pid);
    }

    public void setProductId(String productId) {
      this.productId = productId;
    }

    public int getTotalOrderCount() {
      return totalOrderCount;
    }

    public void plusTotalOrderCount() {
      this.totalOrderCount++;
    }

    public Set<String> getOrderUserIds() {
      return orderUserIds;
    }

    public float getReOrderRate() {
      return (float) reOrderUserIds.size() / orderUserIds.size() * 100;
    }
  }

  public static class OrderInfo {

    public OrderInfo(LocalDate orderDate, String userId, String productId) {
      this.orderDate = orderDate;
      this.userId = userId;
      this.productId = productId;
    }

    LocalDate orderDate;
    String userId;
    String productId;

    public LocalDate getOrderDate() {
      return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
      this.orderDate = orderDate;
    }

    public String getUserId() {
      return userId;
    }

    public void setUserId(String userId) {
      this.userId = userId;
    }

    public String getProductId() {
      return productId;
    }

    public void setProductId(String productId) {
      this.productId = productId;
    }
  }

  public LocalDate getOrderStartDate(LocalDate orderEndDate, int k) {

    int month = orderEndDate.getMonth().getValue();
    int day = orderEndDate.getDayOfMonth();
    int targetDays = month * 30 + day - k;

    int m = targetDays / 30;
    int d = targetDays % 30;

    return LocalDate.of(2020, m, d + 1);
  }

  public String[] solution(String[] records, int k, String date) {

    List<OrderInfo> orderInfos = generateOrders(records);
    LocalDate orderEndDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    LocalDate orderStartDate = getOrderStartDate(orderEndDate, k);

    List<OrderInfo> targetOrderInfos = getTargetOrders(orderInfos, orderStartDate, orderEndDate);
    Map<String, ProductInfo> saleInfos = new HashMap<>();

    for (OrderInfo orderInfo : targetOrderInfos) {
      ProductInfo productInfo =
          saleInfos.getOrDefault(orderInfo.productId, new ProductInfo(orderInfo.productId));

      // 구매자 추가
      boolean isFirstOrdered = productInfo.getOrderUserIds().add(orderInfo.userId);

      // 재구매의 경우 재구매수 플러스 처리
      if (!isFirstOrdered) productInfo.getReOrderUserIds().add(orderInfo.userId);

      // 전체 구매 수 플러스 처리
      productInfo.plusTotalOrderCount();
      saleInfos.put(productInfo.productId, productInfo);
    }

    // 구매율 계산
    List<ProductInfo> productInfos = new ArrayList<>(saleInfos.values());

    List<ProductInfo> results =
        productInfos.stream()
            // .filter(productInfo -> productInfo.getReOrderRate() > 0)
            .sorted(
                Comparator.comparing(ProductInfo::getReOrderRate) // 구매율 높은 순
                    .thenComparing(ProductInfo::getTotalOrderCount) // 구매순 높은 순
                    .reversed()
                    .thenComparing(ProductInfo::getRealProductId))
            .collect(Collectors.toList());

    if (results.isEmpty()) return new String[] {"no result"};

    return results.stream().map(ProductInfo::getProductId).toArray(String[]::new);
  }

  public List<OrderInfo> getTargetOrders(
      List<OrderInfo> orderInfos, LocalDate orderStartDate, LocalDate orderEndDate) {
    return orderInfos.stream()
        .filter(
            orderInfo -> {
              if ((orderInfo.orderDate.isAfter(orderStartDate)
                      || orderInfo.orderDate.isEqual(orderStartDate))
                  && (orderInfo.orderDate.isBefore(orderEndDate)
                      || orderInfo.orderDate.isEqual(orderEndDate))) {
                return true;
              }
              return false;
            })
        .collect(Collectors.toList());
  }

  public List<OrderInfo> generateOrders(String[] records) {
    ArrayList<OrderInfo> orderInfos = new ArrayList<>();
    for (String record : records) {
      orderInfos.add(generateOrder(record));
    }
    return orderInfos;
  }

  public OrderInfo generateOrder(String orderInfo) {
    String[] orderInfos = orderInfo.split(" ");
    LocalDate orderDate = LocalDate.parse(orderInfos[0], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    String userId = orderInfos[1];
    String productId = orderInfos[2];
    return new OrderInfo(orderDate, userId, productId);
  }
}
