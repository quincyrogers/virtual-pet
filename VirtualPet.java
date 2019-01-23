package VirtualPet;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int waste;
	private int boredom;
	private int sickness;

	public VirtualPet(int hunger, int thirst, int waste, int boredom, int sickness) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.boredom = boredom;
		this.sickness = sickness;
	}

	public void tick() {
		hunger++;
		thirst++;
		waste--;
		boredom--;
		sickness--;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWaste() {
		return waste;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getSickness() {
		return sickness;
	}

	public void feedKibble() {
		this.hunger -= 2;
		this.thirst -= 1;
		this.waste += 2;
		this.boredom += 1;
		this.sickness -= 2;
	}

	public void giveTableScraps() {
		this.hunger -= 2;
		this.thirst -= 1;
		this.waste += 4;
		this.boredom -= 4;
		this.sickness += (int) (Math.random() * 3 + 1);
	}

	public void giveBdaySteak() {
		this.hunger -= 5;
		this.thirst -= 2;
		this.waste += 4;
		this.boredom -= 5;
		this.sickness -= 6;
	}

	public void fillWaterDish() {
		this.thirst -= 3;
		this.waste += 3;
	}

	public void pooPeeDoo() {
		this.waste -= 3;
		this.sickness -= 2;
	}

	public void napTime() {
		this.boredom += 3;
		this.sickness -= 3;
	}

	public void zoomiesRun() {
		this.hunger -= (Math.random() * 3 + 1);
		this.boredom -= 5;
		this.sickness -= 5;

	}

}
