package com.lapis.pfexporter.spi;

import javax.faces.context.FacesContext;

import com.lapis.pfexporter.api.IExportType;

public interface IExportSource<T, C> {

	Class<T> getSourceType();
	C getDefaultConfigOptions();
	int getColumnCount(T source, C configOptions);
	void exportData(T source, C configOptions, IExportType<?, ?, ?> exporter, FacesContext context) throws Exception;

}
