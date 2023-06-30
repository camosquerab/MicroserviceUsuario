package mx.com.gm.Controller;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.Dao.PersonDao;
import mx.com.gm.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;


@Controller
@Slf4j
public class Inicio {

    @Autowired
    private PersonDao personDao;
    @GetMapping("/")
    public String inicio(Model model){
        var personas = personDao.findAll();
        log.info("ejecutando el controlador de spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
}
