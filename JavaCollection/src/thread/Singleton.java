package thread;
/*
@Date:2015.07.30
@Author : me
@Story : 싱글톤
* */
// getInstance();
public class Singleton {
	/*====== 필드 ======*/
	private static Singleton singleton = new Singleton();
	/*====== 생성자 ======*/
	private Singleton() { // 싱글톤에서는 생성자를 private 으로 은닉화 시킨다.
		System.out.println("인스턴스 생성");
	}
	/*====== 멤버메소드 ======*/
	public static Singleton getInstacne(){
		
		return singleton;
	}
		
	}
	

