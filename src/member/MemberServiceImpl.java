package member;

import java.util.HashMap;
import java.util.Map;


public class MemberServiceImpl implements MemberService {

	MembersBean bean = new MembersBean();
	Map<String,Object> map = new HashMap<String,Object>();
	
	@Override
	public void join(String name, String birthday, String birthdayRadio, String gender, String userId, String userPw, String userPwConf, String email, 
			String phone, String adminId, String adminPw) {
		/*
		 * 이 패턴은 DB 에 저장하는 패턴과 일치한다.
		 * 즉, 값을 활용하면서 오염되거나 변질될 수 있기에
		 * 가장 먼저 순수값을 DB 에 저장하고 본다.
		 * */
		bean.setName(name);
		bean.setBirthday(birthday);
		bean.setBirthdayRadio(birthdayRadio);
		bean.setGender(gender);
		bean.setUserId(userId);
		bean.setUserPw(userPw);
		bean.setUserPwConf(userPwConf);
		bean.setEmail(email);
		bean.setPhone(phone);
		bean.setAdminId(adminId);
		bean.setAdminPw(adminPw);
		
		map.put("name", bean.getName());
		map.put("birthday", bean.getBirthday());
		map.put("birthdayRadio", bean.getBirthdayRadio());
		map.put("gender", bean.getGender());
		map.put("userId", bean.getUserId());
		map.put("userPw", bean.getUserPw());
		map.put("userPwConf", bean.getUserPwConf());
		map.put("email", bean.getEmail());
		map.put("phone", bean.getPhone());
		map.put("adminId", bean.getAdminId());
		map.put("adminPw", bean.getAdminPw());
		
	}

	@Override
	public String login(String userId, String userPw) {
		String msg = "";
		if(map.get("userId").equals(userId)&& map.get("userPw").equals(userPw)){
			return msg = "환영합니다.";
		}else if(!(map.get("userId").equals(userId)||map.get("userPw").equals(userPw))){
			return msg = "입력하신 ID, 패스워드 는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.";
		}else if(!(map.get("userId").equals(userId))&&map.get("userPw").equals(userPw)){
			return msg = "입력하신 ID는 존재하지 않습니다.";
		}else{
			return msg = "비번이 다릅니다.다시 입력하세요.";
		}
	}
}
