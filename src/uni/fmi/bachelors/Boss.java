package uni.fmi.bachelors;

import java.util.ArrayList;
import java.util.Random;

public class Boss extends Thread {
	// boss variables
	private String name = "EATER OF WORLDS";
	private int hp;
	private int dmg;
	private double attackSpeed;
	private int massDamageChance;
	private ArrayList<Monster> targets = new ArrayList<Monster>();
	private Monster currentTarget;
	// random number generator
	private Random random = new Random();
	
	public Boss(int hp, int dmg, double attackSpeed, int massDamageChance) {
		this.hp = hp;
		this.dmg = dmg;
		this.attackSpeed = attackSpeed;
		this.massDamageChance = massDamageChance;
	}
	
	@Override
	public void run() {
		// selects random target from targets array list
		// for the boss to attack
		currentTarget = targets.get(random.nextInt(targets.size()));
		// if boss is alive and target is alive execute code
		while (this.getHp() > 0 && this.currentTarget.getHp() > 0) {
			// check if next hit is going to be cleave hit
			if (random.nextInt(101) < this.massDamageChance) {
				// execute hit and print info
				System.out.println("BRACE YOURSELVES FOR A CLEAVE HIT!");
				for (Monster m : targets) {
					m.setHp(m.getHp() - this.dmg);
					System.out.println(this.name + " inflicted a hit on "
									+  m.getMonsterName() + " and left "
									+  m.getMonsterName() + " with "
									+  m.getHp() + " HP.");
				}
			} else {
				// execute hit and print info
				this.currentTarget.setHp(currentTarget.getHp() - this.dmg);
				System.out.println(this.name + " inflicted a hit on "
						+  currentTarget.getMonsterName() + " and left "
						+  currentTarget.getMonsterName() + " with "
						+  currentTarget.getHp() + " HP.");
			}
			// check if current target is alive or dead
			if (currentTarget.getHp() <= 0) {
				// removes current target from targets array list
				targets.remove(currentTarget);
				// checks if targets array list is empty or not
				if (!targets.isEmpty()) {
					// if not empty selects other target
					currentTarget = targets.get(random.nextInt(targets.size()));
				} else {
					// if all targets are dead prints win message
					System.out.println(this.name + ": PERISH!");
					break;
				}
			}
			// regulate attacks based on attack speed
			try {
				sleep((long) (1000 / this.attackSpeed));
			} catch	(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<Monster> getTargets(){
		return this.targets;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getMonsterName() {
		return this.name;
	}
}
