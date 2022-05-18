import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Scanner scanner = new Scanner(System.in); // 创建 Scanner 对象
        System.out.print("Input your name:");
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age:");
        int age = scanner.nextInt(); // 读取一整行并获取整数
        System.out.printf("Hi, %s, you are %d", name, age); // 格式化输出
	}

}
