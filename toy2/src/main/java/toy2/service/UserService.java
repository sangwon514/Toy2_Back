package toy2.service;

import java.util.Map;

public interface UserService {
	Map<String, String> checkUserPassword(String nickname, String password);
	
}
