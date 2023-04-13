package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import main.model.CarMake;
import main.model.CarMakeRepository;
import main.model.CarModel;
import main.model.CarModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

  @Autowired
  private CarMakeRepository carMakeRepository;
  @Autowired
  private CarModelRepository carModelRepository;

  @GetMapping("/cars/")
  public List<CarModel> list() {
    Iterable<CarModel> modelIterable = carModelRepository.findAll();
    ArrayList<CarModel> models = new ArrayList<>();
    for (CarModel model : modelIterable) {
      models.add(model);
    }
    return models;
  }

  @PostMapping("/cars/")
  public int add(CarModel carModel) {
    CarModel model = carModelRepository.save(carModel);
    return model.getId();
  }

  @GetMapping("/cars/{id}")
  public ResponseEntity get(@PathVariable int id) {
    Optional<CarModel> optionalCarModel = carModelRepository.findById(id);
    if (!optionalCarModel.isPresent()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    return new ResponseEntity(optionalCarModel.get(), HttpStatus.OK);
  }
}
