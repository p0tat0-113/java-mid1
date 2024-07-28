package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    //예시를 위해 아주 단순하게 구현
//    @Override
//    public boolean equals(Object obj){
//        UserV2 user = (UserV2) obj;//실제로 이렇게 썼다가는 다운캐스팅 중 런타임에러 발생 가능성 농후
//        return id.equals(user.id);//UserV2의 동등성은 id를 기준으로 비교한다.
//    }

    //정확한 equals()구현
    //인텔리제이가 정확하게 자동으로 구현해줌.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
}
