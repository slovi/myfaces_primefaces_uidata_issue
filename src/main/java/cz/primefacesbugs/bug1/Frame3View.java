package cz.primefacesbugs.bug1;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class Frame3View implements Serializable {
	
	private static final long serialVersionUID = -9087541363832949153L;
	
	private String message = "frame 3";
	
	@PostConstruct
	public void init() {
		System.out.println("Frame 3 init");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
