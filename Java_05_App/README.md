# interface argument
* 생성자, method를 설계 할 때 interface가 있는 type으로 argument를 작성하면 클래스와 클래스 간의 결합도를 낮춰 프로젝트가 커졌을 때 많은 장점을 얻을 수 있다
* 다음과 같이 클래스를 매개변수로 갖는 method를 설계 할 때
```
public void method(ArrayList<Interger> list) { }
```
* 다음과 같이 인터페이스를 매개변수로 갖는 method를 설계 할 때
```
public void method(List<Interger> list) { }
```
* 첫번째 코드에서는 다음과 같은 코드로 method를 사용 할 수 밖에 없다
```
ArrayList<Interger> list = new ArrayList<Interger>();

obj.method(list);
```
* 두번째 코드에서는 다음과 같이 유연한 방법으로 method를 사용 할 수 있다
```
List<Interger> list1 = new ArrayList<>();
List<Interger> list2 = new LinkedList<>();

obj.method(list1);
obj.method(list2);
```

# Dependency Inject 디자인 패턴
* 의존성 주입
* 클래스에서 사용하는 ```데이터 객체``` 또는 ```서비스 객체``` 등을 클래스 코드에서 직접 초기화 하지 않고 생성자, setter() method 등을 통하여 주입받는 방식
* 클래스 코드에서 다른 클래스의 객체를 직접 생성하여 사용하는 코드는 클래스와 클래스의 결합도를 높여 프로젝트가 커졌을 때 또는 유지보수에서 많은 불편함을 야기 할 수 있다
* 의존성 주입 패턴을 사용하면 한 개의 클래스를 다양한 기능으로 업그레이드 하기가 쉬워진다
* 코드의 재사용성이 매우 증가한다
* 리팩토링(코드 변경)이 수월해진다
* 보일러코드(비슷하거나 유사한 유형의 코드)가 줄어든다
* 프로젝트의 테스트가 용이해진다

# 참조형 변수를 매개변수로 전달하기
* java 이외의(c, c++) 언어에서는 매개변수를 전달 할 때 주소를 직접 전달하기 위하여 여러가지 기법을 사용한다 : Call by Reference
* java는 기본 타입(primitive)의 변수는 값을 직접 매개변수로 전달한다
* class를 사용하는 참조형(reference type) 변수는 값을 전달하지 않고 실제 데이터가 저장 된 저장소의 주소만 전달한다
* 전달받은 method에서 ```요소의 값```을 변경(추가, 수정, 삭제)하면 전달해 준 곳의 값도 같이 변경된다
* java에서는 이 효과를 Call by Reference라고 하지 않는다 = 참조형 변수를 전달한다 라고 표현한다
