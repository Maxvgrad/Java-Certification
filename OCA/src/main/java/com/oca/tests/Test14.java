

public class Test14 {
    public static void main(String[] args) {
        String str = "Appends a subsequence of the specified CharSequence to this sequence.";
        StringBuilder sb = new StringBuilder(str);

        String nullStr = null;
        sb.append(nullStr, 0, 4);
        System.out.println(sb);

        sb.insert(8, "Henry ", 0, 6);
        System.out.println(sb);

        sb.replace(16, 27, "new-seq");
        System.out.println(sb);

        //System.out.println(SubBase.id);
        SubBase.baseStaticMethod();
        //System.out.println(Base.id);

        System.out.println(new SubBase().subId);
        System.out.println(new SubBase().id);

        System.out.println(12___________4);
    }
}

class Base {
    static int id = 22;
    static final int id2 = 121;
    static {System.out.println("Base");}

    static void baseStaticMethod() { System.out.println("method"); }
}

class SubBase extends Base {
    static int subId = 56;
    static {System.out.println("SubBase");}
}
