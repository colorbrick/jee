package com.homepage.web.serviceimpls;

import java.util.HashMap;
import java.util.Map;

import com.homepage.web.bean.MemberBean;
import com.homepage.web.services.MemberService;


public class MemberServiceImpl implements MemberService {

	MemberBean bean = new MemberBean();
	Map<String,Object> map = new HashMap<String,Object>();
	
	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		/*
		 * 이 패턴은 DB 에 저장하는 패턴과 일치한다.
		 * 즉, 값을 활용하면서 오염되거나 변질될 수 있기에
		 * 가장 먼저 순수값을 DB 에 저장하고 본다.
		 * */
		bean.setAddr(addr);
		bean.setAge(age);
		bean.setId(id);
		bean.setName(name);
		bean.setPassword(password);
		
		map.put("id", bean.getId());
		map.put("password", bean.getPassword());
		map.put("name", bean.getName());
		map.put("age", String.valueOf(bean.getAge()));
		map.put("address", bean.getAddr());
		
		/*
		 * 1. 첫번째 에러 유형
		 * map.put(vo.getId(),vo.getPassword());
		 * */
		
		/*
		 * 2. 두번째 에러 유형
		 * map.put("age",vo.getAge());
		 * */
		
	}
	/*
	 * 회원가입 후 로그인 기능을 하는 메소드이후에
	 * 별다른 말이 없이 없으니까..
	 * 로그인 성공, 실패 메시지까지 여기에서 마감지어야 함.
	 * */
	@Override
	public String login(String id, String password) {
/*		map.put("id", bean.getId());
		map.put("password", bean.getPassword());
		map.put("name", bean.getName());
		// 키와 밸류 패턴에서 밸류값을 String 으로 통일시키려고
		// int 타입으로 들어온 age 를 String 타입으로 변환하였다.
		map.put("age", String.valueOf(bean.getAge()));
		map.put("addr", bean.getAddr());*/
		/*
		 * 3.세번째 에러 유형
		 * map.get(id) => 파라미터 유형은 반드시 String 으로 해야 함.
		 * */
/*		if(map.get("id").equals(id)&& map.get("password").equals(password)){
			return 1;
			System.out.println("환영합니다. "
					+ ""+bean.getAddr()+"에 사는 "+bean.getAge()+"세 "+bean.getName()+"님 ..");
		}else if(!(map.get("id").equals(id))&&map.get("password").equals(password)){
			System.out.println("입력하신 ID 는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.");
			return 2;
		}else{
			System.out.println("비번이 다릅니다.다시 입력하세요.");
			return 3;
		}*/
		
		String msg = "";
		if(map.get("id").equals(id)&& map.get("password").equals(password)){
			return msg = "환영합니다.";
		}else if(!(map.get("id").equals(id)||map.get("password").equals(password))){
			return msg = "입력하신 ID, 패스워드 는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.";
		}else if(!(map.get("id").equals(id))&&map.get("password").equals(password)){
			return msg = "입력하신 ID는 존재하지 않습니다.";
		}else{
			return msg = "비번이 다릅니다.다시 입력하세요.";
		}
	}

}
