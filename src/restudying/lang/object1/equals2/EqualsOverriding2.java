package restudying.lang.object1.equals2;

public class EqualsOverriding2 {
    public static void main(String[] args) {
        Member member1 = new Member(123);
        Member member2 = new Member(123);
        //두 객체는 별개의 객체이기 때문에 동일하다고 할 수는 없지만, 회원번호가 같으므로 논리적으로 동등하다고는 할 수 있다.

        System.out.println("동일성 비교: " + (member1==member2));//당연히 false

        System.out.println("동등성 비교: " + member1.equals(member2));//이제는 equals()를 오버라이딩 해서 논리적을 같은지를 비교하기 때문에 true가 반환된다.
    }

    static class Member{
        private int memberNum;

        public Member(int memberNum) {
            this.memberNum = memberNum;
        }

        //equals()오버라이딩
        //이 메서드가 제대로 작동되게 구현하는 것은 상당히 까다롭기 때문에 현업에서도 다들 IDE가 구현해주는대로 쓴다고 함.
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Member member = (Member) o;
            return memberNum == member.memberNum;
        }

//        @Override
//        public int hashCode() {
//            return Objects.hashCode(memberNum);
//        } //이거는 나중에 컬렉션 배울 때 설명해준다고 함.
    }
}
