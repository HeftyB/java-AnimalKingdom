package animalkingdom;

public class Birds extends AbstractAnimal
{
	public Birds (String name, int yearDiscovered)
	{
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	@Override
	public String getMove()
	{
		return "fly";
	}

	@Override
	public String getBreath()
	{
		return "lungs";
	}

	@Override
	public String getReproduce()
	{
		return "eggs";
	}
}
