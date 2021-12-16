package ModernFamily;

public interface Callable extends FamilyMember {

    public default String response(Caller caller){
        return this.likes(caller)? Family.valueOf(whoAmI()).getResponsePhrase() :"";
    };

    public default boolean likes (Caller caller) {
        //searching the config
        for (Relation relation : Config.relationship) {
            // if I like caller
            if (relation.who.toString().equals(whoAmI()) && relation.likes && relation.whom.toString().equals(caller.whoAmI())) {
                return true;
            }
        }
        // no positive config has been found = I don't like caller
        return false;
    }
}
