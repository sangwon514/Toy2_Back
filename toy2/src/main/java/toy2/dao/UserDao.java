package toy2.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import toy2.service.security.CustomUserDetails;
import toy2.dao.sql.*;

@Repository
public class UserDao {
	private NamedParameterJdbcTemplate jdbc;
	private RowMapper<CustomUserDetails> rowMapper= BeanPropertyRowMapper.newInstance(CustomUserDetails.class);
	
	public UserDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public CustomUserDetails findByNickName(String nickname) {
		Map<String, Object> params = new HashMap<>();
		params.put("nickname", nickname);
		return jdbc.queryForObject(UserDaoSqls.findByNickname, params, rowMapper);
	}
	
	
	
}
