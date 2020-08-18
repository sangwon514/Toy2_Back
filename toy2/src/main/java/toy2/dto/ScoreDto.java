package toy2.dto;

public class ScoreDto {
	private int examiner;
	private int answerer;
	private int score;
	
	
	
	@Override
	public String toString() {
		return "ScoreDto [examiner=" + examiner + ", answerer=" + answerer + ", score=" + score + "]";
	}
	public int getExaminer() {
		return examiner;
	}
	public void setExaminer(int examiner) {
		this.examiner = examiner;
	}
	public int getAnswerer() {
		return answerer;
	}
	public void setAnswerer(int answerer) {
		this.answerer = answerer;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	

}
