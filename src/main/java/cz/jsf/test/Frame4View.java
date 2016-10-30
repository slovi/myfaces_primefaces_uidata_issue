package cz.jsf.test;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class Frame4View implements Serializable {
	
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
