import java.util.Random;
import java.util.Scanner;

public class JavaStudy04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("[주민번호 계산]");
        System.out.print("출생년도를 입력해주세요.(yyyy):");
        int year = sc.nextInt();
        System.out.print("출생월을 입력해주세요.(mm):");
        int month = sc.nextInt();
        System.out.print("출생일을 입력해주세요.(dd):");
        int day = sc.nextInt();
        System.out.print("성별을 입력해주세요.(m/f):");
        String sex = sc.next();
        int sexInt = sex.equals("m") ? 3 : 4;

        int random = rd.nextInt(1000000);

        System.out.printf("%02d%02d%02d-%d%06d", year%100,month,day,sexInt,random);

    }
}
