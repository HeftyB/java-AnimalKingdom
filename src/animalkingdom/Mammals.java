package animalkingdom;

public class Mammals extends AbstractAnimal
{
	public Mammals (String name, int yearDiscovered)
	{
		this.name = name;
		this.yearDiscovered = yearDiscovered;
		//maxId++; // Scope test, it is available
		//id = maxId;
	}
	
	@Override
	public String getMove()
	{
		return "walk";
	}

	@Override
	public String getBreath()
	{
		return "lungs";
	}

	@Override
	public String getReproduce()
	{
		return "live birth";
	}
}
