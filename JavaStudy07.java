import java.util.*;
import java.util.stream.IntStream;

public class JavaStudy07 {
    // 로또 번호 생성 메소드
    public static ArrayList MakeRandomNums(){
        Random random = new Random();
        ArrayList nums = new ArrayList();
        while (nums.size() != 6){
            int num = random.nextInt(45)+1;
            if (!nums.contains(num)) {
                nums.add(num);
            }
        }
        Collections.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        Map<Character, ArrayList> lottoNums = new HashMap<>();
        ArrayList<Integer> win = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("[로또 당첨 프로그램]");
        System.out.print("\n로또 개수를 입력해 주세요.(1 ~ 10):");
        int num = sc.nextInt();
        String value = "";

        // 로또 개수만큼 로또 번호 받아오기
        for (int i = 0; i < num; i++) {
            char key = (char)('A' + i);
            lottoNums.put((char)('A'+i ),MakeRandomNums());

            System.out.print(key+ "\t");
            lottoNums.get(key).forEach(x -> System.out.printf("%02d,",x));
            System.out.print("\b\n");
        }

        // 당첨 로또 번호
        win = MakeRandomNums();
        System.out.print("\n[로또 발표]\n\t");
        win.forEach(x -> System.out.printf("%02d,", x));
        System.out.println("\b\n");

        System.out.println("\n[내 로또 결과]");
        for (Map.Entry<Character, ArrayList> lottoNum: lottoNums.entrySet()){
            int cnt = 0;
            StringBuffer sb = new StringBuffer();
            for (int winNum: win) {
                if(lottoNum.getValue().contains(winNum)){
                    cnt ++;
                }
            }
            System.out.printf("%c\t", lottoNum.getKey(), value);
            lottoNum.getValue().forEach(x -> System.out.printf("%02d,", x));
            System.out.print("\b");
            System.out.printf(" => %d개 일치\n", cnt);
        }
    }
}
