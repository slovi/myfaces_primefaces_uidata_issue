package cz.primefacesbugs.bug1;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class MainFrameView implements Serializable {

	private static final long serialVersionUID = -8825266433508522729L;
	
	private String menuValue = "iframe1.xhtml";
	
	private Set<String> excludeViewBeans = new HashSet<String>();
	
	@PostConstruct
	public void init() {
		System.out.println("init: " + this);
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

	public String getMenuValue() {
		System.out.println("getting value: " + menuValue);
		return menuValue;
	}

	public void setMenuValue(String menuValue) {
		System.out.println("setting value: " + menuValue);
		deleteViewBeans();
		this.menuValue = menuValue;
	}
	
}
