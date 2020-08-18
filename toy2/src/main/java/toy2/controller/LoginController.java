package toy2.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import toy2.service.UserService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserService userService;
	Logger log= LoggerFactory.getLogger(LoginController.class);
	@Autowired
	PasswordEncoder encoder;
	@PostMapping
	public Map<String, String> login(@RequestBody Map<String, String> json, HttpServletResponse response) {
		
		String nickname = json.get("nickname");
		String password = json.get("password");
		Map<String, String> map = userService.checkUserPassword(nickname, password);
		if (map.containsKey("nickname")) {
			response.addHeader("X-AUTH-TOKEN", map.get("token"));
			map.remove("token");
		}
		
		return map;

	}
}
