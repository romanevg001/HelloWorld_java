package Family;

public class Father extends Member {
    public Father(String name) {
        super(name, MembersType.Father);
    }

    void call(Member member) {
        member.response(this);
    }

    void response(Member member) {

    }

}
