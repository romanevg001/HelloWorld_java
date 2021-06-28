package Family;

import java.util.*;

public class Family<T> {
    String surname;
    private Map<MembersType,T> members =  new HashMap<>();

    public Family(String surname) {
        this.surname = surname;
    }

    void addMember(MembersType type, T member) {
        members.put(type, member);
    }

    T getMember(MembersType type) {
        return members.get(type);
    }

}
