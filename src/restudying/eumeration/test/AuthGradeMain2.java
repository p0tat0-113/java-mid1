package restudying.eumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
            String inputGrade = scanner.nextLine();
            if (inputGrade.equals("exit")){
                break;
            }

            AuthGrade authGrade;
            try {
                authGrade = AuthGrade.valueOf(inputGrade); //잘못된 값이 들어오면 런타임예외가 발생함.
            } catch (RuntimeException e){
                System.out.println("잘못된 값을 입력하였습니다.");
                System.out.println();
                continue;
            }

            System.out.println("당신의 등급은 "+authGrade.getDescription()+"입니다.");

            System.out.println("==메뉴 목록==");
            System.out.println("- 메인화면");

            if(authGrade.getLevel() >= 2){
                System.out.println("- 이메일 관리 화면");
            }
            if(authGrade.getLevel() >= 3){
                System.out.println("- 관리자 화면");
            }
            System.out.println();

        }
    }
}
