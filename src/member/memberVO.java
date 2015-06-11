package member;

public class memberVO {
	private String userId;
	private String userPw;
	private String name;
	private String email; 
	private String gender; 
	private String birthday; 
	private String adminId; 
	private String adminPw;
	private boolean agree;
	
	/*
	userId : 유저 아이디
	userPw : 유저 비밀번호
	name : 이름
	email : 이메일
	gender : 성별
	birthday : 생년월일
	adminId : 관리자 아이디
	adminPw : 관리자 비밀번호
	agree : 약관동의
	 * 
	 * */
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPw() {
		return userPw;
	}
	
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getAdminId() {
		return adminId;
	}
	
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	
	public String getAdminPw() {
		return adminPw;
	}
	
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	
	public boolean isAgree() {
		return agree;
	}
	
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	
	
	
	
	
	
}
