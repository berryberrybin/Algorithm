package algorithm;

public class LeapMonth {
    public String solution(int a, int b) {
        int date = 0;
        for(int i=1;i<a;i++){
            if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                date = date + 31;
            } else if(i==4||i==6||i==9||i==11){
                date = date + 30;
            } else{
                date = date + 29;
            }
        }
        date = date + b;
        int remainder = date%7;
        String[]week={"THU","FRI","SAT","SUN","MON","TUE","WED"};

        String answer = week[remainder];
        return answer;
    }

    public static void main(String[] args) {
        LeapMonth leapMonth = new LeapMonth();
        String result = leapMonth.solution(5,24);
        System.out.println(result);
    }
}
