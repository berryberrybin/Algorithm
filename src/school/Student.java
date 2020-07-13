package school;

import java.util.ArrayList;

public class Student { //class 이름 : Student
    private int studentId; //멤버변수(Id, Name, DateOfBirth)
    private String studentName;
    private int studentDateOfBirth;

    // 접근제어자 (private-외부에서 사용 불가능, public)
    public Student(String studentName, int studentId, int studentDateOfBirth){ //String은 클래스
     this.studentName = studentName;
        this.studentId = studentId;
        this.studentDateOfBirth = studentDateOfBirth;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public int getStudentId(){
        return studentId; //private 변수인 studentId에 접근하여 값을 가져오는 public get()메소드
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;//private 변수인 studentId에 접근하여 값을 지정하는 public set()메소드
    }
    public int getStudentDateOfBirth(){
        return studentDateOfBirth;
    }
    public void setStudentDateOfBirth(int studentDateOfBirth){
        this.studentDateOfBirth = studentDateOfBirth;
    }

}
