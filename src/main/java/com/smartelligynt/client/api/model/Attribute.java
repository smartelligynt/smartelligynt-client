package com.smartelligynt.client.api.model;

public class Attribute {

	private String name;

	private String label;

	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ClassPojo [name = " + name + ", label = " + label + ", type = " + type + "]";
	}
}
