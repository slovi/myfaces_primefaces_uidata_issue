package cz.primefacesbugs.bug2;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

@ManagedBean
@ViewScoped
public class DialogView implements Serializable {

	private static final long serialVersionUID = 7123165280133112773L;

	public void showDialog1(ActionEvent e) {
		RequestContext.getCurrentInstance().openDialog("/bug2/dialog1");
	}
	
	public void showDialog2(ActionEvent e) {
		RequestContext.getCurrentInstance().openDialog("/bug2/dialog2");
	}
	
	public void closeCurrentDialog(ActionEvent e) {
		RequestContext.getCurrentInstance().closeDialog(null);
	}
	
}
