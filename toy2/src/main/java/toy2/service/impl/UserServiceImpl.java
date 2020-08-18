package toy2.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import toy2.config.security.JwtTokenProvider;
import toy2.dao.UserDao;
import toy2.service.UserService;
import toy2.service.security.CustomUserDetails;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userdao;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private JwtTokenProvider jwtTokenProvider;
	
	@Override
	public Map<String, String> checkUserPassword(String nickname, String password) {
		CustomUserDetails user = userdao.findByNickName(nickname);
		Map<String, String> map = new HashMap<String, String>();
		
		if(user==null && !passwordEncoder.matches(password, user.getPassword())) {
			map.put("success", null);
			
		}else {
			map.put("token", jwtTokenProvider.createToken(Long.toString(user.getUserId())));
			map.put("nickname", user.getUsername());
		}
		
		return map;
		
	}
}
