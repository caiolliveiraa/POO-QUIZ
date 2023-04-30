package Game;

import java.util.ArrayList;

import Game.User;

public class Ranking {
	
	
	private int place;
	private double points;
	private ArrayList<User> UserRank = new ArrayList<>();
	
	public Ranking(int place, double points, ArrayList<User> userRank) {
		super();
		this.place = place;
		this.points = points;
		UserRank = userRank;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public ArrayList<User> getUserRank() {
		return UserRank;
	}

	public void setUserRank(ArrayList<User> userRank) {
		UserRank = userRank;
	}
	
	

	
	
	
	
}
