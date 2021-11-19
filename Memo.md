# 코딩 테스트 메모&팁

### char to int 2가지 방법
- int value = chars[i] - '0'; // 0의 아스키코드는 48.
  - Eg, int i = '9' - '0'; // 57-48
- int value = Character.getNumericValue(chars[i]);

### 숫자 자리수 구하기
- int digitLength = (int) (Math.log10(list.size()) + 1);