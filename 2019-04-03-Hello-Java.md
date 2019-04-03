---
layout: post
title:  "Hello-Java"
date:   2019-04-03 14:34:00
categories: Objective_Oriented_Programming
---

# 2019-04-03-Hello-Java.md

## 1. Java

	ㆍReuse vs. Rework : Java는 class 위주로 재사용하지만, C는 함수 위주로 재사용한다.

	ㆍIDE(Integrated Development Environment) : 통합개발환경

	ㆍ컴파일 언어이다.

	ㆍJshell : Java에 스크립트 기능을 추가한 것(9 이상 버전부터 사용가능).

	ㆍ객체지향적(캡슐화, 상속, 다형성...)이다.
		=> 객체지향이란, 정보를 보호하기 위한 하나의 방법.


## 2. 컴파일 환경 만들기

	ㆍJava 다운로드 후, 환경변수에 Java의 bin 폴더 주소를 추가해준다.
		=> Java가 잘 등록되었는지 확인하기 위해서는,
		```java
		java -version
		javac -version
		```	
		을 입력해본다.

	ㆍcd 폴더명 : 하위 폴더로 이동

	ㆍcd .. : 상위 폴더로 이동

	ㆍmkdir 폴더명 : 폴더 생성

	ㆍrmdir 폴더명 : 폴더 삭제

	ㆍdir 폴더명 : 폴더 구성 보기

```java
java -version
javac -version
mkdir Code
cd Code
mkdir 201410078
cd 201410078
mkdir class
mkdir library
mkdir src
dir 201410078
```

## 3. 컴파일하기

	ㆍJava 파일명 = 클래스명 = 생성자명 이어야 한다.

	ㆍ컴파일은 항상 루트 디렉토리에서 실행한다.

	ㆍ컴파일 방법

```java
//저장 장소 지정
javac -d classes -sourcepath src src\파일명.java
//컴파일
java -classpath classes 클래스명
```
	=> -d : 결과물을 해당 폴더로 이동
	=> -sourcepath : 소스코드가 존재하는 폴더
	=> -classpath : 클래스가 저장된 폴더


## 4. 클래스 vs. 객체

	ㆍ클래스 : 붕어빵 틀 / 객체 : 붕어빵

	ㆍ클래스 : 개념 / 객체 : 실제로 존재하는 것

	ㆍ클래스는 사용 불가 => 클래스보다 객체를 사용해야 한다.

	ㆍ모든 클래스는 부모(class object)가 존재한다.

	ㆍ컴파일은 항상 루트 디렉토리에서 실행한다.

	ㆍ클래스명은 반드시 대문자로 시작한다.

	ㆍ클래스 생성
```java
class 클래스명 {
	타입 변수명;
	...
	타입 함수명(인자...) {
	...
	}
}
```

## 5. 생성자(constructor)

	ㆍ함수이지만, 보통의 함수와 달리 객체를 생성하는 것이 목적이다.

	ㆍ생성자를 만드는 두 가지 방법
		=> 기본 생성자(default constructor)를 만든다.
		=> 새로운 생성자를 만든다(constructor overloading).

	ㆍ기본 생성자
		- 매개변수가 없는 생성자는 기본으로 제공된다(구현하지 않아도 됨).
		- 클래스명과 동일하다.
		- return이 없다(void X).
		- public, private 등의 가시성을 가질 수 있다.

	ㆍconstructor overloading
		- 생성자 이름은 동일하지만, 매개변수가 다르다.
		- overloading : 같은 클래스에서 함수 이름은 같게, 그러나 매개변수만을 다르게 해서 구현하는 것.




