package toy2.service.security;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {
	
	private Long userId;
    private String userName;
    private String password;
    private int quiz_create;
    private List<GrantedAuthority> role= new ArrayList<GrantedAuthority>();
    
    public int getQuiz_create() {
		return quiz_create;
	}
	public void setQuiz_create(int quiz_create) {
		this.quiz_create = quiz_create;
	}
	public Long getUserId() {
		return userId;
	}
    public void setUserId(Long userId) {
    	this.userId = userId;
    }
	

	@Override
    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

   
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }


    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role;
    }

}
