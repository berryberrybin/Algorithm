package array;

public class TripleSum {
    public void tripleSum(int n, int[] array){
        int count = 0;
        for(int i = 0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                for(int k = j+1;k<array.length;k++){
                    if(n==array[i]+array[j]+array[k]){
                        System.out.println("조합 = "+ array[i]+" , "+array[j]+" , "+array[k]);
                        count ++;
                    }
                }
            }
        }
        if(count == 0){
            System.out.println("없음");
        }
        // array에서 중복되지 않은 3개 원소의 합이 n과 같은 모든 조합을 출력하시오.
        // 만약 조합이 하나도 없을 경우 "없음"을 출력하시오.
    }
}
