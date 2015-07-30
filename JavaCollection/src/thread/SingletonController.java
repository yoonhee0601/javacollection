package thread;
/*
@Date:2015.07.30
@Author : me
@Story : 싱글톤
* */
public class SingletonController {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstacne();
		Singleton singleton2 = singleton.getInstacne();
		Sample sample = new Sample();
		Sample sample2 = new Sample();
		if (singleton == singleton2) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		if (sample == sample2) {
			System.out.println("생플 객체 같다");
		} else {
			System.out.println("샘플 객첵 다르다.");
		}
	}
}
