package de.agilecoders.wicket.core.markup.html.bootstrap.datatable;

import java.util.List;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.markup.html.TransparentWebMarkupContainer;
import org.apache.wicket.markup.repeater.data.IDataProvider;

public class BootstrapDataTable<T, S> extends DataTable<T, S> {

	private static final long serialVersionUID = 7899406219104376859L;

	public BootstrapDataTable(String id, List<? extends IColumn<T, S>> columns,
			IDataProvider<T> dataProvider, long rowsPerPage,
			BootstrapDataTableStyle[] tableStyles) {
		super(id, columns, dataProvider, rowsPerPage);
		TransparentWebMarkupContainer table = new TransparentWebMarkupContainer(
				"table");
		table.add(new AttributeModifier("class", getTableStyles(tableStyles)));
		add(table);
	}

	public BootstrapDataTable(String id, List<? extends IColumn<T, S>> columns,
			IDataProvider<T> dataProvider, long rowsPerPage) {
		this(id, columns, dataProvider, rowsPerPage, null);
	}

	private String getTableStyles(BootstrapDataTableStyle[] tableStyles) {
		StringBuilder styles = new StringBuilder("table");
		if (tableStyles != null) {
			for (BootstrapDataTableStyle tableStyle : tableStyles) {
				styles.append(" ");
				styles.append(tableStyle.getCssClass());
			}
		}
		return styles.toString();
	}

}
