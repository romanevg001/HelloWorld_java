package Family;

public class Father extends Member {
    MembersType type = MembersType.Father;
    public Father(String name) {
        super(name);
    }

    public void call(Member member) {
        member.response(this);
    }

    public void response(Member member) {

    }

}
