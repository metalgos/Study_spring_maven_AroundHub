package studio.thinkground.testproject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import studio.thinkground.testproject1.dto.MemberDto;

import java.util.Map;

@RequestMapping("api/vi/")
@Controller()
public class GetController {
    //http://localhost:8080/api/vi/hello
    @GetMapping("hello")
    public String getHello(Model model) {

        model.addAttribute("value", "hello");
        return "testvalue";
    }


    @GetMapping("name")
    public String getName(Model model) {

        model.addAttribute("value", "Flature");
        return "testvalue";
    }

    @GetMapping("valiable/{valiable}")
    public String valiable(@PathVariable String valiable, Model model) {

        model.addAttribute("value", valiable);
        return "testvalue";
    }

    //http://localhost:8080/api/vi/valiable2/2525
    @GetMapping("valiable2/{valiable}")
    public String valiable2(@PathVariable String valiable, Model model) {

        model.addAttribute("value", valiable);
        return "testvalue";
    }


    //http://localhost:8080/api/vi/request1?name=kim&email=aga@google&organizaion=aroundhub
    @GetMapping(value = "/request1")
    public String getRequesParam3(@RequestParam String name,
                                  @RequestParam String email,
                                  @RequestParam String organizaion, Model model) {

        model.addAttribute("value", name + " " + email + " " + organizaion);
        return "testvalue";
    }


    //http://localhost:8080/api/vi/request2?key1=value1&key2=value2
    @GetMapping(value = "/request2")
    public String getRequesParam3(@RequestParam Map<String, String> param1,Model model) {
        StringBuilder sb = new StringBuilder();
        param1.entrySet().forEach(map->{
            sb.append(map.getKey() + "  "+map.getValue()+"\n");
        });

        model.addAttribute("value",sb.toString());
        return "testvalue";
    }


    //http://localhost:8080/api/vi/request3?name=kim&email=aga@google&organizaion=aroundhub
    @GetMapping("request3")
    public String request3(MemberDto memberDto, Model model) {

        model.addAttribute("value", memberDto);
        return "testvalue";
    }


}
