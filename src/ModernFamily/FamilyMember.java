package ModernFamily;

public interface FamilyMember {
    public default String whoAmI(){
        return this.getClass().getSimpleName();
    };
}
