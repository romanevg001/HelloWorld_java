package Family;

import java.util.Map;

public class FamilyFactory {
    public static void run () {
        Family ivanovs = new Family("Ивановы");
        Mother iMother = new Mother("Виолетта");
        Father iFather = new Father("Милтон");
        ivanovs.addMember(iMother);
        ivanovs.addMember(iFather);

        Cat iCat = new Cat("Борис");
        iCat.addResponsibleMember(iMother);
        ivanovs.addMember(iCat);

        Member ivanovsMother = ivanovs.getMember(MembersType.Mother);
        Member ivanovsCat = ivanovs.getMember(MembersType.Cat);
        Member ivanovsFather = ivanovs.getMember(MembersType.Father);
        ivanovsMother.call(ivanovsCat);
        ivanovsFather.call(ivanovsCat);
    }
}
