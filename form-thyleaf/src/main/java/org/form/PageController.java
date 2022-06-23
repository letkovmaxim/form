package org.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;

@Controller
public class PageController {

    private ArrayList<Person> people = new ArrayList<>();

    @GetMapping("/")
    public String showPage(Model model) {
        model.addAttribute("people", people);
        return "index";
    }

    @PostMapping("/")
    public String postPage(@ModelAttribute Person person) {
        if (!person.getName().equals("")
                && !person.getSurname().equals("")
                && !person.getPatronym().equals("")) {
            people.add(person);
        }
        return "redirect:/";
    }
}