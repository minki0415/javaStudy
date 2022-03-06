/* �н����� : MAP
 * 1. ������ ������(key)�� ��(value) ���� �� Ȱ���ϴ� ����
 * 2. ��ü Ÿ�Ը� Ȱ�� 
 * 3. key�� �ߺ� ����/ value�� �ߺ� ����
 * 
 */

package step01.test;

import java.util.ArrayList;
import java.util.HashMap;

import model.domain.Employee;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> maps = new HashMap<String, String>();
		maps.put("a", "���缮"); //����
		maps.put("b", "������"); //����
		maps.put("c", "������"); //���� ��, a��� key�� �̹� �����ϴ� ��ü�� ���� �� ����
		
		//�����ǵ� toString() ��ȯ�� �ܼ����
		System.out.println(maps); // {a=������, b=������}
		
		//������ key�� ������ �ϳ� �̾Ƽ� ���
		String v = maps.get("a");
		System.out.println(v);
		
		
		HashMap<String, Employee> maps2 = new HashMap<String, Employee>();
		maps2.put("11", new Employee("11", "smith", 10));
		maps2.put("22", new Employee("22", "master", 10));
		
		//? smith �̸��� ����غ���
		System.out.println(maps2.get("11").getEname()); // smith
		
		/* �μ����� ���� ����(ArrayList) -> �μ��� �����ڷ� ��� �������� ����(HashMap)
		 * 
		 */
		System.out.println("***Map�� List ���� �� Ȱ��***");
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("11", "emp01", 10));
		emps.add(new Employee("22", "emp02", 10));
		emps.add(new Employee("33", "emp03", 10));
		
		HashMap<String, ArrayList<Employee>> all = new HashMap<String, ArrayList<Employee>>();
		all.put("�ѹ���", emps);
		
		//? emp03 �̶�� ���� �̸� ���
		System.out.println(all.get("�ѹ���").get(2).getEname());
		
		//? emp02 -> ���������� ���� -> ���(Ȯ��)
		all.get("�ѹ���").get(1).setEname("������");
		System.out.println(all.get("�ѹ���"));
		System.out.println(all.get("�ѹ���").get(1).getEname());
	}

}
