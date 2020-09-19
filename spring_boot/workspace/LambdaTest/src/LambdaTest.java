import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("�ڹ�", "����", "��Ʈ");
		//1�ܰ� : MyConsumer Ŭ���� ���� ����
		asList.forEach(new MyConsumer());
		
		//2�ܰ� : Consumer�� anonymous inner class�� �����ؼ� accept �޼��带 �������̵� �ϱ�.
		asList.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		//3�ܰ� : Consumer�� accept() �޼��� �������̵��� ���ٽ����� ����ϱ�
		System.out.println("���ٽ����� �޼��� �������̵�");
		asList.forEach(value -> System.out.println(value));
	
		//4�ܰ� : Consumer�� accept() �޼��� �������̵��� Method Reference�� ����ϱ�
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