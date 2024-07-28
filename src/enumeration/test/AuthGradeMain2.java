package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String strGrade = scanner.nextLine();
        auth(strGrade);
    }

    private static void auth(String strGrade){
        AuthGrade authGrade = AuthGrade.valueOf(strGrade.toUpperCase());//대소문자 상관없이 쓸 수 있게 해줌.

        System.out.println("당신의 등급은 "+authGrade.getDescription()+"입니다.");
        System.out.println("==메뉴 목록==");

        if(authGrade.getLevel() >= 1){
            System.out.println("- 메인 화면");
        }
        if(authGrade.getLevel() >= 2){
            System.out.println("- 이메일 관리 화면");
        }
        if(authGrade.getLevel() >= 3){
            System.out.println("- 관리자 화면");
        }
    }
}
