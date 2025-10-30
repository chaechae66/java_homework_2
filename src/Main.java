import common.print.Choice;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Choice choice = new Choice();

        while(true){
            int choiceNum = choice.showAboutList();

            switch (choiceNum){
                case 1:
                    choice.userManager();
                    break;
                case 2:
                    choice.userManager();
                    break;
                case 3:
                    choice.userManager();
                    break;
                case 4:
                    choice.userManager();
                    break;
                case 5:
                    choice.userManager();
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
