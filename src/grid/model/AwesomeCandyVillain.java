package grid.model;

public class AwesomeCandyVillain
{
	// Declaration Section
	private int legs;
	private int arms;
	private int eyes;
	private boolean hasButton;
	private String name;

	public void setName(String name)
	{
		this.name = name;
	}

	public void setLegs(int legs)
	{
		this.legs = legs;
	}

	public void setHasButton(boolean hasButton)
	{
		this.hasButton = true;
	}

	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}

	public void setArms(int arms)
	{
		this.arms = arms;
	}

	public String getName()
	{
		return name;
	}

	public int getLegs()
	{
		return legs;
	}

	public boolean getHasButton()
	{
		return hasButton;
	}

	public int getEyes()
	{
		return eyes;
	}

	public int getArms()
	{
		return arms;
	}
	
	/**
	 * Default constructor for the AwesomeCandy Villain - Do not use.
	 */
	public AwesomeCandyVillain()
	{
		name = "MiniMe";
		arms = 2;
		legs = 8;
		hasButton = false;
		eyes = 3;
	}
	/**
	 * Creates an AwesomeCandyVillain with the specified parameters.
	 * @param arms number of arms that the villain has.
	 * @param eyes number of eyes of the villain has.
	 * @param legs the number of legs that the villain has.
	 * @param name The name of the villain.
	 * @param hasButton whether the villain has the button.
	 */
	public AwesomeCandyVillain(int arms, int eyes, int legs, String name, boolean hasButton)
	{
		this.arms = arms;
		this.legs = legs;
		this.eyes = eyes;
		this.name = name;
		this.hasButton = hasButton;
		
	}
}
