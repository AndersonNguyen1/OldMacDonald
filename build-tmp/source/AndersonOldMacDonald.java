import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class AndersonOldMacDonald extends PApplet {

//your variable declarations here
public void setup()
{
	Farm farm = new Farm();
	farm.animalSounds();
}

interface Animal
{
	public String getSound();
	public String getType();
}

class Farm
{
  private Animal[] aBunchOfAnimals = new Animal[4];
  public Farm()
  {
   aBunchOfAnimals[0] = new NamedCow("cow","Elsie","moo");
   aBunchOfAnimals[1] = new Chick("chick","cheep","cluck");
   aBunchOfAnimals[2] = new Pig("pig","oink");
  }
  public void animalSounds()
  {
    for (int nI=0; nI < aBunchOfAnimals.length; nI++)
    {
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound() );
    }
    System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName());
  }
}

class Cow implements Animal
{
	protected String myType;
	protected String mySound;

	public Cow()
	{
    	myType = "unknown";
    	mySound = "unknown";
	}

	public Cow(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}

	public String getSound()
	{
		return mySound;
	}

	public String getType()
	{
		return myType;
	}
}

class NamedCow extends Cow
{
	private String myName;

	public NamedCow()
	{
    	super();
    	myName = "unknown";
	}

	public NamedCow(String type, String name, String sound)
	{
		super(type, sound);
		myName = name;
	}

	public String getName()
	{
		return myName;
	}
}

class Pig implements Animal
{
	protected String myType;
	protected String mySound;

	public Pig()
	{
    	myType = "unknown";
    	mySound = "unknown";
	}

	public Pig(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}

	public String getSound()
	{
		return mySound;
	}

	public String getType()
	{
		return myType;
	}
}

class Chick implements Animal
{
	protected String myType;
	protected String mySound;

	public Chick()
	{
    	myType = "unknown";
    	mySound = "unknown";
	}

	public Chick(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}

	public Chick(String type, String sound1, String sound2)
	{
		myType = type;

		int soundType = (int)(Math.random()*2);
		if (soundType == 0)
			mySound = sound1;
		else
			mySound = sound2;
	}

	public String getSound()
	{
		return mySound;
	}

	public String getType()
	{
		return myType;
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "AndersonOldMacDonald" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
