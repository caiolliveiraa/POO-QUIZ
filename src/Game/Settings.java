package Game;

public class Settings {
	
	private Level level;
	private Category category;
	
	
	public Settings(Level level, Category category) {
		super();
		this.level = level;
		this.category = category;
	}


	public Level getLevel() {
		return level;
	}


	public void setLevel(Level level) {
		this.level = level;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	

}
