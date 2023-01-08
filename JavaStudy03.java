import java.util.Scanner;

public class JavaStudy03 {
    public static void main(String[] args) {
        int price = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String nationalMerit = sc.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String welfareCard = sc.next();

        if (age < 3){
            price = 0;
        } else if ( age < 13 || time >= 17) {
            price = 4000;
        } else if (nationalMerit.equals("y") || welfareCard.equals("y")) {
            price = 8000;
        } else {
            price = 10000;
        }
        System.out.println("입장료: " + price);
    }
}
