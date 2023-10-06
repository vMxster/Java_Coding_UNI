package it.unibo.arrays;

class MyCircularArray {

    private final int[] array;
    private int lastPosition = 0;

    MyCircularArray() {
        this(10);
    }

    MyCircularArray(int size) {
        this.array = new int[10];
    }

    void add(final int elem) {
        if (this.lastPosition==this.array.length) {
            this.lastPosition = 0;
            this.array[this.lastPosition] = elem;
            this.lastPosition++;
        } else {
            this.array[this.lastPosition] = elem;
            this.lastPosition++;
        }
    }

    void reset() {
        for(int i=0 ; i<this.array.length ; i++) {
            this.array[i] = 0;
        }
        this.lastPosition = 0;
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]");
    }

    public static void main(final String[] args) {

        // 1) Creare un array circolare di dieci elementi
        MyCircularArray array = new MyCircularArray(10);

        // 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
        // dell'array circolare
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.printArray();

        // 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
        // dell'array circolare
        array.add(11);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        array.printArray();

        // 4) Invocare il metodo reset
        array.reset();

        // 5) Stampare il contenuto dell'array circolare
        array.printArray();

        // 6) Aggiungere altri elementi a piacere e stampare il contenuto
        // dell'array circolare
        array.add(23);
        array.add(76);
        array.add(90);
        array.add(25);
        array.printArray();
    }
}
