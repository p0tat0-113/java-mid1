package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{//예외를 안에서 해결하지 못하니 밖으로 던짐
        //문제상황
        throw new MyCheckedException("ex");//예외를 생성하고 발생시킨다.
        //throw와 throws의 차이에 유의해야 함. throw는 예외를 터트리고, throws는 예외를 밖으로 던진다.
    }
}
