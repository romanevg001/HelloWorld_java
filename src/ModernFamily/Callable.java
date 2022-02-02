package ModernFamily;

public interface Callable extends FamilyMember {

    public default String response(Caller caller){
    //    System.out.println(this.whoAmI() +" - "+ caller.whoAmI()+"   -   "+ this.likes(caller)+" = "+ whoAmI().getResponsePhrase());
        return this.likes(caller)? whoAmI().getResponsePhrase() :"";
    };

    public default boolean likes (Caller caller) {
        //searching the config
        for (Relation relation : Config.relationship) {
            // if I like caller
            if (relation.who.equals(whoAmI()) && relation.likes && relation.whom.equals(caller.whoAmI())) {
                return true;
            }
        }
        // no positive config has been found = I don't like caller
        return false;
    }
}
