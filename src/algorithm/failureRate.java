package algorithm;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        double[] failure = new double[N];
        for (int stage = 1; stage < N + 1; stage++) {
            double achieved = 0;
            double remainder = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == stage) {
                    remainder++;
                }
                if (stages[j] >= stage) {
                    achieved++;
                }
            }
            if(achieved==0){
                failure[stage-1] = 0;
            } else {
                failure[stage - 1] = remainder / achieved;
            }
        }
        double[] failureOrigin = new double[N];
        for (int i = 0; i < N; i++) {
            failureOrigin[i] = failure[i];
        }

        for (int i = 0; i < failure.length; i++) {
            double maxfailure = failure[i];
            int maxfailureLocation = i;
            for (int j = i; j < failure.length; j++) {
                if (maxfailure < failure[j]) {
                    maxfailure = failure[j];
                    maxfailureLocation = j;
                }
            }
            failure[maxfailureLocation] = failure[i];
            failure[i] = maxfailure;
        }
        int[] answer = new int[failure.length];
        for (int i = 0; i < failure.length; i++) {
            for (int j = 0; j < failure.length; j++) {
                if (failure[i] == failureOrigin[j]) {
                    answer[i] = j + 1;
                    failureOrigin[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FailureRate failureRate = new FailureRate();
        int[] stages = {1, 1, 1};
        int[] result = failureRate.solution(2, stages);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}

//https://programmers.co.kr/learn/courses/30/lessons/42889


