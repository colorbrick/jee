package com.homepage.web.serviceimpls;

import com.homepage.web.services.KaupService;

public class KaupServiceImpl implements KaupService {
	int idx;

	@Override
	
	public int getKaupIndex(double height, double weight) {
		
		idx = (int) ((weight/(height*height))*10000);
		return idx;
	}
	@Override
	public String getResultMsg(int idx) {
		String result ="";
		
		if(idx>30){result = "고도비만";}
		else if(idx>24){result = "비만";}
		else if(idx>20){result = "과체중";}
		else if(idx>15){result = "정상";}
		else if(idx>13){result = "저체중";}
		else if(idx>10){result = "영양실조";}
		if(idx<10){result = "소모증";}
		
		return result;
	}

}
