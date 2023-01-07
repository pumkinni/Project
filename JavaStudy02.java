import java.util.Scanner;

public class JavaStudy02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        int price = sc.nextInt();
        int cashBack = (int)(price * 0.1);
        cashBack = (cashBack >= 300) ? 300 : (cashBack / 100) * 100;
        System.out.printf("결제 금액은 %d이고, 캐시백은 %d원 입니다.", price, cashBack);
    }
}
