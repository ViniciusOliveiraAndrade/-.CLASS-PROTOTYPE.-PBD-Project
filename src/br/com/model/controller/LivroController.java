package br.com.model.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.model.beans.Livro;
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
			if(li.getAutor().getNome().toLowerCase().contains(autor.toLowerCase()) ){
				l.add(li);
			}
		}
		return l;
	}

	public ArrayList<Livro> getLivroByPalavraChave(String palavra) {
		ArrayList<Livro>l = new ArrayList<>();

		for (Livro li : livros) {
			if(li.getTitulo().toLowerCase().contains(palavra.toLowerCase()) ){
				l.add(li);
			}
		}
		for (Livro li : livros) {
			if (li.getAutor()!=null) {
				if(li.getAutor().getNome().toLowerCase().contains(palavra.toLowerCase()) ){
					if(!l.contains(li)) {
						l.add(li);
					}
				}
			}
		}
		for (Livro li : livros) {
			if(li.getTitulo().toLowerCase().contains(palavra.toLowerCase()) ){
				if(!l.contains(li)) {
					l.add(li);
				}
			}
		}for (Livro li : livros) {
			if(li.getEditora().toLowerCase().contains(palavra.toLowerCase()) ){
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
			if(li.getTitulo().toLowerCase().contains(titulo.toLowerCase()) ){
				l.add(li);
			}
		}
		return l;
	}

	public ArrayList<Livro> getLivroByEditora(String editora) {
		ArrayList<Livro>l = new ArrayList<>();
		for (Livro li : livros) {
			if(li.getEditora().toLowerCase().contains(editora.toLowerCase()) ){
				l.add(li);
			}
		}
		return l;
	}

}
