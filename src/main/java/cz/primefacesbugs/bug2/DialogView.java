package cz.primefacesbugs.bug2;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

@ManagedBean
@ViewScoped
public class DialogView implements Serializable {

	private static final long serialVersionUID = 7123165280133112773L;

	public void showDialog1(ActionEvent e) {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("closable", true);
		RequestContext.getCurrentInstance().openDialog(
				"/bug2/test-dialog-1", options, new HashMap<String, List<String>>());
	}
	
	public void showDialog2(ActionEvent e) {
		RequestContext.getCurrentInstance().openDialog("/bug2/test-dialog-2");
	}
	
	public void closeCurrentDialog(ActionEvent e) {
		RequestContext.getCurrentInstance().closeDialog(null);
	}
	
}
