package ncs.test08;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;

	public User() {

	}
	
	public User(String id, String password, String name, int age, char gender, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	
	public String toString() {
		return String.format("%s %s %s %d %c %s", id, password, name, age, gender, phone);
	} 
	
	public boolean Booleanequals(Object obj) {
		return ((User)obj).toString().equals(toString());
	}
	
	public Object clone() {
		User obj = new User(id,password,name,age,gender,phone);
		return obj;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
