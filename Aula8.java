package curso8;

public class Aula8 {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 POO");
		v[1] = new Video("Aula 12 Direito tributario");
		v[2] = new Video("Aqueles Caras");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Amanda", 18, "F", "man");
		g[1] = new Gafanhoto("Bianca", 23, "F", "bia");
		System.out.println("-------------------------------");
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[1]);
		vis [0].avaliar();
		System.out.println(vis[0].toString());
		System.out.println("-------------------------------");
		vis[1] = new Visualizacao(g[1], v[1]);
		vis[1].avaliar(87.0f);
		System.out.println(vis[1].toString());
		System.out.println("-------------------------------");
		vis[2] = new Visualizacao(g[0], v[2]);
		vis[2].avaliar();
		System.out.println(vis[2].toString());
		System.out.println("-------------------------------");
	}

}
