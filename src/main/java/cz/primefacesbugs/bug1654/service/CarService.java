package cz.primefacesbugs.bug1654.service;

import java.util.List;

import cz.primefacesbugs.bug1654.domain.Car;

public interface CarService {
	
	List<Car> createCars(int size);

}
