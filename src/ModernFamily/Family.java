package ModernFamily;

public enum Family {
    Husband("Yes, my darling!"),
    Wife("I'm coming, my darling!"),
    Dog("woof-woof!"),
    Cat("meow-meow!"),
    Snake("shh-hshhh!"),
    Parrot;

    private String responsePhrase;

    Family(String responsePhrase){
        this.responsePhrase = responsePhrase;
    }

    Family(){}

    public String getResponsePhrase() {
        return responsePhrase==null?Config.defaultResponse:responsePhrase;
    }

    public String getResponsePhrase(String member) {
        return getFamilyMember(member).getResponsePhrase();
    }

    public Family getFamilyMember (String member) {
        return Family.valueOf(member);
    }
}
