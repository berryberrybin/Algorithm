package map;

import java.util.HashMap;

class Marathon {
    public  String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participants = new HashMap();
        for (int i = 0; i < participant.length; i++) {
            if (participants.containsKey(participant[i])) {
                participants.put(participant[i], participants.get(participant[i]) + 1);
            } else{
                participants.put(participant[i], 1);
            }
        }
        for (String completionItem : completion) {
            if (participants.containsKey(completionItem)) {
                participants.put(completionItem, participants.get(completionItem) - 1);
                if (participants.get(completionItem) == 0) {
                    participants.remove(completionItem);
                }
            }
        }
        String answer = "";
        for (String noParticipant : participants.keySet()) {
            answer = noParticipant;
        }
        return answer;
    }

    public static void main(String[] args) {
        Marathon marathon = new Marathon();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String result = marathon.solution(participant, completion);
        System.out.println(result);

    }
}

