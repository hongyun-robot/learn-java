
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Person {

	private String name;
	private String lastName;
	private String firstName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(String lastName, String firstName) {
		this.name = lastName + ' ' + firstName;
	}

}
