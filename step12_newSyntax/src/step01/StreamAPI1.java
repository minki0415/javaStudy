package step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.domain.People;

public class StreamAPI1 {
	
	//step01 : double colon ������ �н�
	public static void m1() {
		People p1 = new People("���缮", 30);
		People p2 = new People("������", 42);
		People p3 = new People("�迬��", 23);
		
		//List<People> ��ü ��ȯ
		System.out.println("----���ٽ� ���---- ");
		Arrays.asList(p1, p2, p3).forEach(System.out::println);
		
		
		System.out.println("----���� �ڵ�----");
		List<People> data = Arrays.asList(p1, p2, p3);
		for(People p : data) {
			System.out.println(p);
		}
	}
	
	//step02 : stream api Ȱ��( -> �� Ȱ���ϴ� ���ٽ� Ȱ��)
	public static void m2() {
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(3); //new Integer(3) ����ڽ�
		all.add(5);
		all.add(2);
		all.add(8);
		
		//stream ��ü�� ��ȯ -> 6������ �����͸� ���� -> int�� ��ȯ�Ͽ� ��
		//filter �޼ҵ� ��ȯ ���� String Ÿ��, ���� ������ ���� mapToInt()ȣ���ؼ� int�� ��ȯ
		int r = all.stream().filter(v -> v <= 6).mapToInt(i -> i).sum();
		System.out.println(r);
		
		System.out.println("----------------------");
		//�ټ��� ������ �߿� 70�� �Ѵ� ������ ���
		List<Integer> data = Arrays.asList(10, 40, 70, 50, 20, 80, 50);
		data.stream().filter(v -> v >= 70).forEach(System.out::println);
		
		Arrays.asList(10, 40, 70, 50, 20, 80, 50).stream().filter(v -> v >= 70).forEach(System.out::println);
		
		System.out.println("----------------------");
		System.out.println(all.stream().filter(v -> v <= 6).mapToInt(i -> i).count());		
		System.out.println(all.stream().filter(v -> v <= 6).mapToInt(i -> i).max()); //5���� ������ Optional ��ü
		System.out.println(all.stream().filter(v -> v <= 6).mapToInt(i -> i).max().getAsInt()); //Optional ��ü�� ���빰 ��ȯ 
		
		System.out.println("----------------------");
		Arrays.asList(10, 40, 70, 50, 20, 80, 50).stream().skip(0).forEach(System.out::println);
		
		System.out.println("-----map---------");
		Arrays.asList(10, 20, 30).stream().map(i -> i*i).forEach(System.out::println);
		
		System.out.println("-----limit---------");
		Arrays.asList(10, 20, 30).stream().limit(2).forEach(System.out::println);
		
		System.out.println("-----flatmap---------");
		Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(10,20,30), Arrays.asList(100, 200, 300) ).stream().flatMap(i -> i.stream()).forEach(System.out::println);
		
		System.out.println("-----reduce----------");
		System.out.println(Arrays.asList(10,20,30,40).stream().reduce((v1,v2) -> v1+v2).get());
		System.out.println(Arrays.asList(10,20,30).stream().reduce((v1,v2)-> v2-v1).get());
		
		System.out.println("-----collect() or iterator()----------");
		System.out.println(Arrays.asList(10,20,30).stream().collect(Collectors.toList()));
		Arrays.asList(10,20,30).stream().iterator().forEachRemaining(System.out::println);
	}
	
	public static void main(String[] args) {
		m2();
	}

}
