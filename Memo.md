# 코딩 테스트 메모&팁

### 알고리즘 선택 팁!
- 그리디, 구현, 완전 탐색 등의 아이디어로 풀수 있는지 검토
  - 만약 다른 알고리즘으로 풀이 방법이 떠로으지 않으면 '**다이나믹 프로그래밍**' 고려!
  - **다이나믹 프로그래밍** 조건 2가지
    - 최적 부분 구조 : 큰 문제를 작은 문제로 나눌 수 있으며, 작은 문제의 답을 모아서 큰 문제를 해결 할 수 있는 상황
    - 부분 문제의 중복 : 각 부분 문제들이 중복이 되는 경우
- 탐색 범위가 큰 경우에는 '**이진탐색**' 부터 확인해 봐라! 시간복잡도 Log2N
- 간선의 비용이 없고 + 최단 거리 탐색시에는 '**BFS**(with queue)'를 활용하라!


### char to int 2가지 방법
- int value = chars[i] - '0'; // 0의 아스키코드는 48.
  - Eg, int i = '9' - '0'; // 57-48
- int value = Character.getNumericValue(chars[i]);

### 숫자 자리수 구하기
- int digitLength = (int) (Math.log10(list.size()) + 1);

### 숫자 자리수 순회
- ArrayList<Integer> arrNum = new ArrayList<>();
  while(num > 0) {
    arrNum.add(num %10);
    num /= 10;
  }
  