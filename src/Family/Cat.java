package Family;

import java.util.*;

public class Cat extends Member  {
    private List<Member> responsibleMembers = new ArrayList<>();

    public Cat(String name) {
        super(name, MembersType.Cat);
    }

    void call(Member member) {
        this.response(member);
    }

    void addResponsibleMember(Member member) {
        responsibleMembers.add(member);
    }

    void response(Member member) {
        if (responsibleMembers.contains(member)) {
            System.out.println("Mew");
        }
    }
}
