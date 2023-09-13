class RBI {
    public void rbi() {
        System.out.println("Base RBI function called.");
    }
}

class ICICI extends RBI {
    @Override
    public void rbi() {
        System.out.println("ICICI specific implementation of RBI function called.");
    }
}

class HDFC extends RBI {
    @Override
    public void rbi() {
        System.out.println("HDFC specific implementation of RBI function called.");
    }
}

public class Main {
    public static void main(String[] args) {
        RBI rbi = new RBI();
        rbi.rbi(); // Base RBI function called.

        ICICI icici = new ICICI();
        icici.rbi(); // ICICI specific implementation of RBI function called.

        HDFC hdfc = new HDFC();
        hdfc.rbi(); // HDFC specific implementation of RBI function called.
    }
}