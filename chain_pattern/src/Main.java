public abstract class Support {
    protected Support next;
    public void setNext(Support next) {
        this.next = next;
    }
    public abstract void dealWith(int level);
}

public class SupportBasic extends Support {
    public void dealWith(int level) {
        if (level <= 1) {
            System.out.println("Solved by Basic Support - Level 1 of Complexity.");
        }
        else if (next != null) {
            next.dealWith(level);
        }
    }
}


public class SupportAdvanced extends Support {
    public void dealWith(int level) {
        if  (level <= 2) {
            System.out.println("Solved by Advanced Support - Level 2 of Complexity.");
        } else if (next != null) {
            next.dealWith(level);
        }
    }
}

public class SupportFinal extends Support {
    public void dealWith(int level) {
        if   (level >= 3) {
            System.out.println("Cannot be solved at this moment.")
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Support basic       = new SupportBasic();
        Support advanced    = new SupportAdvanced();
        Support finalize    = new SupportFinal();

        basic.setNext(advanced);
        advanced.setNext(finalize);

        basic.dealWith(1);
        basic.dealWith(2);
        basic.dealWith(3);
    }
}