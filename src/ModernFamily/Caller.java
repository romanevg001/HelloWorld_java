package ModernFamily;

public interface Caller extends FamilyMember{

    public default String calls(Callable caller){
        return caller.response(this);
    };
}
