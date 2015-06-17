package member;

public interface MemberService {

	public void join(String name, String birthday, String birthdayRadio,
			String gender, String userId, String userPw, String userPwConf,
			String email, String phone, String adminId, String adminPw);

	public String login(String userId, String userPw);

	
}
