package toy2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import toy2.service.MemberService;




@Controller
@RequestMapping(path = "/members")
public class UserController {
    // 스프링 컨테이너가 생성자를 통해 자동으로 주입한다.
    private final MemberService memberService;

    public UserController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("/loginform")
    public String loginform(){
        return "members/loginform";
    }

    @RequestMapping("/loginerror")
    public String loginerror(@RequestParam("login_error")String loginError){
        return "members/loginerror";
    }

}
