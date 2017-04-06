package cz.primefacesbugs.bug1654;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class Frame1View implements Serializable {
	
	private String message = "frame 1";
	private String test = "test";
	
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
