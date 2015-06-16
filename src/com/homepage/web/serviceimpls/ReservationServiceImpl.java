package com.homepage.web.serviceimpls;

import java.util.Scanner;

import com.homepage.web.services.ReservationService;

public class ReservationServiceImpl implements ReservationService{

    public static String[][] seat = new String[3][5]; // 좌석 위치값
    /*
     * 좌석 위치값이 DB에 저장될 필요는 없다.
     * 하지만 예약번호가 생성되면 좌석 위치값 + 예약시간 + 예약자가 
     * 맵핑될 필요가 있다.
     * 따라서 예약 번호는 좌석위치값 + 예약시간 + 예약자의 id 정도로
     * 생성을 시키면 나중에 DB에서 불러와서 
     * 좌석 위치값, 예약시간, 예약자를 알아보고자 할 때
     * subString() 같은 메소드를 활용하면 쉽게 얻을 수 있을 것이다.
     * */
	
/*	@Override
	public void alertMsg(int num) {
		// TODO Auto-generated method stub
        switch (num) {
        case 1:
            System.out.println("\n!!! 숫자만 입력가능합니다 !!!");
            break;
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("\n!!!! 1 ~ " + num + " 숫자만 입력 가능합니다. !!!!");
            process();
            break;
 
        case 6:
            System.out.println("\n!!! 그 방은 이미 예약중입니다 !!!");
            process();
            break;
        case 7:
            System.out.println("\n!!! 그 방은 이미 빈방입니다 !!!");
            process();
            break;
        case 9:
            System.out.println("\n!!! 프로그램을 종료합니다 !!!");
            break;
        }
	
	}*/

/*	@Override
	public int inputCheck(String input, int first, int last) {
		int sel = Integer.parseInt(input);
		 
        if (sel < first || sel > last) { // 범위값 외의 숫자를 입력했을경우
            if (last == 4)
                alertMsg(4); // 초기메뉴 (1~4)에서 범위값 외의 수를 입력했을경우
            else if (last == 3)
                alertMsg(3); // 층수 (1~3)에서 범위값 외의 수를 입력했을경우
            else if (last == 5)
                alertMsg(5); // 호수(1~5)에서 범위값 외의 수를 입력했을경우
 
            else
                return 0; // 0을 리턴
        }
 
        return sel; // 올바른 값을 입력했을경우 입력받은 수를 리턴한다

	}
*/
	@Override
	public String checkIn(int floor, int row, String id) {
		String msg = "";
		try {
			// floor = this.inputCheck(fl, 1, 3);
			if (floor == 0) {
			}
			// room = this.inputCheck(ro, 1, 5);
			if (row == 0) {
			}
			if (seat[floor][row ] != null) { // 이미 이름이 있다면(예약중)
				msg = "그 좌석은 이미 예약중입니다 !!!";
			} else {
				seat[floor][row] = id;
				msg = id + "님 예약 완료 되셨습니다";
			}
		} catch (Exception ex) {
			System.out.println("ReservationServiceImpl.checkIn() 에서 에러 발생!!");
		}
		return msg;
	}


	public String checkOut(int floor, int row, String id) {
		String msg = "";
		try {
			// floor = this.inputCheck(floor, 1, 3);
			if (floor == 0) {
			}
			// room = this.inputCheck(row, 1, 5);
			if (row == 0) {
			}
			if (seat[floor][row] == null) { // 방에 이름이 없다면..
				msg = "그 좌석은 이미 빈 좌석입니다 !!!";
			} else {
				id = seat[floor][row]; // 방에 이름이 있다면 해당 배열주소
												// null처리
				seat[floor][row] = null;
				msg = id + "님 예약 취소 되셨습니다";
			}
		} catch (Exception ex) {
			System.out.println("ReservationServiceImpl.checkIn() 에서 에러 발생!!");
		}
		return msg;
	}

	@Override
	public String[][] showStatus() {
/*		System.out.println("\n\n\t***************  호텔의 투숙상태 *****************");
        // 중첩for if문
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                if (seat[i][j] == null) {
                    System.out.print("" + (i + 1) + "0" + (j + 1) + "호"
                            + " □\t" + "\t");
                } else {
                    System.out.print("" + (i + 1) + "0" + (j + 1) + "호"
                            + " ■\t" + seat[i][j] + "\t");
                }
            }
            System.out.println();
        }*/
        return seat;
	}

	@Override
	public void process() {
		Scanner sc = new Scanner(System.in);
		 
        int sel = 0;
        String input;
 
        while (true) {
            this.showStatus(); // 체크인 상태를 무조건 보면서 입실퇴실
 
            try {
                System.out.print("1.예약  2.예약취소  3.전체보기  4.종료? ");
                input = sc.nextLine();
 
         //       sel = this.inputCheck(input, 1, 4);
            } catch (Exception ex) {
            	System.out.println("ReservationServiceImpl.checkIn() 에서 에러 발생!!");
            }
 
            
 
        } // while end
        
	}

}
