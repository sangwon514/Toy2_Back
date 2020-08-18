package toy2.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import toy2.dao.QuizDao;
import toy2.dto.QuizDto;
import toy2.service.QuizService;

public class QuizServiceImpl implements QuizService{
	@Autowired
	private QuizDao quizDao;
	
	
	
	@Override
	public List<QuizDto> getQuizzes() {
		
		List<QuizDto> quizzes = quizDao.getQuizzes();
		List<QuizDto> list = new ArrayList<QuizDto>();
		
		
		int size=quizzes.size();
		
		
		Random random = new Random();
		int randNum=random.nextInt(size);
		for(int i=0; i<5;i++) {
			list.add(quizzes.get(randNum));
		}
		
		return list;
	}
	
	

}
