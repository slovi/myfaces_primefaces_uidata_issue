package cz.primefacesbugs.bug2;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

@Named
@ViewScoped
public class DialogBean implements Serializable {

	private static final long serialVersionUID = 7123165280133112773L;

	public void showDialog1() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("closable", true);
		RequestContext.getCurrentInstance().openDialog(
				"/bug2/test-dialog-1", options, new HashMap<String, List<String>>());
	}
	
	public void closeDialog1() {
		RequestContext.getCurrentInstance().closeDialog(null);
	}
	
	public void showDialog2() {
		RequestContext.getCurrentInstance().openDialog("/bug2/test-dialog-2");
	}
	
	public void closeDialog2() {
		RequestContext.getCurrentInstance().closeDialog(null);
	}
	
}
