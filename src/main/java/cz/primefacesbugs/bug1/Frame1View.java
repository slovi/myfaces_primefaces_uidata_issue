package cz.primefacesbugs.bug1;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class Frame1View implements Serializable {
	
	private static final long serialVersionUID = 3148257465826616009L;
	private String message = "frame 1";
	
	@PostConstruct
	public void init() {
		System.out.println("Frame 1 init");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
