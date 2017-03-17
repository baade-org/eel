package org.baade.eel.core.xml;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "id", "name", "sexy"})
public class Human {

	private int id;
	private String name;
	private String sexy;
	
	
	public Human() {
		super();
	}
	public Human(int id, String name, String sexy) {
		super();
		this.id = id;
		this.name = name;
		this.sexy = sexy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSexy() {
		return sexy;
	}
	public void setSexy(String sexy) {
		this.sexy = sexy;
	}
	
	
	
}
