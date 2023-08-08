package bitcamp.myapp.seat;

import java.util.*;

public class Reserve extends SeatType {
	
	int run(){ //run() 메서드
		int num; // 메뉴번호를 저장
		
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("예약(1), 조회(2), 취소(3), 나가기!(4) >> ");
			num = input.nextInt(); // 메뉴번호 사용자에게 입력받음
			
			switch(num) // 입력한 숫자에 따라 메뉴 시작
			{
				case 1:
					book(s,a,b); // seatType에 있는 book() 메서드 사용
					break;
				case 2:
					check(s,a,b); // seatType에 있는 check() 메서드 사용
					break;
				case 3:
					cancel(s,a,b); // seatType에 있는 seatType() 메서드 사용
					break;
				case 4:
					end(); // seatType에 있는 end() 메서드 사용
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
		}
	}

}