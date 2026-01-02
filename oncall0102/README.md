# 미션 - 개발자 비상근무

제출전 /gradlew.bat clean test
자바 버전 확인

version : 1.0 초안 작성

## 기능 구현 리스트

- **Day(`enum`)**
- [x] 받은 값이 무슨 요일인지 반환

- **Month(`enum`)**
- [x] 받은 값이 몇월인지 반환

- **Holiday(`enum`)**
- [x] 자기자신이 포함되어있는지 체크

- **Weekend**
- [ ] 주말 순번 받음

- **Weekday**
- [ ] 평일 순번 받음

- **Parser**
- [x] 입력값을 People에게 List<String> 형태로 반환

- **People**
- [ ] List<String> 갖고있음
- [ ] (검증) 사람 이름이 5자 미만인지
- [ ] (검증) 사람 35명 이하인지
- [ ] (검증) 이름이 중복되진 않았는지
- [ ] (검증) 이름중에 빈값은 없는지

- **Checker**
- [ ] 휴일에서 평일, 평일에서 휴일 넘어가는지 체크

- **Calender**
- [ ] Day에게 받은값으로 부터 달력 생성
- [ ] 