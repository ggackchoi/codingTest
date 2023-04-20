## 숫자고르기 2668

### 풀이



#### 집합들을 구해서 모두 구해서 중복을 확인한 후 순서대로 출력
#### list.sort(Comparator.naturalOrder()); 로 정렬
#### list = list.stream().distinct().collect(Collectors.toList());로 중복 제거