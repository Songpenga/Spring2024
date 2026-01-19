package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("등급을 입력하세요[GUEST, LOGIN, ADMIN] :: ");
        String grade = scanner.nextLine();

        AuthGrade grades = AuthGrade.valueOf(grade.toUpperCase());
        //Converts all of the characters in this String to upper case using the rules of the default locale.
        //This method is equivalent to toUpperCase(Locale. getDefault()).

        System.out.println("당신의 등급은 ::" + grades.getGradeLogin());

        System.out.println("==메뉴 목록==");
        if (grades.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }
        if (grades.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }
        if (grades.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }

    }
}
