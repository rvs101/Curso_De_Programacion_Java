package conceptos.super_ejemplo;

public class ComplejoAmpliado extends Complejo {

	private Boolean esReal;
	private double im;

	private ComplejoAmpliado(double re, double im) {
		super(re, im);
		esReal = im == 0;
	}

	public ComplejoAmpliado(double re) {
		super(re, 0);
		esReal = true;
	}

	@Override
	public Complejo sumar(double re, double im) {
		esReal = im == this.im;
		return super.sumar(re, im);
	}

	public boolean esReal() {
		return esReal;
	}

}

class Complejo {

	private double re;
	private double im;

	public Complejo() {
		this.re = 0;
		this.im = 0;
	}

	public Complejo(double re, double im) {
		this.re = re;
		this.im = im;
	}

	public Complejo sumar(double re, double im) {
		return Complejo.this;
	}

}
