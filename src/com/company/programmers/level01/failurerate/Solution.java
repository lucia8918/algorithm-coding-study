package com.company.programmers.level01.failurerate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 프로그래머스 - LV1 실패율<br>
 * https://programmers.co.kr/learn/courses/30/lessons/42889
 */
public class Solution {

  class FailureRate {

    public FailureRate(int stage, float rate) {
      this.stage = stage;
      this.rate = rate;
    }

    public int getStage() {
      return stage;
    }

    public void setStage(int stage) {
      this.stage = stage;
    }

    public float getRate() {
      return rate;
    }

    public void setRate(float rate) {
      this.rate = rate;
    }

    int stage;
    float rate;

    @Override
    public String toString() {
      return "FailureRate{" + "stage=" + stage + ", rate=" + rate + '}';
    }
  }

  public int[] solution(int N, int[] stages) {
    int[] answer = {};

    // N : 스테이지 개수
    // 실패율 : 아직 클리어 하지 못한 수 / 스테이지 도달한 플레이어 수

    // 정렬 처리
    Arrays.sort(stages);

    // 실패
    // 도달
    HashMap<Integer, Integer> failDic = new HashMap<>();
    HashMap<Integer, Integer> tryDic = new HashMap<>();

    for (int stage : stages) {
      Integer currentCount = failDic.getOrDefault(stage, 0);
      currentCount++;
      failDic.put(stage, currentCount);
    }

    int remainCount = stages.length;
    for (int stage = 1; stage <= N; stage++) {

      int stageFailCount = failDic.getOrDefault(stage, 0);
      remainCount = remainCount - stageFailCount;
      tryDic.put(stage, remainCount);
    }

    ArrayList<FailureRate> failureRates = new ArrayList<>();

    for (int stage = 1; stage <= N; stage++) {
      int stageFailCount = failDic.getOrDefault(stage, 0);
      int stageTryCount = tryDic.getOrDefault(stage, 0);
      float failureRate = (float) stageFailCount / (float) (stageTryCount + stageFailCount);
      failureRates.add(new FailureRate(stage, failureRate));
    }

    List<FailureRate> resultList =
        failureRates.stream()
            .sorted(
                Comparator.comparing(FailureRate::getRate)
                    .reversed()
                    .thenComparing(FailureRate::getStage))
            .collect(Collectors.toList());

    return resultList.stream().map(FailureRate::getStage).mapToInt(i -> i).toArray();
  }
}
