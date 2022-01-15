package com.daru.s1.phone;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneData {

	public void select() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		PhoneNum3 phoneNum3 = new PhoneNum3();
		ArrayList<PhoneDTO> ar = new ArrayList<>();
		
		while (flag) {
			System.out.println("1. 전체출력");
			System.out.println("2. 정보검색");
			System.out.println("3. 명단추가");
			System.out.println("4. 명단삭제"); // 이중에서 하나 입력받아야함
			System.out.println("5. 프로그램종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("1111");
			} else if (select == 2) {
				System.out.println("2222");
			} else if (select == 3) {
				System.out.println("333");
				PhoneDTO phoneDTO = phoneNum3.addData();
				ar.add(phoneDTO);
				System.out.println(ar);
			} else if (select == 4) {
				System.out.println("4444");
			} else {
				System.out.println("Finish");
				break;
			}
		}
	}
}
