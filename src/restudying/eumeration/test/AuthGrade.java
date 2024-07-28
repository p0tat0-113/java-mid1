package restudying.eumeration.test;

public enum AuthGrade {
    GUEST(1,"손님"),LOGIN(2,"로그인 회원"),ADMIN(3,"관리자");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        System.out.println(AuthGrade.GUEST.getDescription());
        System.out.println(AuthGrade.GUEST.getLevel());

        System.out.println(AuthGrade.ADMIN.getDescription());
        System.out.println(AuthGrade.ADMIN.getLevel());
    }
}
