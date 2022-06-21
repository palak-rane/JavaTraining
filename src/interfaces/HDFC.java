package interfaces;

public class HDFC implements InterfaceDemo {

    @Override
    public double getPpfInterest() {
        return 8.5;
    }

    @Override
    public double getSavingInterest() {
        return 3.3;
    }

    @Override
    public void createAccount() {
        System.out.println("HDFC account is created...");
    }
}

