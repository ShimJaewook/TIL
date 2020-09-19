import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("자바", "람다", "부트");
		//1단계 : MyConsumer 클래스 생성 전달
		asList.forEach(new MyConsumer());
		
		//2단계 : Consumer를 anonymous inner class로 생성해서 accept 메서드를 오버라이딩 하기.
		asList.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		//3단계 : Consumer의 accept() 메서드 오버라이딩을 람다식으로 사용하기
		System.out.println("람다식으로 메서드 오버라이딩");
		asList.forEach(value -> System.out.println(value));
	
		//4단계 : Consumer의 accept() 메서드 오버라이딩을 Method Reference로 사용하기
		System.out.println("Method Reference");
		asList.forEach(System.out::println);
	}
}

class MyConsumer implements Consumer<String> {
	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}