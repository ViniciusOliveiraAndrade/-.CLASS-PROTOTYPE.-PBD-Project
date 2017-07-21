package br.com.model.dao;

import java.util.List;

public interface InterfaceDAO {
	
	public void persiste();
	public void merge();
	public List<Object> list();
	public void remove();

}
