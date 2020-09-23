package toy2.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import toy2.dto.UserRankDto;



public interface UserService {
	Map<String, String> checkUserPassword(String nickname, String password);

	Map<String, String> checkNickName(String nickname);

	Map<String, String> signUp(String nickname, String password);
	
	List<UserRankDto> searchUserRank(Long userId);
	
}
