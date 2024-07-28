package restudying.exception.uncheck;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);

        if (scanner.nextInt() == 0){
            service.callCatch();
        } else {
            service.callThrows();//예외 발생! Main도 해결하지 못하고 밖으로 던짐. 스택 트레이스를 출력하면서 프로그램 뻗음.
        }
    }
}
