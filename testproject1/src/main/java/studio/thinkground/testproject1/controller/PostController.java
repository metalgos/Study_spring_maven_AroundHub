package studio.thinkground.testproject1.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import studio.thinkground.testproject1.dto.MemberDto;

@Controller
@RequestMapping("/api/v1/post-api")
public class PostController {

    // http://localhost:8080/api/v1/post-api/default
    @PostMapping(value = "/default")
    public String postMethod() {

        return "testvalue";
    }

    // http://localhost:8080/api/v1/post-api/member
    @PostMapping(value = "/member") //주의 : form 으로 파라미터 받을때 리퀘스트 바디 어노테이션 쓰지 말것, 리퀘스트 파람 을 써야 받아짐
    public String postMember(@RequestParam Map<String, Object> postData, Model model) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        model.addAttribute("value",sb.toString());
    /*
    param.forEach((key, value) -> sb.append(key).append(" : ").append(value).append("\n"));
     */

        return "testvalue";
    }

    // http://localhost:8080/api/v1/post-api/member2
    @PostMapping(value = "/member2")
    public String postMemberDto(MemberDto memberDTO,Model model) {


        model.addAttribute("value",memberDTO.toString());

        return "testvalue";
    }

}