package java012_api.part04;

public class Java118_Object_clone {

	public static void main(String[] args) {
		House house = new House("홍길동", 30, new Address("서울","서초동"));
		
		System.out.printf("%s %d %s %s\n",house.name, 
					house.age, house.address.city, house.address.dong);
		
		// shallow copy(얕은 복사)
		House house2 = house;
		house2.name = "김영희";
		house2.address.city = "경기";
		System.out.printf("%s %d %s %s\n",house.name, 
				house.age, house.address.city, house.address.dong);
		
		
		//House houseCopy = house.shallowCopy();
		House houseCopy = house.deepCopy();
		houseCopy.name = "Steven";
		houseCopy.address.city = "제주";
		
		System.out.printf("%s %d %s %s\n",house.name, 
				house.age, house.address.city, house.address.dong);
		System.out.printf("%s %d %s %s\n",houseCopy.name, 
				houseCopy.age, houseCopy.address.city, houseCopy.address.dong);		
		
	}

}
