package pl.yahoo.pawelpiedel.Parking.service.place;

import org.springframework.stereotype.Service;
import pl.yahoo.pawelpiedel.Parking.domain.place.Place;

import java.util.List;

@Service
public interface PlaceService {
    List<Place> getAvailablePlaces();

    Place getPlaceForParking(List<Place> places);

    Place save(Place place);

    Place releasePlace(Place place);
}
