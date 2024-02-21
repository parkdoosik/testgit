package com.kh.view;

import java.util.Scanner;

import com.kh.controller.UserController;
import com.kh.data.User;

public class MainMenu {
	private Scanner sc = new Scanner(System.in);
	private UserController uc = new UserController();

	
	
	User u = new User();

	public void UserMenu() {
		
		while(true) {	// 사용자가 종료하기 전까지 메뉴를 계속 출력

			System.out.println("\n==회원 관리 프로그램==");
			System.out.println("1. 회원 가입");
			System.out.println("2. 아이디 찾기");
			System.out.println("3. 비밀번호 재설정");
			System.out.println("4. 회원 정보 조회");
			System.out.println("5. 회원 정보 변경");
			System.out.println("6. 회원 탈퇴");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택: ");
			int menu = sc.nextInt();
			
			sc.nextLine();
			
			switch(menu) {
			case 1:
				joinUser();
				break;
			case 2:
				serchUserId();
				break;
			case 3:
				serchUserPw();
				break;
			case 4:
				updateUser();
				break;
			case 5:
				delUser();
				break;

			case 0:
				return;
			default:
				System.out.println("잘못 선택했습니다. 다시 선택해주세요.");
			}
		}
	}
		
	


	public void displaySuccess(String message) {
		System.out.println("\n가입 성공 : " + message);
	}
	
	public void joinUser() {
		System.out.println("\n== 회원 추가 ==");
		
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String userPw = sc.nextLine();
		
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("전화번호 (-빼고 입력) : ");
		String phone = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("관심사를 입력하세요 : ");
		String inter = sc.nextLine();
		
		uc.joinUser(userId, userPw, userName, email, phone, address, inter); //컨트롤러에 전달
	}
	
	private void serchUserId() {
		
	}
	
	private void serchUserPw() {
		
	}

	private void updateUser() {
		// TODO Auto-generated method stub
		
	}
	
	private void delUser() {
		// TODO Auto-generated method stub
		
	}
		
}
