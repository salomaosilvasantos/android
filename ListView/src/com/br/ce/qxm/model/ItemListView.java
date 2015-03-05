package com.br.ce.qxm.model;

public class ItemListView {

	private int iconeRid;
	private String texto;

	public ItemListView(int iconeRid, String texto) {
		this.iconeRid = iconeRid;
		this.texto = texto;

	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getIconeRid() {
		return iconeRid;
	}

	public void setIconeRid(int iconeRid) {
		this.iconeRid = iconeRid;
	}

}
