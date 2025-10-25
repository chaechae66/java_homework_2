import java.io.IOException;

public class ExceptionHandler {
    public static void handleException(Exception e) {
        if (e instanceof IOException) {
            System.err.println("입력값 타입이 맞지 않아 생긴 에러인 것 같습니다. 에러 메세지 : " + e.getMessage());
        } else {
            System.err.println("내부에서 알 수 없는 에러가 발생하였습니다. 에러 메세지 : " + e.getMessage());
        }
    }
}
