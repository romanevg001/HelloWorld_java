package ModernFamily;

public class Relation {
    Family who;
    boolean likes;
    Family whom;

    public Relation(Family who, boolean likes, Family whom) {
        this.who = who;
        this.likes = likes;
        this.whom = whom;
    }
}
