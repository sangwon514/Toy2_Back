package toy2.dto;

public class QuizDto {
	private int id;
	private String content;
	private int answer;
		
	
	
	@Override
	public String toString() {
		return "QuizDto [id=" + id + ", content=" + content + ", answer=" + answer + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	

}
