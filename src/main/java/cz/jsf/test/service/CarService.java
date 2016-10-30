package cz.jsf.test.service;

import java.util.List;

import cz.jsf.test.domain.Car;

public interface CarService {
	
	List<Car> createCars(int size);

}
