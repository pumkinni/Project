import java.util.Scanner;

public class surpriseProject {
        public static void displayMenu(){
            System.out.println("<<<<[메뉴선택]>>>>");

            System.out.println("1. 회원 관리");
            System.out.println("2. 과목 관리");
            System.out.println("3. 수강 관리");
            System.out.println("4. 결제 관리");
            System.out.println("5. 종료");
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                displayMenu();
                int number = sc.nextInt();

                if (number == 1) {
                    System.out.println("회원 관리 메뉴를 선택했습니다.");
                } else if (number == 2) {
                    System.out.println("과목 관리 메뉴를 선택했습니다.");
                } else if (number == 3) {
                    System.out.println("수강 관리 메뉴를 선택했습니다.");
                } else if (number == 4) {
                    System.out.println("결제 관리 메뉴를 선택했습니다.");
                } else if (number == 5) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    System.out.println("입력값이 정확하지 않습니다.");
                }
            }
        }


}
