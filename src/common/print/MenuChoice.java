package common.print;

import common.ExceptionHandler;

import java.util.Scanner;

public class MenuChoice {
    Scanner input = new Scanner(System.in);


    public int showAboutList(){
        try{
            System.out.println("=== 서비스 리스트 ===\n1. 회원 관리\n2. 결제 시스템\n3. 일정 관리\n4. 미니 콘솔 게임\n5. 은행 계좌 관리 시스템\n0. 종료");
            System.out.println("어떤 번호로 하시겠어요? 숫자로만 입력해주세요");
            int num = input.nextInt();
            return num;
        }catch (Exception e){
            ExceptionHandler.handleException(e);
            return -1;
        }
    }

    public void userManager(){
        try{
            while (true) {
                System.out.println("=== 회원 관리 ===\n1. 등록\n2. 수정\n3. 삭제\n4. 조회\n5. 이전\n0. 종료");
                System.out.println("어떤 번호로 하시겠어요? 숫자로만 입력해주세요");
                int num = input.nextInt();
                switch (num){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 0:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    case -1:
                        System.out.println("알 수 없는 에러가 발생하여 예기치 못하게 종료됩니다.");
                        return;
                    default:
                        System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                }
            }
        }catch (Exception e){
            ExceptionHandler.handleException(e);
        }
    }
}
