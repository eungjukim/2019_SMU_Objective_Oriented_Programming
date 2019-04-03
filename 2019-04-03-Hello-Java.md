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



