package ex02;
// 자바에선 Field, Constructor, Method 가 꼭 있어야 함
class Member {
	// Field : 데이터
	String name;
	String uid;
	String email;
	int regYear;
	
	//기본 생성자 
	// static 을 붙히지 않았기 때문에 생성자를 호출해야함 
//	public Member() {}
	
	//인자 있는 생성자 - 최소화, 인자 : 메서드나 생성자를 호출할 때 전달하는 실제 값
	public Member(String n, String u, String e, int rY) {
		name = n;
		uid = u;
		email = e;
		regYear = rY;
	}
	
	// Method : 기능
	void info() {
		String fmt = "이름: %s\n아이디: %s\n이메일: %s\n연도: %d\n"; 

		String msg = String.format(fmt, name, uid, email, regYear);
		System.out.println(msg);
	}
}
public class TestMember {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//최소화 
		Member [] mList = new Member[3]; //배열 생성
		mList[0] = new Member("사나", "sana", "sana@hive.com", 2012); // 배열 안에 저장할 Member 생성
		mList[1] = new Member("미나", "mina", "mina@hive.com", 2011);
		mList[2] = new Member("모모", "momo", "momo@hive.com", 2010);
		
		mList[0].info();
		mList[1].info();
		mList[2].info();	
		
		for(int i = 0; i < mList.length; i++) {
			Member member = mList[i];
			member.info();
		}
		
		System.out.println("---------------------------------------------------");
		

//		Member m1 = new Member();
//		m1.name = "사나";
//		m1.uid = "sana";
//		m1.email = "sana@hive.com";
//		m1.regYear = 2000;
//		m1.info();
//		
//		Member m2 = new Member();
//		m2.name = "지효";
//		m2.uid = "jihyu";
//		m2.email = "jihyu@hive.com";
//		m2.regYear = 2001;
//		m2.info();
//		
//		Member m3 = new Member();
//		m3.name = "모모";
//		m3.uid = "momo";
//		m3.email = "momo@hive.com";
//		m3.regYear = 1997;
//		m3.info();	
		
		// member 배열에 저장
//		Member[] mList = new Member[3]; //배열 생성
//		mList[0] = new Member(); // 배열 안에 저장할 Member 생성
//		mList[0].name = "사나";
//		mList[0].uid = "sana";
//		mList[0].email = "sana@hive.com";
//		mList[0].regYear = 2000;
		
	}

}
