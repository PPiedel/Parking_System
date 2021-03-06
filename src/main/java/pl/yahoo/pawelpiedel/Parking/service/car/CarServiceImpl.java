package pl.yahoo.pawelpiedel.Parking.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.yahoo.pawelpiedel.Parking.domain.Car;
import pl.yahoo.pawelpiedel.Parking.repository.CarRepository;

@Component
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    @Override
    public Car findByLicencePlateNumber(String licenceNumber) {
        return carRepository.findByLicensePlateNumber(licenceNumber);
    }

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public boolean isUnknown(Car car) {
        return car.getDriver() == null && car.getId() == null;
    }
}
