package school;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    static StudentList studentlist = new StudentList();

    public void menuPrint() {
        System.out.println("====== 메뉴 ======");
        System.out.println("1. 학생 입력");
        System.out.println("2. 학생 검색");
        System.out.println("3. 학생 변경");
        System.out.println("4. 학생 삭제");
        System.out.println("5. 프로그램 종료");
        System.out.println("=================");
    }
    public void menuSelect() {
        System.out.println("메뉴를 선택하세요");
        int selectNumber = scanner.nextInt();

        switch (selectNumber) {
            case 1:
                studentlist.addStudent();
            case 2:
                studentlist.searchStudent();
            case 3:
                studentlist.changeContent();
            case 4:
                studentlist.deleteStudent();
            case 5: menuExit();
        }

    }

    public void menuExit() {
        System.out.println("프로그램이 종료되었습니다.");
    }

}
