class TestComplexNumCalculator {
  public static void main(String[] args) {
      /*
       * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
       *    tra numeri complessi:
       *
       * - add(1+2i, 2+3i) = 3+5i
       *
       * - sub(4+5i, 6+7i) = -2-2i
       *
       * - mul(8+2i, 3-i) = 26 - 2i
       *
       * - ... altre a piacere
       *
       * 2) Verificare il corretto valore dei campi nOpDone, lastRes
       *
       * 3) Fare altre prove con operazioni a piacere
       */
	   
	   ComplexNumCalculator calculator = new ComplexNumCalculator();
	   calculator.build();
	   ComplexNum num1 = new ComplexNum();
	   num1.build(1, 2);
	   ComplexNum num2 = new ComplexNum();
	   num2.build(2, 3);
	   System.out.println("Add 1+2i with 2+3i: " + calculator.add(num1, num2));
	   System.out.println("Number of Operations Done: " + calculator.nOpDone);
	   if (calculator.nOpDone > 1) System.out.println("Last Result: " + calculator.lastRes.toStringRep());
	   num1.build(4, 5);
	   num2.build(6, 7);
	   System.out.println("Sub 4+5i with 6+7i: " + calculator.sub(num1, num2));
	   System.out.println("Number of Operations Done: " + calculator.nOpDone);
	   if (calculator.nOpDone > 1) System.out.println("Last Result: " + calculator.lastRes.toStringRep());
	   num1.build(8, 2);
	   num2.build(3, -1);
	   System.out.println("Mul 8+2i with 3-i: " + calculator.mul(num1, num2));
	   System.out.println("Number of Operations Done: " + calculator.nOpDone);
	   if (calculator.nOpDone > 1) System.out.println("Last Result: " + calculator.lastRes.toStringRep());
  }
}
