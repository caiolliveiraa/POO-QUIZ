package Game;

public class Question {
	
	private String question;
	private Answer answer;
	private Category category;
	
	public Question(String question, Answer answer, Category category) {
		super();
		this.question = question;
		this.answer = answer;
		this.category= category;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	

}
