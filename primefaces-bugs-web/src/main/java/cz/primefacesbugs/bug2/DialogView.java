package cz.primefacesbugs.bug2;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Default;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

import cz.primefacesbugs.service.ServiceData;

@Named
@ViewScoped
public class DialogView implements Serializable {

	private static final long serialVersionUID = 7123165280133112773L;
	
	private String dataName;
	
	@Inject
	@Default
	private ServiceData serviceData;
	
	@PostConstruct
	public void init() {
		this.dataName = serviceData.getDataName();
	}

	public void showDialog1(ActionEvent e) {
		RequestContext.getCurrentInstance().openDialog("/bug2/dialog1");
	}
	
	public void showDialog2(ActionEvent e) {
		RequestContext.getCurrentInstance().openDialog("/bug2/dialog2");
	}
	
	public void closeCurrentDialog(ActionEvent e) {
		RequestContext.getCurrentInstance().closeDialog(null);
	}

	public String getDataName() {
		return dataName;
	}
	
}
