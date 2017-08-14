package br.com.model.beans;

import java.util.ArrayList;
import java.util.List;

public class DadosEmRam {

	public static ArrayList<Autor> autores ;
	public static ArrayList<Curso> cursos;
	public static ArrayList<Departamento> departamentos ;
	public static ArrayList<Emprestimo> emprestimos;
	public static ArrayList<Funcionario> funcioanrios;
	public static ArrayList<Livro> livrios;
	public static ArrayList<Reserva> reservas;
	public static ArrayList<Usuario> usuarios;

	

	/*
	 * =========================================  GET and SET  ===================================================
	 */
	
	public static ArrayList<Autor> getAutores() {
		return autores;
	}
	
	public static void setAutores(List<Autor> autores) {
		for(int i = 0; i <autores.size();i++) {
			DadosEmRam.autores.add(autores.get(i)) ;
		}
	}
	
	public static ArrayList<Curso> getCursos() {
	
		return cursos;
	}
	
	public static void setCursos(List<Curso> cursos) {
		for(int i = 0; i <cursos.size();i++) {
			DadosEmRam.cursos.add(cursos.get(i)) ;
		}
	}
	
	public static ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}
	
	public static void setDepartamentos(ArrayList<Departamento> departamentos) {
		DadosEmRam.departamentos = departamentos;
	}
	
	public static ArrayList<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
	
	public static void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
		DadosEmRam.emprestimos = emprestimos;
	}

	public static ArrayList<Funcionario> getFuncioanrios() {
		return funcioanrios;
	}

	public static void setFuncioanrios(ArrayList<Funcionario> funcioanrios) {
		DadosEmRam.funcioanrios = funcioanrios;
	}

	public static ArrayList<Livro> getLivrios() {
		return livrios;
	}
	
	public static void setLivrios(ArrayList<Livro> livrios) {
		DadosEmRam.livrios = livrios;
	}

	public static ArrayList<Reserva> getReservas() {
		return reservas;
	}
	
	public static void setReservas(ArrayList<Reserva> reservas) {
		DadosEmRam.reservas = reservas;
	}
	
	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public static void setUsuarios(ArrayList<Usuario> usuarios) {
		DadosEmRam.usuarios = usuarios;
	}
	
}
