package Family;

import java.util.*;

public class Dog extends Member  {
    private List<Member> responsibleMembers = new ArrayList<>();

    public Dog(String name) {
        super(name, MembersType.Dog);
    }

    void call(Member member) {
        this.response(member);
    }

    void addResponsibleMember(Member member) {
        responsibleMembers.add(member);
    }

    void response(Member member) {
        if (responsibleMembers.contains(member)) {
            System.out.println("Gav");
        }
    }
}
