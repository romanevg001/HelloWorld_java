package Family;

public class Mother extends Member {
    public Mother(String name) {
        super(name, MembersType.Mother);
        System.out.println("Mother type: " + this.type);

    }

    void call(Member member) {
        member.response(this);
    }

    void response(Member member) {

    }
}
