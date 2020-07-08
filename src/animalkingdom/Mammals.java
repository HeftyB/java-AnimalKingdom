package animalkingdom;

public class Mammals extends AbstractAnimal
{
	public Mammals (String name, int yearDiscovered)
	{
		this.name = name;
		this.yearDiscovered = yearDiscovered;
		maxId++;
		id = maxId;
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
