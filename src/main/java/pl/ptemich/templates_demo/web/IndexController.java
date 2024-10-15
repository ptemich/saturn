package pl.ptemich.templates_demo.web;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.ptemich.templates_demo.model.Item;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/")
    public String thymeleafExample(Model model, HttpSession session) {
        // Assuming 'Item' is a class with a 'name' property
        List<Item> items = List.of(
                new Item("Pierwszy"),
                new Item("Drugi")
        );

        model.addAttribute("items", items);
        // Set session attributes
        session.setAttribute("userName", "John Doe");
        session.setAttribute("isAdmin", true);
        return "index"; // Name of the Thymeleaf template
    }

}
