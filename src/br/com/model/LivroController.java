package br.com.model;

import java.util.ArrayList;
import java.util.List;

import br.com.model.dao.LivroDAO;

public class LivroController {

	private ArrayList<Livro> livros = new ArrayList<>();

	public LivroController() {
		List<Livro> l = LivroDAO.findAll(); 
		for(int i =0;i<l.size();i++) {
			livros.add(l.get(i));
		}
	}

	public ArrayList<Livro> getLivroByAutor(String autor) {
		ArrayList<Livro>l = new ArrayList<>();
		for (Livro li : livros) {
			if(li.getAutor().getNome().contains(autor) ){
				l.add(li);
			}
		}
		return l;
	}

	public ArrayList<Livro> getLivroByPalavraChave(String palavra) {
		ArrayList<Livro>l = new ArrayList<>();

		for (Livro li : livros) {
			if(li.getTitulo().contains(palavra) ){
				l.add(li);
			}
		}
		for (Livro li : livros) {
			if (li.getAutor()!=null) {
				if(li.getAutor().getNome().contains(palavra) ){
					if(!l.contains(li)) {
						l.add(li);
					}
				}
			}
		}
		for (Livro li : livros) {
			if(li.getTitulo().contains(palavra) ){
				if(!l.contains(li)) {
					l.add(li);
				}
			}
		}for (Livro li : livros) {
			if(li.getEditora().contains(palavra) ){
				if(!l.contains(li)) {
					l.add(li);
				}
			}
		}

		return l;
	}

	public ArrayList<Livro> getLivroByTitulo(String titulo) {
		ArrayList<Livro>l = new ArrayList<>();
		for (Livro li : livros) {
			if(li.getTitulo().contains(titulo) ){
				l.add(li);
			}
		}
		return l;
	}

	public ArrayList<Livro> getLivroByEditora(String editora) {
		ArrayList<Livro>l = new ArrayList<>();
		for (Livro li : livros) {
			if(li.getEditora().contains(editora) ){
				l.add(li);
			}
		}
		return l;
	}

}
