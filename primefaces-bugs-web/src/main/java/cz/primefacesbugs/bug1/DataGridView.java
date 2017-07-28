package cz.primefacesbugs.bug1;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import cz.primefacesbugs.bug1.domain.Car;
import cz.primefacesbugs.bug1.impl.CarServiceImpl;
import cz.primefacesbugs.bug1.service.CarService;

@Named
@ViewScoped
public class DataGridView implements Serializable {
	
	private static final long serialVersionUID = 3263581768248952299L;

	private List<Car> cars;
    
    private Car selectedCar;
     
    private CarService service = new CarServiceImpl();
     
    @PostConstruct
    public void init() {
        cars = service.createCars(48);
    }
 
    public List<Car> getCars() {
        return cars;
    }
 
    public void setService(CarService service) {
        this.service = service;
    }
 
    public Car getSelectedCar() {
        return selectedCar;
    }
 
    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
   
}
