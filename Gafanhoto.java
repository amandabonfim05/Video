package curso8;

public class Gafanhoto extends Pessoa {
	public Gafanhoto(String n, int i, String s, String l) {
		super(n, i, s);
		this.setLogin(l);
		this.setTotAssistido(0);
		
	}
	private String login;
	private int totAssistido;
	public void viuMaisUm() {
		
	}
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String l) {
		this.login = l;
	}
	public int getTotAssistido() {
		return this.totAssistido;
	}
	public void setTotAssistido(int ta) {
		this.totAssistido = ta;
	}
	public String toString() {
		return "Gafanhot {" + super.toString() + "\nlogin=" + login
				+ ", assistido=" + totAssistido + '}';
	}
}
