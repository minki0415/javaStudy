package step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.domain.People;

public class StreamAPI1 {
	
	//step01 : double colon 연산자 학습
	public static void m1() {
		People p1 = new People("유재석", 30);
		People p2 = new People("백종원", 42);
		People p3 = new People("김연아", 23);
		
		//List<People> 객체 반환
		System.out.println("----람다식 사용---- ");
		Arrays.asList(p1, p2, p3).forEach(System.out::println);
		
		
		System.out.println("----기존 코드----");
		List<People> data = Arrays.asList(p1, p2, p3);
		for(People p : data) {
			System.out.println(p);
		}
	}
	
	//step02 : stream api 활용( -> 를 활용하는 람다식 활용)
	public static void m2() {
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(3); //new Integer(3) 오토박싱
		all.add(5);
		all.add(2);
		all.add(8);
		
		//stream 객체로 변환 -> 6이하인 데이터만 정제 -> int로 변환하여 합
		//filter 메소드 반환 값은 String 타입, 따라서 연산을 위해 mapToInt()호출해서 int로 변환
		int r = all.stream().filter(v -> v <= 6).mapToInt(i -> i).sum();
		System.out.println(r);
		
		System.out.println("----------------------");
		//다수의 정수들 중에 70점 넘는 점수만 출력
		List<Integer> data = Arrays.asList(10, 40, 70, 50, 20, 80, 50);
		data.stream().filter(v -> v >= 70).forEach(System.out::println);
		
		Arrays.asList(10, 40, 70, 50, 20, 80, 50).stream().filter(v -> v >= 70).forEach(System.out::println);
		
		System.out.println("----------------------");
		System.out.println(all.stream().filter(v -> v <= 6).mapToInt(i -> i).count());		
		System.out.println(all.stream().filter(v -> v <= 6).mapToInt(i -> i).max()); //5값을 보유한 Optional 객체
		System.out.println(all.stream().filter(v -> v <= 6).mapToInt(i -> i).max().getAsInt()); //Optional 객체의 내용물 반환 
		
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
