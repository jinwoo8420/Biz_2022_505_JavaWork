# 한정자, 제한자
* public, private, protected
* 다른 클래스에서 method, 변수에 접근 할 수 있는 권한을 제한한다
(못하게 하는게 아니고 권한이 있으면 할 수 있고 없으면 못 함)

## public
* 한 프로젝트에 있는 다른 클래스의 method를 자유롭게 호출하여 사용 할 수 있다
* class는 특별한 경우가 아니면 모두 public으로 선언한다
* method는 같은 클래스 내에서만 한정적으로 사용 할 때는 private으로 선언하고
그외는 public 또는 protected로 선언한다
* 변수에도 public을 선언 할 수 있는데 변수를 class 영역에 선언했을때만 가능하다
method 내에 선언된 변수에는 적용 할 수 없다
* 전역 설정이라고 한다

## private
* 같은 클래스에서만 접근 할 수 있도록 은닉하는것이다
* 보통 method, 변수에만 설정한다

## 생략할 경우
* method에 한정자를 생략하면 같은 package에 있는 클래스에서만 호출 할 수 있다