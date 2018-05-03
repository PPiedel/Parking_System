package pl.yahoo.pawelpiedel.Parking.service.parking;

import org.springframework.stereotype.Service;
import pl.yahoo.pawelpiedel.Parking.domain.parking.Parking;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public interface ParkingService {
    boolean isCarAlreadyParked(String licensePlateNumber);

    Parking save(Parking entity);

    Parking save(LocalDateTime stopTime, Long id) throws ParkingNotFoundException;

    Optional<Parking> getParking(Long id);

}
