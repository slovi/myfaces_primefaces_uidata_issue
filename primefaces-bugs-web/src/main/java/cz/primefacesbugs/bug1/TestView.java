package cz.primefacesbugs.bug1;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {

	private static final long serialVersionUID = 4700083204471705111L;
	
	private String test = "test";

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
}
