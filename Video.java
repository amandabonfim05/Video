package curso8;

public class Video implements AcoesVideo{
	private String titulo;
	private int avaliacao;
	private int views;
	private int likes;
	private boolean reproduzindo;
	public Video(String t) {
		this.titulo = t;
		this.setAvaliacao(1);
		this.setViews(0);
		this.setLikes(0);
		this.setReproduzindo(false);
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String t) {
		this.titulo = t;
	}
	public int getAvaliacao() {
		return this.avaliacao;
	}
	public void setAvaliacao(int a) {
		this.avaliacao = a;
	}
	public int getViews() {
		return this.views;
	}
	public void setViews(int v) {
		this.views = v;
	}
	public int getLikes() {
		return this.likes;
	}
	public void setLikes(int l) {
		this.likes = l;
	}
	public boolean getReproduzido() {
		return this.reproduzindo;
	}
	public void setReproduzindo(boolean r) {
		this.reproduzindo = r;
	}
	@Override
	public void play() {
		this.setReproduzindo(true);		
	}
	@Override
	public void pause() {
		this.setReproduzindo(false);		
	}
	@Override
	public void like() {
		this.likes ++;		
	}
	public String toString() {
		return "Video{" + "titulo=" + titulo + ", avaliação="  + avaliacao
				+ "\n, views=" + views + ", curtidas=" + likes
				+ "\n, reproduzindo=" + reproduzindo + '}';
	}
	
}
