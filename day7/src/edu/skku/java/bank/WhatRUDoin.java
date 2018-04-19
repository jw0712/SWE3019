package edu.skku.java.bank;

public class WhatRUDoin {
	//override 조건 시험에 꼭꼭 나오니까 주의주의~!~!
	
	
/*Problem
A 은행의  통장 관리 프로그램을 구축하여 보자.
은행 통장으로는  
일반통장 (Account) : 계좌번호, 비밀번호, 잔액
마이너스통장 (MinusAccount): 계좌번호, 비밀번호,잔액, 한도액

작성해야 할 프로그램의 기능
1. 통장들 정보를 저장할 클래스를 생성하세요.(Accout.java,  Minus.java )
2. 통장 관리를 위한 BankManager.java 를 생성한다.
1 ) 통장 정보를 저장할 수 있는 기능- add(a:Account)
2)  모든 통장 정보를 확인 할 수 있는 기능- search()
통장 번호를 입력하면 통장 정보를 출력하는 기능- search(num:String) :Account
마이너스 통장만을 검색하는 기능- searchMinus(): void
5)  전체 통장 잔고를 계산하는 기능- getTotal(): int
6)  입금(통장번호, 금액)하는 기능- deposit(num:String, money:int):void
출금(통장번호, 비밀번호, 금액)하는 기능
- withdraw(num:String, pw:int, money:int):void
계좌이체(통장번호, 비밀번호, 금액, 이체통장번호)하는 기능
- trans(num:String, pw:int, money:int, num2:String):void

3. 통장관리가 잘 구현 되었는지 Test.java를 구현한다.
(단, 모든 출력은 Test.java 에서 수행한다.)


 * */
//--------------------------------------------------------
	/*
	 *어떤 기능? 어떤 데이터?
이미 나랑 유사한 애가 있다면 상속받아 쓴다 !
-----------------------------------------------
UP(Unified Process)애자일 방법론
UML(Unified Modeling Language)
하이브리드  룰루
-----------------------------------------------
This: 현재 수행 중인 객체

Public int getSeats(Car c){
 int sum = 0;
 If(c instanceof Bus){
   Bus b = (Bus) c; //casting  상속관계일 때만 가능 !!
   Sum=sum+b.getSeat();
   }
}
int k = 30;
double d= k; //자동 형변환
int n = (int) d; // 명시적 형변환

 */
}
