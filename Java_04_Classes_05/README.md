# Java의 interface
## Class의 설계도 역할
* Class를 설계 할 때 method들을 설계하고 method의 이름을 정의하고 return type을 정의하고 argument를 정의하는 일들은 유사한 기능을 하는 Class들은 공통으로 일치시켜야 하는 경우가 많다
* 이때 interface에 미리 method의 모양(prototype)을 만들어두고 Class를 선언 할 때 interface를 implements 하도록 규칙을 정해버린다
* interface를 implement한 Class는 interface에 정의된 method를 반드시 만들어야 한다

## Class의 다형성
* interface로 객체를 선언하고 Class의 생성자를 호출하여 인스턴스로 생성하는 방식의 코드 사용
* 만약 사용하고자 하는 Class를 변경하고 싶으면 Class의 생성자만 변경해주면 모든 코드는 그대로 유지하면서 테스트를 할 수 있다