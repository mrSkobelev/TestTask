package main;

import java.util.ArrayList;
import java.util.Date;
import main.model.CarMake;
import main.model.CarMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DefaultController {

    @Autowired
    private CarMakeRepository carMakeRepository;

    private void addDefaultMakes()
    {
        CarMake toyota = new CarMake();
        toyota.setMake("toyota");
        carMakeRepository.save(toyota);

        CarMake audi = new CarMake();
        audi.setMake("audi");
        carMakeRepository.save(audi);
    }

    @RequestMapping("/")
    public String index(Model model) {
        addDefaultMakes();
        Iterable<CarMake> carMakeIterable = carMakeRepository.findAll();
        ArrayList<CarMake> carMakeArrayList = new ArrayList<>();
        for (CarMake carMake : carMakeArrayList) {
            carMakeArrayList.add(carMake);
        }
        model.addAttribute("carMake", carMakeArrayList);

        return "index";
    }
}
