import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        Scanner scanner = new Scanner(System.in); // ���� Scanner ����
        System.out.print("Input your name:");
        String name = scanner.nextLine(); // ��ȡһ�����벢��ȡ�ַ���
        System.out.print("Input your age:");
        int age = scanner.nextInt(); // ��ȡһ���в���ȡ����
        System.out.printf("Hi, %s, you are %d", name, age); // ��ʽ�����
	}

}
