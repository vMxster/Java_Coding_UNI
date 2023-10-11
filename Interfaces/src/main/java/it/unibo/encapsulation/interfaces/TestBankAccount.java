package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */
        AccountHolder accountAndreaRossi = new AccountHolder("Andrea", "Rossi", 1);
        /*
         * Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */
        AccountHolder accountAlexBianchi = new AccountHolder("Alex", "Bianchi", 2);
        /*
         * Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Bianchi (ammontare iniziale = 0)
         */
        BankAccount accountBankAndreaRossi = new SimpleBankAccount(1, 0);
        BankAccount accountBankAlexBianchi = new StrictBankAccount(2,0);
        /*
         * Depositare €10000 in entrambi i conti
         */
        accountBankAlexBianchi.deposit(2, 10000);
        accountBankAndreaRossi.deposit(1, 10000);
        /*
         * Prelevare €15000$ da entrambi i conti
         */
        accountBankAlexBianchi.withdraw(2, 15000);
        accountBankAndreaRossi.withdraw(1, 15000);
        /*
         * Stampare in stdout l'ammontare corrente
         */
        System.out.println(accountBankAlexBianchi.getBalance());
        System.out.println(accountBankAndreaRossi.getBalance());
        /*
         * Depositare nuovamente €10000 in entrambi i conti
         */
        accountBankAlexBianchi.deposit(2, 10000);
        accountBankAndreaRossi.deposit(1, 10000);
        /*
         * Invocare il metodo computeManagementFees su entrambi i conti
         */
        accountBankAlexBianchi.chargeManagementFees(2);
        accountBankAndreaRossi.chargeManagementFees(1);
        /*
         * Stampare a video l'ammontare corrente
         */
        System.out.println(accountBankAlexBianchi.getBalance());
        System.out.println(accountBankAndreaRossi.getBalance());
    }
}
