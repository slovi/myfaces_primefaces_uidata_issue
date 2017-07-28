package cz.primefacesbugs.service;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Named;

@Default
@Named("serviceData")
@ApplicationScoped
public class ServiceDataImpl implements ServiceData {

	private String dataName = "data";

	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}
	
}
