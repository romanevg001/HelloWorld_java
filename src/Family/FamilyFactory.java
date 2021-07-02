package Family;


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

        Dog iDog = new Dog("Шарик");
        iDog.addResponsibleMember(iFather);
        ivanovs.addMember(iDog);

        System.out.println(ivanovs.surname + ": " + ivanovs.getMembers().size());
        ivanovs.getMembers().forEach((Member member) -> {
            System.out.println(member.name + " - " + member.type);
        });

        Member ivanovsMother = ivanovs.getMember(MembersType.Mother);
        Member ivanovsCat = ivanovs.getMember(MembersType.Cat);
        Member ivanovsFather = ivanovs.getMember(MembersType.Father); 
        Member ivanovsDog = ivanovs.getMember(MembersType.Dog); 
 
        System.out.println(ivanovsMother.name + " call  " + ivanovsCat.name + ": ");
        ivanovsMother.call(ivanovsCat);
        System.out.println(ivanovsFather.name + " call  " + ivanovsCat.name + ": ");
        ivanovsFather.call(ivanovsCat); 

        System.out.println(ivanovsMother.name + " call  " + ivanovsDog.name + ": ");
        ivanovsMother.call(ivanovsDog);
        System.out.println(ivanovsFather.name + " call  " + ivanovsDog.name + ": ");
        ivanovsFather.call(ivanovsDog); 
    }
}
