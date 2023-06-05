package Day9Prac;

class Profile
{
	
	private String name;
	private String addr;
	private String job;
	private String major;
	
	// 생성자
	// 1) 디폴트 생성자 삽입
	public Profile()
	{
		
	}
	
	// 2) 모든 인자를 받는 생성자
	public Profile(String name, String addr, String job, String major)
	{
		this.name = name;
		this.addr = addr;
		this.job = job ;
		this.major = major;
	}
	// 3) 문자열로 인자를 한번에 받아서 , 를 기준으로 잘라내어 각 속성에 저장
	// "홍길동, 대구, 프로그래머, 컴퓨터공항" -> [홍길동,대구,프로그래머,컴퓨터공항]
	public Profile(String args)
	{ 
		args = args.trim(); // 앞뒤 공백 제거
		String arr[] = args.split(","); // , 기준으로 잘라내기
		this.name=arr[0];
		this.addr=arr[1];
		this.job=arr[2];
		this.major=arr[3];
	}
	
	// toString() 재정의
	public String toString()
	{
		return "이름: " + this.name + " 주소: " + this.addr + " 직업: " + this.job + " 전공: " + this.major;
	}
	
	// Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	boolean isContain(String findstr)
	{
		
//		boolean isContain = false;
//		// findstr의 문자열이 각멤버인 name,addr,job,major 중 하나라도 포함되어 있으면 true 리턴
//		// 아니면 false 리턴
//		
//		if(findstr.contains("길동") || findstr.contains("컴퓨터"))
//			isContain = true;
//		else
//			isContain = false;
//		
//		return isContain;
		
		findstr = findstr.trim();
		
		if(this.name.contains(findstr))
		{
			return true;
		}
		else if(this.addr.contains(findstr))
		{
			return true;
		}
		else if(this.job.contains(findstr))
		{
			return true;
		}
		else if(this.major.contains(findstr))
		{
			return true;
		}
		return false;
	}
	
	boolean isEquals(String str)
	{
		// 인자로 받은 str 문자열을 "," 단위로 잘라내어서 각각 나눠진 문자열이
		// name, addr, job, major 와 일치하면 true, 하나라도 다르게 있으면 false 를 리턴
		
		str = str.trim();
		String arr[] = str.split(",");
		
			if(!name.equals(arr[0]))
			{
				return false;
			}
			else if (!addr.equals(arr[1]))
			{
				return false;
			}
			else if (!job.equals(arr[2]))
			{
				return false;
			}
			else if (!major.equals(arr[3]))
			{
				return false;
			}
			return true;
		
	
			
	}
	
	
}

public class C01String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profile profile = new Profile("홍길동,대구,프로그래머,컴퓨터공학");
		
		System.out.println(profile.toString());
		System.out.println("길동 포함여부 : " + profile.isContain("길동")); // true
		System.out.println("컴퓨터 포함여부 : " + profile.isContain("컴퓨터")); // true
		System.out.println("프로필 일치여부 : " + profile.isEquals("홍길동,대구,프로그래머,컴퓨터공학")); // false
		System.out.println("프로필 일치여부 : " + profile.isEquals("홍길동,울산,프로그래머,컴퓨터공학")); // false
		
	}

}
