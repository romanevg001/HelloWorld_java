package Family;

import java.util.*;

public class Mother extends Member {
    MembersType type = MembersType.Mother;
    public Mother(String name) {
        super(name);
    }

    public void call(Member member) {
        member.response(this);
    }

    public void response(Member member) {

    }
}