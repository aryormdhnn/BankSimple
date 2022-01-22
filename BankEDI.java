 class BankEDI extends Bank {
    String nama;

    BankEDI(String noRekening, int saldo) {
        super(noRekening, saldo);

    }


    public void setSaldo (int jumlah, int saldo){
        this.saldo = saldo + jumlah;

    }

    public void getSaldo () {
        System.out.println("Saldo Anda " + saldo);

    }

    public void setor ( int jumlah){
        setSaldo(jumlah, saldo);
        System.out.println("Jumlah Setoran anda " + jumlah);
    }

    public void tarik ( int jumlah){
        saldo = saldo -  jumlah;
        System.out.println("Jumlah Saldo Setelah Penarikan " + saldo);
    }

     public void transfer(Bank tujuan, int jumlah) {
         if (this.saldo < jumlah) {
             System.out.println("Transfer Gagal");
         }
         else {
             this.saldo -= jumlah;
             tujuan.saldo += jumlah;
             System.out.println("Transfer Berhasil Dari " + this.nama + " Ke BankEDI Sebesar: " + jumlah);
         }
     }

     public void bayarListrik(int jumlah) {
         saldo -= jumlah;
         System.out.println(nama + " Berhasil Membayar Tagihan Listrik Sebesar: " + jumlah);

     }

     public void bayarTelp(int jumlah) {
         saldo -= jumlah;
         System.out.println(nama + " Berhasil Membayar Tagihan Telepon Sebesar: " + jumlah);
     }

     void checkSaldo() {
         System.out.println("Saldo Anda saldo " + saldo);
     }
}
