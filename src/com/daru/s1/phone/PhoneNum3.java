package com.daru.s1.phone;

import java.util.Scanner;

public class PhoneNum3 {

	private Scanner sc;
	
	public PhoneNum3() { //생성자
		sc = new Scanner(System.in);
	}
	
	public PhoneDTO addData() {
		PhoneDTO phoneDTO = new PhoneDTO();
		System.out.println("이름 입력");
		phoneDTO.setName(sc.next());
		System.out.println("별명 입력");
		phoneDTO.setNickname(sc.next());
		System.out.println("email 입력");
		phoneDTO.setEmail(sc.next());
		System.out.println("전화번호 입력");
		phoneDTO.setNum(sc.next());
		System.out.println("생일 입력");
		phoneDTO.setBirth(sc.next());
		return phoneDTO;//이거 가져가! 
	}
	
}
