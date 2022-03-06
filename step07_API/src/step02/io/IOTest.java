/* 학습내용
 * 1. 실습로직
 * 	키보드로 입력한 데이터를 미존재하는 콘솔창에 출력해보기
 * 		- 미존재 파일 : 파일 생성 및 데이터 출력
 * 		- 존재파일 : 내용 갱신, 새롭게 모든 내용 작성 or 기존내용 유지하면서 내용 추가(append)
 * 
 * 
 * 	존재하는 파일로부터 미존재하는 파일 콘솔창에 출력
 * 		- 발생 가능한 경우의 수
 * 		1) 정상 실행(데이터를 보유한 파일이 존재)
 * 		2) 데이터를 read 하려는 파일이 없음 -> FileNotFoundException 발생
 * 
 * 
 * 2. java.io package에서 API 제공
 * 		- ~InputStream/!OutputStream : 1byte 기반으로 입출력하는 API
 * 		- ~Reader/~Writer : 2byte 기반으로 입출력하는 API
 * 		- 기능 수행가능한 객체 생성해서 필요한 메소드 호출만 하면 됨
 * 		1) 키보드 : System.in
 * 		2) 콘솔 : System.out
 * 		3) file로부터 데이터 read 기능의 class - FileInputStream/FileReader
 * 		4) file에 데이터 write 기능의 class - FileOutputStream/FileWriter
 * 
 * 3. 참고
 * 		- 모든 언어의 io(input/output)는 시스템 자원을 사용
 * 			입출력 가능한 하드웨어 자원 기능을 사용한다.
 * 			로직 종료시에 자원 반환(해제) 필수
 * 
 */

package step02.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class IOTest {
	
	/* 키보드 : System.in
	 * 콘솔 : System.out
	 * 
	 * 한글 데이터 입출력
	 * 	- 콘솔에 출력시 콘솔 지정 : System.out / 출력 println()
	 * 
	 * buffer기능 활용
	 * 	- BufferedReader : enter 기준으로 문자열을 구분해서 한 문자열로 read 가능한 메소드 지원 
	 * 
	 * Systme.in : 1byte / BufferedReader : 2byte
	 * 	- 1byte와 2byte 호환시켜주는 API 필요 
	 * 	- InputStreamReader API 로 호환
	 * 
	 * BufferedReader(Reader in){}  :         (2) 2byte 데이터로 변환된 데이터 read
	 * InputStramReader(InputStream in){} :   (1) 1byte를 2byte로 변환 
	 * 
	 * 로직 2차 개선 - 실시간 입력 및 출력으로 변경
	 * 	- 실시간 입력(read/write 반복) : 반복문 필요
	 * 		데이터 존재 여부 검증 : string 단위로 read 시 존재 여부는 null로 검증
	 * 	- 종료는 어떻게 ㅣ ctrl + z로 종료
	 */
	//키보드에 입력되는 데이터 출력
	public static void m() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println(in.readLine()); //라인별로 데이터 콘솔창 입력 및 출력
		
		String data = in.readLine();
		
		while(data != null) {
			System.out.println(data);
			data = in.readLine();
		}
	}
	
	/* FileWriter API
	 * = playdata.txt 파일 생성
	 */
	// 키보드로 부터 read한 데이터를 파일에 출력
	public static void m2() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new FileWriter("playdata.txt"));
		
		String data = in.readLine();
		
		while(data != null) {
			out.write(data);
			data = in.readLine();
			out.flush(); //buffer 메모리에 잔존될수도 있는 데이터를 출력하게끔 해주는 기능 
		}
		
		in.close(); //입력 시스템 자원 해제
		out.close(); //출력 시스템 자원 해제
	}
	

	//m3() : m2() 메소드 -> 실무형 안정적인 코드로 개선
	public static void m3() throws IOException{
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			in = new BufferedReader(new InputStreamReader(System.in));			
			out = new BufferedWriter(new FileWriter("playdata.txt", true)); // , true -> 기존 내용에 덧붙여서 작성 
			
			String data = in.readLine();
			
			while(data != null) {
				out.write(data);
				out.newLine(); // new line 적용하는 메소드
				out.flush(); //buffer 메모리에 잔존될수도 있는 데이터를 출력하게끔 해주는 기능 
				data = in.readLine();
			}
			
		}finally {
			if(in!= null) {
				in.close(); //입력 시스템 자원 해제
				in = null;
			}
			
			if(out != null) {
				out.close(); //출력 시스템 자원 해제		
				out = null;
			}
		}
	}
	
	
	//playdata.txt file read해서 endore.txt에 출력
	public static void m4() throws IOException{
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			in = new BufferedReader(new FileReader("playdata.txt"));			
			out = new BufferedWriter(new FileWriter("encore.txt", true)); // , true -> 기존 내용에 덧붙여서 작성 
			
			String data = in.readLine();
			
			while(data != null) {
				out.write(data);
				System.out.println(data);
				
				out.newLine(); // new line 적용하는 메소드
				out.flush(); //buffer 메모리에 잔존될수도 있는 데이터를 출력하게끔 해주는 기능 
				data = in.readLine();
			}
			
		}finally {
			if(in!= null) {
				in.close(); //입력 시스템 자원 해제
				in = null;
			}
			
			if(out != null) {
				out.close(); //출력 시스템 자원 해제		
				out = null;
			}
		}
	}
	
	/* my.properties 생성 및 데이터 저장
	 *  - key = value
	 *  
	 *  my.prorperties 내에 있는 특정 key에 해당하는 value값만 출력
	 * 
	 * 개발시 고려사항
	 * my.properties 파일 활용 API -> Properties 클래스
	 * 
	 */
	public static void m5() {
		Properties stuInfo = new Properties();
		
		//my.properties Properties 객체에 로딩(저장)
		try {
			//step07_API 바로 하위에 존재할 경우에만 정상 실행
			//stuInfo.load(new FileReader("my.properties"));
			
			
			//?step07_API/src/my.properties 경로도 정상으로 개발해보기
			//stuInfo.load(new FileReader("src/my.properties"));
			
			// . : 현재 경로 의미
			// ./ : 현 경로 하위에 src 하위에 파일 의미
			//stuInfo.load(new FileReader("./src/my.properties"));
			
			//절대 경로
			stuInfo.load(new FileReader("C:\\20220103_lab\\01.java\\step07_API\\my.properties"));
			
			//key로 value를 획득하는 메소드(중요)
			System.out.println(stuInfo.getProperty("stu1"));
			
		//} catch (FileNotFoundException e) { //IOException 하위 객체 다 수용 가능 하기 때문에 삭제해도 됨
		//	e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		m5();
		
//		try {
//			m4();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}






