package com.daru.s1.phone;

import java.util.List;

public class PhoneNum1 {

	public void showData(List<PhoneDTO> ar ) {
		
		for(int i = 0; i<ar.size();i++) {
			PhoneDTO phoneDTO = ar.get(i);//선언과 초기화동시에함
			System.out.println("Name :"+phoneDTO.getName());
			System.out.println("Nickname :"+phoneDTO.getNickname());
			System.out.println("Email :"+phoneDTO.getEmail());
			System.out.println("Phone :"+phoneDTO.getNum());
			System.out.println("Birth :"+phoneDTO.getBirth());



		}
		
	}
	
}
