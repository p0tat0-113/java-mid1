package nested.test.ex1;

//각 도서는 도서 제목( title )과 저자명( author )을 가지고 있다. 시스템은 도서를 추가하고, 모든 도서의
//정보를 출력하는 기능을 제공해야 한다.
//Library 클래스를 완성해라.
//LibraryMain 과 실행 결과를 참고하자.
//Book 클래스는 Library 내부에서만 사용된다. Library 클래스 외부로 노출하면 안된다.
//Library 클래스는 Book 객체 배열을 사용해서 도서 목록을 관리한다

public class Library {
    private Book[] books;
    private int count = 0;

    public Library(int max) {
        books = new Book[max];
    }

    public void addBook(String title, String author){
        //검증 로직을 다 처리하고
        if(count >= books.length){
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        //정상 로직을 처리
        books[count++] = new Book(title, author);//후위연산자
        //영한 아저씨는 if else 문 보다는 이런 얼리리턴 방식을 선호한다고 함.
        //이렇게 하는게 어떤게 정상로직인지 판단하기가 더 편하다고 함.
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
//        for (Book book : books) {
//            System.out.println("도서제목: "+book.title+", 저자: "+book.author);
//        }
        //이렇게 하면 책이 끝까지 안들어왔을 때 nullPointerException 이 발생함. 이러면 안됨.
        for (int i = 0; i < count; i++) {
            Book book = books[i];
            System.out.println("도서제목: "+book.title+", 저자: "+book.author);
        }
    }

    private static class Book{//Book이 바깥 클래스의 인스턴스 멤버를 가져다 쓸 것 같지는 않아서 정적 중첩 클래스로 만듦.
        private String title;//내부 클래스가 바깥 클래스의 private 인스턴스 멤버에 접근할 수 있는 것처럼 바깥 클래스가 내부 클래스 private 에 접근하는 것도 됨.
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
