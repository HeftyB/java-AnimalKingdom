package animalkingdom;

public class Fish extends AbstractAnimal
{
	public Fish (String name, int yearDiscovered)
	{
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	@Override
	public String getMove()
	{
		return "swim";
	}

	@Override
	public String getBreath()
	{
		return "gills";
	}

	@Override
	public String getReproduce()
	{
		return "eggs";
	}
}
