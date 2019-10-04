package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@Controller
public class ReadingController {

    @GetMapping("/reading")
    public String reading(Model model) throws IOException{
        File file = new File("./src/main/resources/files/toRead.txt");
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        model.addAttribute("line", line);
        return "reading";
    }

}