abstract class Bank {
    protected String noRekening;
    protected int saldo;

    Bank(String noRekening, int saldo) {
        this.noRekening = noRekening;
        this.saldo = saldo;
    }
    abstract void setor(int jumlah);
    abstract void tarik(int jumlah);
    abstract void transfer(Bank tujuan, int jumlah);
    abstract void checkSaldo();
}


interface Pembayaran {
    void bayarListrik();

    void bayarTelp();
}