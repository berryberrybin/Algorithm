package school;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private Menu menu = new Menu();
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent() {
        System.out.println("===== 학생 추가 =====");
        System.out.println("이름을 입력해주세요");
        String studentName = scanner.next();
        System.out.println("학번을 입력해주세요");
        int studentId = scanner.nextInt();
        if (studentList.contains(studentId) == true) {
            System.out.println("이미 존재하는 학번입니다. 다시 입력해주세요.");
            studentId = scanner.nextInt();
        }

        System.out.println("생년월일을 입력해주세요(ex.940504)");
        int studentDateOfBirth = scanner.nextInt();

        int length = (int) (Math.log10(studentDateOfBirth) + 1);
        if (length != 6) {
            System.out.println("생년월일 입력 오류입니다. 다시 입력해주세요.");
            studentDateOfBirth = scanner.nextInt();
        }
        Student student = new Student(studentName, studentId, studentDateOfBirth);
        studentList.add(student);
        System.out.println(studentName + "학생이 추가되었습니다");
    }

    public void searchStudent() {
        System.out.println("===== 학생 검색 =====");
        System.out.println("1. 이름으로 검색  2.학번으로 검색");
        System.out.println("메뉴를 선택하세요");
        int selectNumber = scanner.nextInt();
        if (selectNumber == 1) {
            System.out.println("검색할 학생이름을 입력하세요.");
            String searchName = scanner.next();
            Student result = findStudentByName(searchName);
            if (result == null) {
                System.out.println("검색 항목이 없습니다.");
                return;
            }
            System.out.println(result.getStudentName() + " 학생 정보 ");
            System.out.println("학번 : " + result.getStudentId());
            System.out.println("생년월일 : " + result.getStudentDateOfBirth());

        } else if (selectNumber == 2) {
            System.out.println("검색할 학번을 입력하세요.");
            int searchId = scanner.nextInt();
            Student result = findStudentById(searchId);
            if (result == null) {
                System.out.println("검색 항목이 없습니다.");
                return;
            }

            System.out.println(searchId + " 학번 정보 ");
            System.out.println("이름 : " + result.getStudentName());
            System.out.println("생년월일 : " + result.getStudentDateOfBirth());
        } else {
            searchStudent();
        }
    }

    public Student findStudentByName(String studentName){
        for(Student student : studentList){
            if(student.getStudentName().equals(studentName)){
                return student;
            }
        }
        return null;
    }

    public Student findStudentById(int studentId) {
        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public void changeContent() {
        System.out.println("===== 변경할 항목 =====");
        System.out.println("1. 이름  2. 학번  3. 생년월일");
        System.out.println("메뉴를 선택하세요");
        int selectNumber = scanner.nextInt();
        if (selectNumber == 1) {
            System.out.println("변경하고 싶은 학생 이름을 입력하세요.");
            String searchName = scanner.next();
            Student result = findStudentByName(searchName);
            if (result == null) {
                System.out.println("검색 항목이 없습니다.");
                return;
            }
            System.out.println("수정할 이름을 입력하세요. ");
            String changeName = scanner.next();
            result.setStudentName(changeName);
            System.out.println(searchName + " >> " + changeName + " 으로 변경되었습니다.");
        } else if (selectNumber == 2) {
            System.out.println("변경하고 싶은 학번을 입력하세요.");
            int searchId = scanner.nextInt();
            Student result = findStudentById(searchId);
            if (result == null) {
                System.out.println("검색 항목이 없습니다.");
                return;
            }
            System.out.println("수정할 학번 입력하세요. ");
            int changeId = scanner.nextInt();
            result.setStudentId(changeId);
            System.out.println(searchId + " >> " + changeId + " 으로 변경되었습니다.");
        } else if (selectNumber == 3) {
            System.out.println("변경하고 싶은 학생을 입력하세요.");
            String searchName = scanner.next();
            Student result = findStudentByName(searchName);
            if (result == null) {
                System.out.println("검색 항목이 없습니다.");
                return;
            }
            System.out.println("수정할 생년월일 입력하세요. ");
            int changeDateOfBirth = scanner.nextInt();
            result.setStudentDateOfBirth(changeDateOfBirth);
            System.out.println(searchName + "의 생년월일이 " + changeDateOfBirth + " 으로 변경되었습니다.");
        } else {
            changeContent();
        }
    }

    public void deleteStudent() {
        System.out.println("삭제하고 싶은 학생 이름을 입력하세요.");
        String searchName = scanner.next();
        Student result = findStudentByName(searchName);
        studentList.remove(result);
        System.out.println(searchName + "학생이 삭제 되었습니다.");
    }
}
