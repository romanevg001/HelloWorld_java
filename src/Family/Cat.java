package Family;

import java.util.*;

public class Cat extends Member  {
    MembersType type = MembersType.Cat;
    private List<Member> responsibleMembers = new ArrayList<>();

    public Cat(String name) {
        super(name);
    }

    void addResponsibleMember(Member member) {
        responsibleMembers.add(member);
    }

    public void response(Member member) {
        if (responsibleMembers.contains(member)) {
            System.out.println("Mew");
        }
    }
}
