package edu.calstatela.mhsu.quiz;
import java.util.Random;

/*
 *
private data fields: name, health points, and attack points. The points can be either int or double
Getters and Setters for those data fields
Create a default constructor with no parameters and give the data fields default values
Create a constructor that takes in the data fields as parameters
Create a void method called "takeDamage()", which will decrease the monster's health point by with a 50/50 chance
 * */
public class Monster {
	private String name;
	private int healthPoints;
	private int attackPoints;

	public Monster(){
		this.name = "Michael";
		this.healthPoints = 100;
		this.attackPoints = 9000;
	}
	public Monster(String name, int healthPoints, int attackPoints){
		this.name = name;
		this.healthPoints = healthPoints;
		this.attackPoints = attackPoints;
	}
	public void takeDamage(){
		Random random = new Random();
		int randomInt = random.nextInt(10);
		//if randomInt is between 0 and 4, I take damage, else I don't
		if(randomInt <=4){
			this.healthPoints--;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealthPoints() {
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	public int getAttackPoints() {
		return attackPoints;
	}
	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}
}
