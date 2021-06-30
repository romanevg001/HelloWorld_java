package Family;

import java.util.*;

public abstract class Member<T> {
    String name;
    MembersType type;
    private List<T> canCallList =  new ArrayList<T>();


    public Member(String name) {
        this.name = name;
    }

    public abstract void call(Member member);

    public abstract void response(Member member);
}
