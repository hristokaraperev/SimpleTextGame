package uni.fmi.bachelors;

import java.util.Random;

public class Monster extends Thread {
	// monster variables
	private String name;
	private int hp;
	private int dmg;
	private double attackSpeed;
	private int criticalChance;
	private Boss target;
	// random number generator
	private Random random = new Random();
	
	public Monster(String name, int hp, int dmg, double attackSpeed, int criticalChance) {
		this.name = name;
		this.hp = hp;
		this.dmg = dmg;
		this.attackSpeed = attackSpeed;
		this.criticalChance = criticalChance;
	}

	@Override
	public void run() {
		// if monster is alive and target is alive execute code
		while (this.getHp() > 0 && this.target.getHp() > 0) {
			// check if next hit is going to be critical hit
			if (random.nextInt(101) < this.criticalChance) {
				// execute hit and print info
				this.target.setHp(this.target.getHp() - (this.dmg * 2));
				System.out.println(this.getMonsterName() + " inflicted a CRITICAL hit on "
								+  this.target.getMonsterName()
								+  " and left " + this.target.getMonsterName()
								+  " with " + this.target.getHp() + " HP.");
			} else {
				// execute hit and print info
				this.target.setHp(this.target.getHp() - this.dmg);
				System.out.println(this.getMonsterName() + " inflicted a hit on "
								+  this.target.getMonsterName()
								+  " and left " + this.target.getMonsterName()
								+  " with " + this.target.getHp() + " HP.");
			}
			// regulate attacks based on attack speed
			try {
				sleep((long) (1000 / this.attackSpeed));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// print text depending on whether this monster dies or kills boss
		if (this.getHp() <= 0) {
			System.out.println(this.getMonsterName() + ": I SHALL FIGHT AGAIN!");
		} else {
			System.out.println(this.getMonsterName() + ": BRING A FRIEND NEXT TIME!");
		}
	}



	public String getMonsterName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setTarget(Boss target) {
		this.target = target;
	}
}
