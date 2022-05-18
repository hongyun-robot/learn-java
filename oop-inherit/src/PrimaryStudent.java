/**
 * 2022-05-10
 */

/**
 * @author admin
 *
 */
public class PrimaryStudent extends Student {
	
	protected int grade;

	/**
	 * @param name
	 * @param age
	 * @param score
	 */
	public PrimaryStudent(String name, int age, int score, int grade) {
		super(name, age, score);
		// TODO 自动生成的构造函数存根
		this.grade = grade;
	}

}
