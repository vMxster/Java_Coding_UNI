package it.unibo.constructors;

class UseConstructorsEvolved {

    public static void main(final String[] args) {
        // 1) Creare un treno con numero di posti di default, come nel caso
        // precedente (serve a verificare la nuova implementazione di Train()).

        Train train1 = new Train(Train.DEFAULT_TOT_SEATS, Train.DEFAULT_N_FC_SEATS, Train.DEFAULT_N_SC_SEATS, 0, 0);
        train1.printTrainInfo();

        // 2) Creare i seguenti treni usando il costruttore Train(int nFCSeats, int
        // nSCSeats)
        // - nFCSeats = 20; nSCSeats= 200;
        // - nFCSeats = 35; nSCSeats= 165;

        Train train2 = new Train(20, 200);
        Train train3 = new Train(35, 165);
        train2.printTrainInfo();
        train3.printTrainInfo();
    }
}
