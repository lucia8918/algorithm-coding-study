# 코딩 테스트 메모&팁

### 알고리즘 선택 팁!
- 탐색 범위가 큰 경우에는 '**이진탐색**' 부터 확인해 봐라!
- 간선의 비용이 없고 + 최단 거리 탐색시에는 '**BFS**(with queue)'를 활용하라!


### char to int 2가지 방법
- int value = chars[i] - '0'; // 0의 아스키코드는 48.
  - Eg, int i = '9' - '0'; // 57-48
- int value = Character.getNumericValue(chars[i]);

### 숫자 자리수 구하기
- int digitLength = (int) (Math.log10(list.size()) + 1);