class ComplexNumCalculator {
	int nOpDone;
	ComplexNum lastRes;
	ComplexNum currentRes;
	
	void build() {
		this.nOpDone = 0;
	}
	String add(ComplexNum num1, ComplexNum num2) {
		ComplexNum num = new ComplexNum();
		num.re = num1.re + num2.re;
		num.im = num1.im + num2.im;
		if (this.nOpDone > 0) {
			this.lastRes = currentRes;
		}
		this.currentRes = num;
		(this.nOpDone)++;
		return num.toStringRep();
	}
	String sub(ComplexNum num1, ComplexNum num2) {
		ComplexNum num = new ComplexNum();
		num.re = num1.re - num2.re;
		num.im = num1.im - num2.im;
		if (this.nOpDone > 0) {
			this.lastRes = currentRes;
		}
		this.currentRes = num;
		(this.nOpDone)++;
		return num.toStringRep();
	}
	String mul(ComplexNum num1, ComplexNum num2) {
		ComplexNum num = new ComplexNum();
		num.re = (num1.re * num2.re) - (num1.im * num2.im);
		num.im = (num1.im * num2.re) + (num1.re * num2.im);
		if (this.nOpDone > 0) {
			this.lastRes = currentRes;
		}
		this.currentRes = num;
		(this.nOpDone)++;
		return num.toStringRep();
	}
	String div(ComplexNum num1, ComplexNum num2) {
		ComplexNum num = new ComplexNum();
		num.re = ((num1.re * num2.re) + (num1.im * num2.im))/((num2.re * num2.re) + (num2.im * num2.im));
		num.im = ((num1.im * num2.re) - (num1.re * num2.im))/((num2.re * num2.re) + (num2.im * num2.im));
		if (this.nOpDone > 0) {
			this.lastRes = currentRes;
		}
		this.currentRes = num;
		(this.nOpDone)++;
		return num.toStringRep();
	}
}