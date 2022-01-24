package ModernFamily;
import java.util.*;
import java.lang.*;

public class Member implements FamilyMember, Caller, Callable {
    private char[] alfabet = {'A','B','C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    Family typeMember;
    public Member(Family typeMember) {
        this.typeMember = typeMember;
    }
    @Override
    public int hashCode() {
        String[] tm = typeMember.toString().toUpperCase().split("");
        ArrayList<Integer> hcArr = new ArrayList<Integer>();
        for (String m : tm) {
            hcArr.add(new String(alfabet).indexOf(m));
        }
        return Integer.valueOf( Arrays.toString(hcArr.toArray()) );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
   
        return true;
    }
}
