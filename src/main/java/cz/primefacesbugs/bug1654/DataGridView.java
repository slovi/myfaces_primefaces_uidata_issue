package cz.primefacesbugs.bug1654;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import cz.primefacesbugs.bug1654.domain.Car;
import cz.primefacesbugs.bug1654.service.CarService;

@Named
@ViewScoped
public class DataGridView implements Serializable {
	
	private List<Car> cars;
    
    private Car selectedCar;
     
    private CarService service;
     
    @PostConstruct
    public void init() {
        cars = service.createCars(48);
    }
 
    public List<Car> getCars() {
        return cars;
    }
 
    @Inject
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
