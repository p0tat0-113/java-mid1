package restudying.nested.test.ex1;

public class Library {
    private int capacity;
    private Book[] books;
    private int count;

    public Library(int capacity) {
        this.capacity = capacity;
        books = new Book[capacity];
    }

    public void addBook(String title, String author) {
        if(count >= capacity){
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        books[count++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < count; i++) {
            Book book = books[i];
            System.out.println("도서제목: "+book.title+", 저자: "+book.author);

        }
    }

    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
