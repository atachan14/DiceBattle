package main;

public abstract class Command {
	String name;
	Character owner;
	int priority=2;
	
	public Command(Character owner) {
		this.owner = owner;
	}
	
	
	
	
	

}
