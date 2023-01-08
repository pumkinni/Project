import java.util.Arrays;
import java.util.Random;

public class JavaStudy06 {
    public static void main(String[] args) {
        Random rd = new Random();

        String[] candidates = {"이재명", "윤석열", "심상정", "안철수"};

        while (true) {
            int[] votes = new int[candidates.length];

            for (int i = 1; i <= 10000; i++) {
                int vote = rd.nextInt(4);
                String name = candidates[vote];
                votes[vote] = votes[vote] + 1;


                System.out.printf("[투표진행율]: %.2f%%, %d명 투표 => %s\n", (float) i / 100, i, name);

                for (int j = 0; j < votes.length; j++) {
                    System.out.printf("[기호:%d] %s: %.2f%%, (투표수:%d)\n", j + 1, candidates[j], (float) votes[j] / 100, votes[j]);
                }
            }

            // 당선인 선정 -> 투표값이 가장 많은 사람 확인
            int maxIdx = -1;
            int max = 0;
            for (int i = 0; i < votes.length; i++) {
                if (max < votes[i]) {
                    maxIdx = i;
                    max = votes[i];
                }
            }

            // 당선인과 동율인 후보자가 있는지 확인
            boolean same = false;
            for (int i = 0; i < votes.length; i++) {
                if (i != maxIdx && votes[maxIdx] == votes[i]) {
                    same = true;
                    break;
                }
            }

            // 있으면 재투표, 없으면 당선인 발표
            if (same){
                continue;
            }
            System.out.println("[투표결과] 당선인: " + candidates[maxIdx]);
            break;
        }
    }
}
