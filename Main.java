public class Main {
    public static void main(String[] args) {

        BankEDI ed = new BankEDI("0000184214", 15000000);
        ed.checkSaldo();
        ed.setor(160000);
        ed.tarik(500000);
        ed.checkSaldo();

    }
}
