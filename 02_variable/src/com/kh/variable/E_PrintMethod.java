package com.kh.variable;

public class E_PrintMethod {
	//�ߺ��Ǵ� ������ Ŭ������ ���� �ϱ�~~~!!!!!!!!!
	//�������� : ��� ������ ���� �����ִº���
	String str1 = "�ȳ��ϼ���";
	String str2 = "�ݰ����ϴ�.";
	
		public void printExample() {
			//�������� : �޼ҵ� ���� �ȿ����� ����Ҽ��ִ� ���� 
//			String str1 = "�ȳ��ϼ���";
//			String str2 = "�ݰ����ϴ�";
			
			System.out.print(str1);
			System.out.print(str2);
		}
		public void printlnExample() {
//			String str1 = "�ȳ��ϼ���";
//			String str2 = "�ݰ����ϴ�";

			System.out.println(str1);
			System.out.println(str2);
			System.out.println("������");
		}
		public void printfExample() {
			//�ȳ��ϼ���, �������Դϴ�. �ݰ����ϴ�.
			//�ȳ��ϼ��� = str1 , �ݰ����ϴ�. = str2
			System.out.printf("%s, �������Դϴ�. %s", str1, str2);
			//System.out.printf("���� ����ϰ��� �ϴ� ����", ����ϰ��� �ϴ� ����(�������))
			
			//�ݰ����ϴ�, ģ�ϰ� ������. (str1,str2�� ����ؼ�)
			System.out.printf("%s, ģ�ϰ� ������.",str2);
			System.out.println(); // �ٹٲ��� �ϰڴ�
			
			//�̴Ϲ���
			//�ȳ��ϼ���, ���� 20�� �ڽſ� �����Դϴ�. ������ �ݰ����ϴ�.
			int age =20;
			String name = "�ڽſ�";
			String job ="����";
			System.out.printf("%s, ���� %d�� %s %s�Դϴ�. ������ %s",str1,age,name,job,str2);
		}
}
