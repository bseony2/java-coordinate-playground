## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

## 기능 목록
* UI 기능
  * 사용자에게 좌표 입력받는 UI 구현
  * 출력 UI 구현
* 좌표 생성 기능 구현
  * 사용자 입력을 좌표로 변환하는 기능 구현
* 도형 생성 기능 구현
  * 팩터리 메서드 구현
  * 선분 구현
  * 사각형 구현
  * 삼각형 구현
* 각 도형의 길이 및 면적 기능 구현
  * 선분 길이 구하는 기능 구현
  * 사각형의 면적 구하는 기능 구현
  * 삼각형의 면적 구하는 기능 구현