package Family;

import java.util.*;

public class Cat implements IMember {
    String name;
    private List<IHuman> responsibleMembers = new ArrayList<IHuman>();

    public Cat(String name) {
        this.name = name;
    }

    void addResponsibleMember(IHuman member) {
        responsibleMembers.add(member);
    }

    public void response() {
        System.out.println("Mew");
    }
}
