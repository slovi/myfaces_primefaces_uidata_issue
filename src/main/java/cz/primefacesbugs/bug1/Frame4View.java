package cz.primefacesbugs.bug1;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class Frame4View implements Serializable {
	
	private static final long serialVersionUID = 8487326783056128332L;
	
	private String message = "frame 4";
	
	@PostConstruct
	public void init() {
		System.out.println("Frame 4 init");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
