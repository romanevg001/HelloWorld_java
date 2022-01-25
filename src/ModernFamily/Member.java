package ModernFamily;
import java.util.*;

public class Member implements Caller, Callable {
    private char[] alfabet = {'A','B','C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    Family typeMember;
    public Member(Family typeMember) {
        this.typeMember = typeMember;
    }
    @Override
    public int hashCode() {
        String[] tm = typeMember.toString().toUpperCase().split("");
        ArrayList<String> hcArr = new ArrayList<String>();
        for (String m : tm) {
            hcArr.add(Integer.toString( new String(alfabet).indexOf(m) ));
        }
        return Integer.parseInt( String.join("",hcArr) );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Member other = (Member) obj;
        return hashCode() == other.hashCode();
    }
}
