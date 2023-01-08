import java.util.Scanner;

public class JavaStudy08 {
    static int[] tariffPrice = new int[]{12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000};
    static int[] tariff = new int[]{6, 15, 24, 35, 38, 40, 42, 45};
    static int[] deductions = new int[]{0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        int income = sc.nextInt();
        long deductionTax = deductionCalculation(income);
        long trafficTax = trafficCalculation(income);

        System.out.printf("\n%-18s\t%15d\n","[세율에 의한 세금]:",trafficTax);
        System.out.printf("%-18s\t%15d","[누진공제 계산에 의한 세금]:",deductionTax);
    }

    // 세율에 의한 세금 계산 메소드
    public static long trafficCalculation(int income){
        int idx = 0;
        long tax = 0;

        while (income > 0) {
            if (idx == tariffPrice.length){
                long taxF = income * tariff[idx] / 100;
                System.out.println(income + "*" + tariff[idx] + "% =" + taxF );
                tax += taxF;
                break;
            }
            int tariffPriceCur = (idx != 0) ? tariffPrice[idx] - tariffPrice[idx-1] : tariffPrice[idx];
            int incomeCur = Math.min(income,tariffPriceCur);
            int tariffCur = tariff[idx];
            long taxCur = incomeCur * tariffCur / 100;
            System.out.printf("%10d * %2d%% = %9d\n", incomeCur, tariffCur, taxCur);

            tax += taxCur ;

            income -= tariffPriceCur;
            idx++;
        }
        return tax;
    }


    // 누진공제 세금 계산 메소드
    public static long deductionCalculation(int income){
        int idx = 0;
        while (income > tariffPrice[idx]){
            idx ++;
        }
        long tax = income / 100 * tariff[idx] - deductions[idx];
        return tax;
    }
}
