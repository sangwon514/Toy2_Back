package toy2.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import toy2.dao.UserDao;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    // CustomUserDbService는 인터페이스다. 해당 인터페이스를 구현하고 있는 객체가 Bean으로 등록되어 있어야 한다.
    @Autowired
    private UserDao userdao;

    @Override
    public CustomUserDetails loadUserByUsername(String loginUserId) throws UsernameNotFoundException {
        // loginId에 해당하는 정보를 데이터베이스에서 읽어 CustomUser객체에 저장한다.
        // 해당 정보를 CustomUserDetails객체에 저장한다.
        CustomUserDetails customUser = userdao.findByNickName(loginUserId);
        if(customUser == null) {
        	 throw new UsernameNotFoundException(loginUserId);
        }
        
        return customUser;
    }
}
