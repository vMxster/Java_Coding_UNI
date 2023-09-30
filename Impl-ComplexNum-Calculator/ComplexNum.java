public class ComplexNum {
    double re;
	double im;

    void build(double re, double im) {
        this.re = re;
		this.im = im;
    }

    boolean equal(ComplexNum num) {
        if ( this.re == num.re && this.im == num.im ) {
				return true;
		}	
        return false;
    }

    void add(ComplexNum num) {
        this.re += num.re;
		this.im += num.im;
    }

    String toStringRep() {
        if (this.im>=0 && this.re>=0) {
            return (int) this.re + "+" + (int) this.im + "i";
        }
        if (this.im>=0 && this.re<=0) {
            return (int) this.re + "+" + (int) this.im + "i";
        }
        if (this.im<=0 || this.re<=0) {
            return (int) this.re + "" + (int) this.im + "i";
        }
        return "Error";
    }
}