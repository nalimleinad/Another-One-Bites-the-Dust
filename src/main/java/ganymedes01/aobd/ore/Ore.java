package ganymedes01.aobd.ore;

import java.util.ArrayList;

public class Ore {

	public static final ArrayList<Ore> ores = new ArrayList<Ore>();

	private final String name;
	private String extra;
	private double energy;

	private boolean ic2 = true, railcraft = true, enderio = true, mekanism = false;

	public static Ore newOre(String name) {
		if (name.equals("Cobalt"))
			return new Ore(name, "Iron", 3);
		else if (name.equals("Ardite"))
			return new Ore(name, "Gold", 3);
		else if (name.equals("Aluminium"))
			return new Ore(name, "Iron");
		else if (name.equals("Copper"))
			return new Ore(name, "Tin");
		else if (name.equals("Tin"))
			return new Ore(name, "Iron");
		else if (name.equals("Lead"))
			return new Ore(name, "Copper");
		else if (name.equals("Iron"))
			return new Ore(name, "Gold");
		else if (name.equals("Gold"))
			return new Ore(name, "Silver");
		else
			return new Ore(name);
	}

	private Ore(String name) {
		this(name, name, 1);
	}

	private Ore(String name, double energy) {
		this(name, name, energy);
	}

	private Ore(String name, String extra) {
		this(name, extra, 1);
	}

	private Ore(String name, String extra, double energy) {
		this.name = name;
		this.extra = extra;
		this.energy = energy;
		ores.add(this);
	}

	public String name() {
		return name;
	}

	public String extra() {
		return extra;
	}

	public double energy(double e) {
		return e * energy;
	}

	public void setEnergy(double e) {
		energy = e;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public boolean shouldIC2() {
		return ic2;
	}

	public boolean shouldRC() {
		return railcraft;
	}

	public boolean shouldEnderIO() {
		return enderio;
	}

	public boolean shouldMeka() {
		return mekanism;
	}

	public void setIC2(boolean flag) {
		ic2 = flag;
	}

	public void setRC(boolean flag) {
		railcraft = flag;
	}

	public void setEnderIO(boolean flag) {
		enderio = flag;
	}

	public void setMeka(boolean flag) {
		mekanism = flag;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Ore && name.equals(((Ore) obj).name);
	}
}