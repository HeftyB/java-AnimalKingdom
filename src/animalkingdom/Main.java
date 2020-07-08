package animalkingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
	public static List<AbstractAnimal> filteredList = new ArrayList<>();

	public static void filterAnimal(List<AbstractAnimal> animals, CheckAnimal animaltest)
	{
		for (AbstractAnimal animal : animals)
		{
			filteredList.clear();
			if (animaltest.test(animal))
			{
				System.out.println(animal);
				filteredList.add(animal);
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("it is working");

		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals raccoon = new Mammals("Raccoon", 1758);
		Mammals bigfoot = new Mammals("Bigfoor", 2021);


		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		List<AbstractAnimal> animalList = new ArrayList<>();
		animalList.add(panda);
		animalList.add(zebra);
		animalList.add(koala);
		animalList.add(sloth);
		animalList.add(armadillo);
		animalList.add(raccoon);
		animalList.add(bigfoot);
		animalList.add(pigeon);
		animalList.add(peacock);
		animalList.add(toucan);
		animalList.add(parrot);
		animalList.add(swan);
		animalList.add(salmon);
		animalList.add(catfish);
		animalList.add(perch);


		System.out.println("\n*** List all the animals in descending order by year named ***");
		animalList.sort((param1, param2) -> param2.getYearDiscovered() - param1.getYearDiscovered());
		for (AbstractAnimal animal : animalList)
		{
			System.out.println(animal.getName() + "'s Id: " + animal.getId() + " named in: " + animal.getYearDiscovered());
		}

		System.out.println("\n*** List all the animals alphabetically ***");
		animalList.sort((param1, param2) -> param1.getName().compareToIgnoreCase(param2.getName()));
		for (AbstractAnimal animal : animalList)
		{
			System.out.println(animal.getName() + "'s Id: " + animal.getId() + " named in: " + animal.getYearDiscovered());
		}


		System.out.println("\n*** List all the animals order by how they move ***");
		animalList.sort((param1, param2) -> param1.getMove().compareToIgnoreCase(param2.getMove()));
		for (AbstractAnimal animal : animalList)
		{
			System.out.println(animal.getName() + "'s Id: " + animal.getId() + " named in: " + animal.getYearDiscovered());
		}

		System.out.println("\n*** List only those animals the breath with lungs ***");
		filterAnimal(animalList, animal -> (animal.getBreath() == "lungs"));

		System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
		filterAnimal(animalList, animal -> (animal.getBreath() == "lungs") && (animal.getYearDiscovered() == 1758));

		System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
		filterAnimal(animalList, animal -> (animal.getReproduce() == "eggs") && (animal.getBreath() == "lungs"));

		System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
		animalList.sort((param1, param2) -> param1.getName().compareToIgnoreCase(param2.getName()));
		filterAnimal(animalList, animal -> (animal.getYearDiscovered() == 1758));
	}
}
