/* �н�����
 * 1. �ǽ�����
 * 	Ű����� �Է��� �����͸� �������ϴ� �ܼ�â�� ����غ���
 * 		- ������ ���� : ���� ���� �� ������ ���
 * 		- �������� : ���� ����, ���Ӱ� ��� ���� �ۼ� or �������� �����ϸ鼭 ���� �߰�(append)
 * 
 * 
 * 	�����ϴ� ���Ϸκ��� �������ϴ� ���� �ܼ�â�� ���
 * 		- �߻� ������ ����� ��
 * 		1) ���� ����(�����͸� ������ ������ ����)
 * 		2) �����͸� read �Ϸ��� ������ ���� -> FileNotFoundException �߻�
 * 
 * 
 * 2. java.io package���� API ����
 * 		- ~InputStream/!OutputStream : 1byte ������� ������ϴ� API
 * 		- ~Reader/~Writer : 2byte ������� ������ϴ� API
 * 		- ��� ���డ���� ��ü �����ؼ� �ʿ��� �޼ҵ� ȣ�⸸ �ϸ� ��
 * 		1) Ű���� : System.in
 * 		2) �ܼ� : System.out
 * 		3) file�κ��� ������ read ����� class - FileInputStream/FileReader
 * 		4) file�� ������ write ����� class - FileOutputStream/FileWriter
 * 
 * 3. ����
 * 		- ��� ����� io(input/output)�� �ý��� �ڿ��� ���
 * 			����� ������ �ϵ���� �ڿ� ����� ����Ѵ�.
 * 			���� ����ÿ� �ڿ� ��ȯ(����) �ʼ�
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
	
	/* Ű���� : System.in
	 * �ܼ� : System.out
	 * 
	 * �ѱ� ������ �����
	 * 	- �ֿܼ� ��½� �ܼ� ���� : System.out / ��� println()
	 * 
	 * buffer��� Ȱ��
	 * 	- BufferedReader : enter �������� ���ڿ��� �����ؼ� �� ���ڿ��� read ������ �޼ҵ� ���� 
	 * 
	 * Systme.in : 1byte / BufferedReader : 2byte
	 * 	- 1byte�� 2byte ȣȯ�����ִ� API �ʿ� 
	 * 	- InputStreamReader API �� ȣȯ
	 * 
	 * BufferedReader(Reader in){}  :         (2) 2byte �����ͷ� ��ȯ�� ������ read
	 * InputStramReader(InputStream in){} :   (1) 1byte�� 2byte�� ��ȯ 
	 * 
	 * ���� 2�� ���� - �ǽð� �Է� �� ������� ����
	 * 	- �ǽð� �Է�(read/write �ݺ�) : �ݺ��� �ʿ�
	 * 		������ ���� ���� ���� : string ������ read �� ���� ���δ� null�� ����
	 * 	- ����� ��� �� ctrl + z�� ����
	 */
	//Ű���忡 �ԷµǴ� ������ ���
	public static void m() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println(in.readLine()); //���κ��� ������ �ܼ�â �Է� �� ���
		
		String data = in.readLine();
		
		while(data != null) {
			System.out.println(data);
			data = in.readLine();
		}
	}
	
	/* FileWriter API
	 * = playdata.txt ���� ����
	 */
	// Ű����� ���� read�� �����͸� ���Ͽ� ���
	public static void m2() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new FileWriter("playdata.txt"));
		
		String data = in.readLine();
		
		while(data != null) {
			out.write(data);
			data = in.readLine();
			out.flush(); //buffer �޸𸮿� �����ɼ��� �ִ� �����͸� ����ϰԲ� ���ִ� ��� 
		}
		
		in.close(); //�Է� �ý��� �ڿ� ����
		out.close(); //��� �ý��� �ڿ� ����
	}
	

	//m3() : m2() �޼ҵ� -> �ǹ��� �������� �ڵ�� ����
	public static void m3() throws IOException{
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			in = new BufferedReader(new InputStreamReader(System.in));			
			out = new BufferedWriter(new FileWriter("playdata.txt", true)); // , true -> ���� ���뿡 ���ٿ��� �ۼ� 
			
			String data = in.readLine();
			
			while(data != null) {
				out.write(data);
				out.newLine(); // new line �����ϴ� �޼ҵ�
				out.flush(); //buffer �޸𸮿� �����ɼ��� �ִ� �����͸� ����ϰԲ� ���ִ� ��� 
				data = in.readLine();
			}
			
		}finally {
			if(in!= null) {
				in.close(); //�Է� �ý��� �ڿ� ����
				in = null;
			}
			
			if(out != null) {
				out.close(); //��� �ý��� �ڿ� ����		
				out = null;
			}
		}
	}
	
	
	//playdata.txt file read�ؼ� endore.txt�� ���
	public static void m4() throws IOException{
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			in = new BufferedReader(new FileReader("playdata.txt"));			
			out = new BufferedWriter(new FileWriter("encore.txt", true)); // , true -> ���� ���뿡 ���ٿ��� �ۼ� 
			
			String data = in.readLine();
			
			while(data != null) {
				out.write(data);
				System.out.println(data);
				
				out.newLine(); // new line �����ϴ� �޼ҵ�
				out.flush(); //buffer �޸𸮿� �����ɼ��� �ִ� �����͸� ����ϰԲ� ���ִ� ��� 
				data = in.readLine();
			}
			
		}finally {
			if(in!= null) {
				in.close(); //�Է� �ý��� �ڿ� ����
				in = null;
			}
			
			if(out != null) {
				out.close(); //��� �ý��� �ڿ� ����		
				out = null;
			}
		}
	}
	
	/* my.properties ���� �� ������ ����
	 *  - key = value
	 *  
	 *  my.prorperties ���� �ִ� Ư�� key�� �ش��ϴ� value���� ���
	 * 
	 * ���߽� �������
	 * my.properties ���� Ȱ�� API -> Properties Ŭ����
	 * 
	 */
	public static void m5() {
		Properties stuInfo = new Properties();
		
		//my.properties Properties ��ü�� �ε�(����)
		try {
			//step07_API �ٷ� ������ ������ ��쿡�� ���� ����
			//stuInfo.load(new FileReader("my.properties"));
			
			
			//?step07_API/src/my.properties ��ε� �������� �����غ���
			//stuInfo.load(new FileReader("src/my.properties"));
			
			// . : ���� ��� �ǹ�
			// ./ : �� ��� ������ src ������ ���� �ǹ�
			//stuInfo.load(new FileReader("./src/my.properties"));
			
			//���� ���
			stuInfo.load(new FileReader("C:\\20220103_lab\\01.java\\step07_API\\my.properties"));
			
			//key�� value�� ȹ���ϴ� �޼ҵ�(�߿�)
			System.out.println(stuInfo.getProperty("stu1"));
			
		//} catch (FileNotFoundException e) { //IOException ���� ��ü �� ���� ���� �ϱ� ������ �����ص� ��
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






