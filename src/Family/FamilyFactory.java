package Family;

import java.util.Map;

public class FamilyFactory {
    public static void run () {
        Family ivanovs = new Family<>("Ивановы");
        Mother iMother = new Mother("Виолетта");
        ivanovs.addMember(MembersType.Mother, iMother);

        Cat iCat = new Cat("Борис");
        iCat.addResponsibleMember(iMother);
        ivanovs.addMember(MembersType.Cat, iCat);

        IMember ivanovsMember1 = ivanovs.getMember(MembersType.Mother);
    }
}
