package toy2.dto;

public class UserQuizDto {
	private int quizID;
	private int userID;
	private int answer;
	
	
	
	@Override
	public String toString() {
		return "UserQuizDto [quizID=" + quizID + ", userID=" + userID + ", answer=" + answer + "]";
	}
	public int getQuizID() {
		return quizID;
	}
	public void setQuizID(int quizID) {
		this.quizID = quizID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
}
