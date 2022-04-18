package variables.instancia;

public class BookInstancia {

	private int total = 0;

	public BookInstancia() {
		total++;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public static void main(String[] args) {

		BookInstancia bi = new BookInstancia();
		System.out.println("Valor : " + bi.getTotal());

		BookInstancia bi1 = new BookInstancia();
		bi1.setTotal(1);
		bi1.setTotal(2);
		System.out.println("Valor : " + bi1.getTotal());

	}
}
