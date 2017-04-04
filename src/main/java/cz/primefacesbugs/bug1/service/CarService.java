package cz.primefacesbugs.bug1.service;

import java.util.List;

import cz.primefacesbugs.bug1.domain.Car;

public interface CarService {
	
	List<Car> createCars(int size);

}
