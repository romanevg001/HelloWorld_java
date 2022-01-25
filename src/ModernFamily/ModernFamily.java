package ModernFamily;
/* import javax.swing.Timer;
import java.awt.event.*; */
import java.lang.*;
import java.util.*;
import java.io.*;


public class ModernFamily {
    HashSet<Member> members = new HashSet<Member>();
    Config conf = new Config();
    String [][] val = getResource("filename.txt");

    public static void main(String[] args) {
       new ModernFamily();
    }

    public ModernFamily () {
  
        for (String[] line : val) {
            conf.addRelation(line[0], Boolean.parseBoolean(line[1]), line[2]);
        }
        for (String[] line : val) {
            Member who = new Member(Family.valueOf(line[0]));
            Member whom = new Member(Family.valueOf(line[2]));
           System.out.println(" => " + line[0] + " = " + line[2]);
            members.add(who);
            members.add(whom);
        
        
        }
        System.out.println("val: "+val.length);

        System.out.println("members.size:  "+members.size());


        for (Member member : members) {
            System.out.println(member.typeMember);
             Member whom1 = getArbitraryMember(member);
           
           // System.out.println(member.typeMember + " call " + whom1.typeMember + ", the response is: "+  member.calls(whom1)); 
        }

    }

    Member getArbitraryMember(Member member) {
      /*   Iterator<Member> i = members.iterator();  
        if(i.hasNext()) {  
            return i.next();  
        }  else { */
            Member arr[] = new Member[members.size()];
            Member[] arrMembers = members.toArray(arr);
            Member arMember =  arrMembers[(int) Math.round(Math.random() * members.size()) ];
            if (member != arMember) {
                return arMember;
            } else {
                return getArbitraryMember(member);
            }

      //  }
       /*  Member arMember = members.get( (int) Math.round(Math.random() * members.size()) );
         */
    }

    static String [][] getResource(String src) {
        String [][] val = {
            {"Wife","true","Husband"},
            {"Dog","true","Wife"},
            {"Cat","true","Wife"},
            {"Parrot","true","Dog"},
            {"Dog","true","Parrot"},
        };
/* 
        try {
            Class cls = Class.forName("ModernFamily");
            ClassLoader cLoader = cls.getClassLoader();
            
            InputStream i = cLoader.getResourceAsStream(src);
            BufferedReader r = new BufferedReader(new InputStreamReader(i));
            System.out.println("rrrrr1" + r.readLine());

            // reads each line
            String l;
            while((l = r.readLine()) != null) {
            val = val + l;
            } 
            i.close();
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("rrrrr" + val); */
        return val;
    }
}
