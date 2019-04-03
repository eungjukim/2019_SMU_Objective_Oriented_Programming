---
layout: post
title:  "Class-and-Object"
date:   2019-04-03 15:25:00
categories: Objective_Oriented_Programming
---

# 2019-04-03-Class-and-Object.md

## 1. 클래스와 객체

	ㆍ클래스 : 붕어빵 틀 / 객체 : 붕어빵

	ㆍ클래스 : 개념 / 객체 : 실제로 존재하는 것

	ㆍ클래스는 사용 불가 => 클래스보다 객체를 사용해야 한다.

	ㆍ모든 클래스는 부모(class object)가 존재한다.

	ㆍ컴파일은 항상 루트 디렉토리에서 실행한다.

	ㆍ클래스명은 반드시 대문자로 시작한다.

```java
//클래스 생성
class 클래스명 {
	타입 변수명;
	...
	타입 함수명(인자...) {
	...
	}
}

//객체 생성
클래스명 c = new 클래스명();
```

## 2. 생성자(constructor)

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

## 3. 가시성(visibility)

	ㆍ캡슐화 : 클래스 틀이 데이터를 가지고 있고, 사용권한을 제어하는 것.

	ㆍ캡슐화는 데이터를 직접적으로 사용하지 못하게 하고, 그 권한을 가시성을 통해 제어한다.

	ㆍ가시성의 종류는 크게 4가지
	|구분|UML 표현|설명|class|package|subclass|any class|
	|:--:|:--:|:--:|:--:|:--:|:--:|:--:|
	|public|-|모두 사용 가능|Y|Y|Y|Y|
	|private|+|나만 사용 가능|Y|Y|Y|N|
	|protected|#|가족, 상속|Y|Y|N|N|
	|package|~|친구|class|Y|N|N|N|


	ㆍget 함수와 set 함수를 이용해 가시성이 적용된 값을 조회한다.
```java
float getWeight() {
	return weight;
}

void setWeight(float weight) {
	this.weight=weight;
}
```


