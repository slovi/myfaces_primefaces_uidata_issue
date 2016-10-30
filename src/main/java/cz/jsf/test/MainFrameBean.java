package cz.jsf.test;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("mainFrameBean")
@ViewScoped
public class MainFrameBean implements Serializable {

	private String menuValue = "iframe1.xhtml";
	private Set<String> excludeViewBeans = new HashSet<String>();
	
	@PostConstruct
	public void init() {
		excludeViewBeans.add("mainFrameBean");
	}
	
	private Map<String, Object> getViewMap() {
		return FacesContext.getCurrentInstance().getViewRoot().getViewMap();
	}
	
	private void deleteViewBeans() {
		Iterator<Entry<String, Object>> iterator = getViewMap().entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Object> entry = iterator.next();
			String beanName = entry.getKey();
			if (!excludeViewBeans.contains(beanName)) {
				iterator.remove();
			}
		}
	}

	public String setMenu(String menuValue) {
		return null;
	}

	public String getMenuValue() {
		return menuValue;
	}

	public void setMenuValue(String menuValue) {
		System.out.println("Before: " + this.menuValue + ", now: " + menuValue + " " + this);
		this.menuValue = menuValue;
		System.out.println("Before beans: " + getViewMap());
		deleteViewBeans();
		System.out.println("After beans: " + getViewMap());
		this.menuValue = menuValue;
	}
	
}
