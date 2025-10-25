//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Print print = new Print();

        while (true) {
            int choice = print.showAboutList();

            switch (choice) {
                case 1:
                    print.insert();
                    break;
                case 2:
                    print.show();
                    break;
                case 3:
                    print.search();
                    break;
                case 4:
                    print.modify();
                    break;
                case 5:
                    print.delete();
                    break;
                case 6:
                    print.getScore();
                    break;
                case 7:
                    print.chart();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                case -1:
                    System.out.println("알 수 없는 에러가 발생하여 예기치 못하게 종료됩니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }
}
