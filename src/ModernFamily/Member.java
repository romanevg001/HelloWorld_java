package ModernFamily;

public class Member implements FamilyMember, Caller, Callable {
    Family typeMember;
    String name;
    public Member(Family typeMember, String name) {
        this.typeMember = typeMember;
        this.name = name;
    }
}
