package implementacao;

import beans.Livro;

public class implementarLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Livro exemplar1 = new Livro();
		exemplar1.titulo = "Programação Java";
		exemplar1.editora = "Atlas Editora";
		exemplar1.autor = "Mike de Sousa";

		System.out.println("Exemplar1: " + exemplar1.titulo);
		System.out.println(" - Editora: " + exemplar1.editora);
		System.out.println("Autor: " + exemplar1.autor);

		Livro exemplar2 = new Livro();
		exemplar2.titulo = "Database Bigdata";
		exemplar2.editora = "Books";

		System.out.println("Exemplar2: " + exemplar2.titulo);
		System.out.println(" - Editora: " + exemplar2.editora);
	}

}
