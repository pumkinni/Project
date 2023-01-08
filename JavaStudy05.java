import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaStudy05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");

        System.out.print("달력 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();

        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();

        System.out.println();
        System.out.println();

        System.out.printf("[%d년 %02d월]\n", year, month);
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        LocalDate date = LocalDate.of(year, month, 1);
        // 해당 달의 일수를 받음
        int days = date.lengthOfMonth();
        // 해달 날의 요일을 받아 값으로 변경
        int day = date.getDayOfWeek().getValue();

        for (int i = 0; i < day % 7; i++) {
            System.out.print("  \t");
        }

        for (int i = 1; i <= days; i++) {
            System.out.printf("%02d  ",i);
            if ((day + i) % 7 == 0){
                System.out.println();
            }
        }
    }
}
