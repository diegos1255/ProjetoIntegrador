package br.edu.facear.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="documentoBean")
@RequestScoped
public class DocumentoBean {

	public String teste() {
		System.out.println("Teste");
		
		return "";
	}
	
}
