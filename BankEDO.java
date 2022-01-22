class BankEDO extends Bank {
    String nama;

    BankEDO(String noRekening, int saldo) {
        super(noRekening, saldo);
    }

    public void setSaldo(int jumlah, int saldo) {
        this.saldo = saldo + jumlah;
    }

    public void getSaldo() {
        System.out.println("Saldo Anda Saat ini adalah " + saldo);

    }

    public void setor(int jumlah) {
        setSaldo(jumlah, saldo);
        System.out.println("Jumlah Setoran anda " + saldo);
    }

    public void tarik(int jumlah) {
        saldo = saldo - jumlah;
        System.out.println("Jumlah Saldo Setelah Penarikan " + saldo);
    }

    void transfer(Bank tujuan, int jumlah) {

    }

    void checkSaldo() {
        System.out.println("Saldo Anda Saat ini adalah " + saldo);
    }
}