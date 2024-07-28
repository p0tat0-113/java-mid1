package restudying.lang.object1.equals2;

/*
동일성과 동등성의 차이

동일성: JVM 을 기준으로 두 객체의 물리적인 메모리 주소가 같은지를 ==으로 비교
동등성: 어떤한 기준을 바탕으로 두 객체가 논리적으로 같은지를 equals()로 비교
 */

public class Equals1 {
    public static void main(String[] args) {
        Member member1 = new Member(123);
        Member member2 = new Member(123);
        //두 객체는 별개의 객체이기 때문에 동일하다고 할 수는 없지만, 회원번호가 같으므로 논리적으로 동등하다고는 할 수 있다.

        System.out.println("동일성 비교: " + (member1==member2));//당연히 false

        System.out.println("동등성 비교: " + member1.equals(member2));//true가 나올줄 알았는데 false가 나옴. 왜지?
        //equals()를 까보면 알겠지만 Object가 기본적으로 제공하는 equals()는 내부적으로 ==로 참조값을 비교한다.
        //사용자가 직접 오버라이딩을 해서, 어떤 기준으로 비교할지를 정해야 한다.
    }

    static class Member{
        private int memberNum;

        public Member(int memberNum) {
            this.memberNum = memberNum;
        }
    }
}
