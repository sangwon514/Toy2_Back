package toy2.service;

import java.util.List;

import toy2.service.security.UserDbService;
import toy2.service.security.UserEntity;
import toy2.service.security.UserRoleEntity;



public interface MemberService extends UserDbService {
	public UserEntity getUser(String loginUserId);
	public Long getUserIdNum(String loginUserId);
	public List<UserRoleEntity> getUserRoles(String loginUserId);
}
