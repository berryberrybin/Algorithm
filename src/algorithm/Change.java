package algorithm;

public class Change {
    public int change(int n){
        int remainder;
        int count_100 = 0;
        count_100 = n/100;
        remainder = n-(100*count_100);

        int count_50;
        count_50 = (remainder / 50);
        remainder = remainder - (50*count_50);

        int count_10;
        count_10= remainder / 10;
        remainder = remainder - (10*count_10);

        int count_5;
        count_5 = remainder / 5;
        remainder = remainder-(5*count_5);

        int count_1 = remainder;



        // 동전 1원, 5원, 10원, 50원, 100원짜리가 무수히 많다고 가정한다.
        // 입력된 n원을 잔돈으로 거슬러 줄 때 가장 적은 동전 개수로 거슬러 주면 몇 개가 필요한지 반환하시오.
        // 예: 362원: 100원 3개, 50원 1개, 10원 1개, 1원 2개 총 7개
        return (count_1+count_5+count_10+count_50+count_100);
    }
}
