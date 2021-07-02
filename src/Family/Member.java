package Family;


public abstract class Member {
    String name;
    MembersType type;

    public Member(String name, MembersType type) {
        this.name = name;
        this.type = type;
    }

     abstract void call(Member member);

     abstract void response(Member member);
}
