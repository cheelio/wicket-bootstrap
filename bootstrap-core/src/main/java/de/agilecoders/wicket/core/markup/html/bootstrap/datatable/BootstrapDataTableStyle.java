package de.agilecoders.wicket.core.markup.html.bootstrap.datatable;

public enum BootstrapDataTableStyle {
	BORDERED("table-bordered"), 
	STRIPED("table-striped"), 
	CONDENSED("table-condensed");

	private String cssClass;

	BootstrapDataTableStyle(String cssClass) {
		this.cssClass = cssClass;
	}

	public String getCssClass() {
		return cssClass;
	}
}