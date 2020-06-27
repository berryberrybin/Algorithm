package array;

import java.util.Scanner;

public class Basic {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*int [] num = new int[5];
        for(int i = 0;i<num.length;i++){
            System.out.println((i+1)+"번째 숫자를 입력하세요.");
            num[i]=scanner.nextInt();
        }
        int max = num[0];
        int min = num[0];
        for(int i=0;i<num.length;i++){
            if(max<num[i]){
                max = num[i];
            }
            if(min>num[i]){
                min = num[i];
            }
        }
        System.out.println("가장 큰 숫자 : "+max);
        System.out.println("가장 작은 숫자 : "+min);

        int[] num = new int[3];
        num[0] = 10;
        num[1] = 15;
        num[2] = 13;
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

         */
        int[] scores = {93, 75, 95, 76, 70};
        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
            System.out.println(score);
        }
        System.out.println("점수 합계:" + sum);
        /*
        double avg = (double)sum / score.length;
        System.out.println("점수합계:"+ sum);
        System.out.println("점수평균:"+avg);
        int[] odd = {1, 3, 5, 7, 9};
        String[] weeksPractice = {"월","화","수","목","금"};
        String[] weeks =new String[7];
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";
        System.out.println(weeks[3]);

        String[] weekends = {"월","화","수","목","금"};
        for(int i=0;i<weekends.length;i++){
            System.out.println(weekends[i]);
        }
        */


    }
}
