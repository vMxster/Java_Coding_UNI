package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder accountAndreaRossi = new AccountHolder("Andrea","Rossi",1);
        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder accountAlexBianchi = new AccountHolder("Alex","Bianchi",2);
        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount accountBankAndreaRossi = new SimpleBankAccount(1, 0);
        SimpleBankAccount accountBankAlexBianchi = new SimpleBankAccount(2, 0);
        // 4) Effettuare una serie di depositi e prelievi
        accountBankAlexBianchi.deposit(2, 500);
        accountBankAlexBianchi.deposit(2, 200);
        accountBankAlexBianchi.withdraw(2, 300);
        accountBankAlexBianchi.deposit(2, 500);
        accountBankAlexBianchi.withdraw(2, 200);
        accountBankAndreaRossi.deposit(1, 300);
        accountBankAndreaRossi.deposit(1, 200);
        accountBankAndreaRossi.withdraw(1, 400);
        accountBankAndreaRossi.deposit(1, 500);
        accountBankAndreaRossi.withdraw(1, 200);
        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println(accountBankAlexBianchi.getBalance());
        System.out.println(accountBankAndreaRossi.getBalance());
        // 6) Provare a prelevare fornendo un id utente sbagliato
        accountBankAlexBianchi.deposit(1, 500);
        accountBankAndreaRossi.deposit(2, 500);
        // 7) Controllare nuovamente l'ammontare
        System.out.println(accountBankAlexBianchi.getBalance());
        System.out.println(accountBankAndreaRossi.getBalance());
    }
}
