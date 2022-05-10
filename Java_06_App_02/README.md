# 데이터가 있는 프로젝트
* CRUD 구현
## Create : 데이터 추가하기, 키보드에서 입력, 파일 읽어오기
1. 키보드에서 입력
2. 데이터 검증
3. VO 객체에 담기 : VO 클래스를 사용하여 VO 객체 생성 후 setting
4. List에 추가
5. 필요한 곳으로 이동 : file에 저장, DBMS에 insert

## Read : 데이터 조회하기, 저장소에 저장된 데이터를 Select하여 보여주기
1. 데이터 저장소에 연결 : DBConnection, FileOpen(Scanner)
2. 데이터를 모두 읽기
3. VO 객체에 담기 위해 적절히 분해(Encoding)
4. VO를 List 추가
5. Console로 보이기 등을 위하여 이동