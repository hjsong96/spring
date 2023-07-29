package hi.hispring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HiController {
    @GetMapping("hi")
    public String hi(Model model) {
        model.addAttribute("data", "hi!!");
        return "hi";
    }

    @GetMapping("hi-mvc")
    public String himvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hi-template";
    }

    @GetMapping("hi-string")
    @ResponseBody
    public String hiString(@RequestParam("name") String name) {
        return "hi " + name; //hi spring
    }

    @GetMapping("hi-api")
    @ResponseBody
    public Hi hiApi(@RequestParam("name") String name) {
        Hi hi = new Hi();
        hi.setName(name);
        return hi;
    }

    static class Hi {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

