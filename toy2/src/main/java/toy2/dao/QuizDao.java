package toy2.dao;



import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import toy2.dto.QuizDto;
import toy2.dao.sql.QuizSqls;



@Repository
public class QuizDao {
	private NamedParameterJdbcTemplate jdbc;
    private SimpleJdbcInsert insertAction;
    private RowMapper<QuizDto> rowMapper = BeanPropertyRowMapper.newInstance(QuizDto.class);

    public QuizDao(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
        
    }
    
    public List<QuizDto> getQuizzes() {
    	
    	
    	
    	return jdbc.query(QuizSqls.SELECT_QUIZZES, Collections.<String, Object>emptyMap(), rowMapper);
    }
}
