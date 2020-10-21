package pl.project.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;


@Controller
public class CarsController {

    @Autowired
    private CarsService carsService;

    // здесь будут методы обработки

    @RequestMapping("/")
    public ModelAndView home() {
        List<Cars> listCars = carsService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listCars", listCars);
        return mav;
    }

    @RequestMapping("/new")
    public String newCarsForm(Map<String, Object> model) {
        Cars cars = new Cars();
        model.put("cars", cars);
        return "new_cars";
    }

}