package Family;

import java.util.*;

public class Family {
    String surname;
    private Map<MembersType, Member> members =  new HashMap<>();

    public Family(String surname) {
        this.surname = surname;
    }

    void addMember(Member member) {
        System.out.println(member.type);
        members.put(member.type, member);
    }

    Member getMember(MembersType type) {
        return members.get(type);
    }

    Collection<Member> getMembers() {
        return members.values();
    }

}
