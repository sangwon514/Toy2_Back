package toy2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import toy2.dto.*;

public interface QuizService {
	
	
	
	public List<QuizDto> getQuizzes();
	public int insertUserQuiz(UserQuizDto userQuiz);
	public List<QuizDto> getUserQuizzes(String nickname);
	public List<ScoreDto> getScore(Long userId);
	
}
