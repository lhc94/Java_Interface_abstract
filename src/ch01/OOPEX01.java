package ch01;

// 22-03-02
// 인터페이스와 추상클래스 활용하기

// 인터페이스 안에 매서드는 추상메서드 임으로 
// 인터페이스 를 사용하려면 무조건 메서드들을 사용해야한다

// 서브클래스에서 인터페이스내부의 추상메서드를 구현하면
// 만들 때 마다 구현해야하니까 수퍼클래스에다가 구현하자 (원숭이 클래스 주성에서..)

// 공통적인 행위를 하는게 있으면 interface에서 만들고 수퍼클래스에서 미리만들기(냄새맡기 메서드..)



// 인터페이스 : 행위대한 제약
// 추상클래스 : 미완성된 설계도
// 서브클래스 : 구체적인 행위
interface MoveAble {
	//public abstract 기본적으로 생략되어 있음
	void 위();
	void 아래();
	void 오른쪽();
	void 왼쪽();
	void 냄새맡기();
	
}

// 구현이 자식클래스로 위임(위, 아래, 왼쪽, 오른쪽)
abstract class 사나운동물 implements MoveAble {
	abstract void 공격(); //미완성된 메서드
	@Override
	public void 위() {
		System.out.println("위로 이동");
	}
	@Override
	public void 오른쪽() {
		System.out.println("오른쪽으로 이동");
	}
	@Override
	public void 아래() {
		System.out.println("아래로 이동");
	}
	@Override
	public void 왼쪽() {
		System.out.println("왼쪽로 이동");
	}
	@Override
	public void 냄새맡기() {
		System.out.println("냄새 맡기");
	}
	
}

abstract class 온순한동물 implements MoveAble {
	abstract void 채집(); //미완성된 메서드
	@Override
	public void 위() {
		System.out.println("위로 이동");
	}
	@Override
	public void 오른쪽() {
		System.out.println("오른쪽으로 이동");
	}
	@Override
	public void 아래() {
		System.out.println("아래로 이동");
	}
	@Override
	public void 왼쪽() {
		System.out.println("왼쪽로 이동");
	}
	@Override
	public void 냄새맡기() {
		System.out.println("냄새 맡기");
	}
	
}

class 원숭이 extends 온순한동물 {
	@Override
	void 채집() {
		System.out.println("바나나 채집");
	}
	// 서브클래스에서 인터페이스내부의 추상메서드를 구현하면
	// 만들 때 마다 구현해야하니까 수퍼클래스에다가 구현하자
//	@Override
//	public void 위() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void 오른쪽() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void 아래() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void 왼쪽() {
//		// TODO Auto-generated method stub
//	}

}

class 소 extends 온순한동물 {
	@Override
	void 채집() {
		System.out.println("풀 채집");
		
	}
}

class 호랑이 extends 사나운동물{
	@Override
	void 공격() {
		System.out.println("이빨로 공격");
	}
}

class 코뿔소 extends 사나운동물 {
	@Override
	void 공격() {
		System.out.println("뿔로 공격");
		
	}
}

public class OOPEX01 {
	
	static void 조이스틱(온순한동물 u1) {
		u1.위();
		u1.아래();
		u1.왼쪽();
		u1.오른쪽();
		u1.냄새맡기();
		System.out.println("==============");
	}
	
	static void 조이스틱(사나운동물 u1) {
		u1.위();
		u1.아래();
		u1.왼쪽();
		u1.오른쪽();
		u1.냄새맡기();
		System.out.println("==============");
	}
	
	public static void main(String[] args) {
		소 u1 = new 소();
		조이스틱(u1);
		원숭이 u2 = new 원숭이();
		조이스틱(u2);
		호랑이 u3 = new 호랑이();
		조이스틱(u3);
	}
}
