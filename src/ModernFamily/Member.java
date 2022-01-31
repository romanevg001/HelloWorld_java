package ModernFamily;
import java.util.*;

public class Member implements Caller, Callable {
    Family typeMember;
    public Member(Family typeMember) {
        this.typeMember = typeMember;
    }

    public Family whoAmI() {
        return typeMember;
    }

    @Override
    public int hashCode() {
        char[] alfabet = {'A','B','C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
                        // 0,  1,  2,   3,   4,   5,   6,   7,   8,   9,   10,  11,  12,  13,  14,  15,  16,  17,  18,  19,  20,  21, 22,   23,  24,  25
        String[] tm = typeMember.toString().toUpperCase().split("");
        ArrayList<String> hcArr = new ArrayList<String>();
        for (String m : tm) {
            hcArr.add(Integer.toString( new String(alfabet).indexOf(m) ));
        }

        String hc = String.join("",hcArr);
        hc = hc.length() > 9 ? hc.substring(0, 5) : hc;
        
        return Integer.parseInt(hc);
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
