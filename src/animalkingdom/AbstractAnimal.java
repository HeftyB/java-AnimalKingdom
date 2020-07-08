package animalkingdom;

abstract class AbstractAnimal
{
	protected static int maxId = 0;
	protected int id;
	protected String name;
	protected int yearDiscovered;
	protected int stomach;


	public AbstractAnimal()
	{
//		maxId++;
//		id = maxId;
		stomach = 0;
	}

	void eat()
	{
		stomach++;
	}

	void eat(int food)
	{
		stomach = stomach + food;
	}

	abstract String getMove();
	abstract String getBreath();
	abstract String getReproduce();

	@Override
	public String toString()
	{
		return name + " " + getReproduce() + " " + getMove() + " " + getBreath() +  " " + yearDiscovered; 
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public int getYearDiscovered()
	{
		return yearDiscovered;
	}
}
