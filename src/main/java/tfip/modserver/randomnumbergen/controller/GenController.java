package tfip.modserver.randomnumbergen.controller;

import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/generate")
public class GenController {
    
    @GetMapping(produces = {"text/html"})
    private String generateNumber(Model model, @RequestParam(required =true) String genNum){

        try{
            int number = Integer.parseInt(genNum);
            if (number<=30 && number >=0){
                model.addAttribute("number", number);
                List<Integer> range = IntStream.rangeClosed(0, 30)
                    .boxed()
                    .collect(Collectors.toList());
                
                Collections.shuffle(range);
                List<String> picList = range.subList(0, number)
                    .stream()
                    .map(f -> "number" + Integer.toString(f)+".jpg")
                    .toList();
                
                model.addAttribute("pictures", picList);
                model.addAttribute("userInput", number);
            }
            else{
                throw new IllegalArgumentException();
            }
        }
        catch (NumberFormatException e){
            model.addAttribute("error", "Error!! A integer is needed");
            return "error";
        }
        catch (IllegalArgumentException e){
            model.addAttribute("error", "Error!! Number need to be between 0 and 30");
            return "error";
        }
        return "generate";
    }
}