package TestScript;

import java.util.*;
public class PsychicPicker {

    public int die1;   // Number showing on the first die.
	
	public static void main(String[] args)	{
		//							0			1			2			  3				4			  5	
		String[] myBiomancy = {"Iron Arm", "Enfeeble", "Life Leech", "Warp Speed", "Endurance", "Haemorrhage"};
		String[] myDivination = {"Foreboding", "Forewarning", "Perfect Timing", "Precognition", "Misfortune", "Scrier's Gaze"};
		String[] myDaemonology = {"Cursed Earth", "Dark Flame", "Infernal Gaze", "Sacrifice", "Incursion", "Possesion"};
		String[] myPyromancy = {"Fiery Storm", " Fire Shield", "Spontaneous Combustion", "Sunburst", "Inferno", "Moltem Beam"};
		
		//Create new hashtable
		Map <String, String[]> disciplines = new HashMap <String, String[]>();
			disciplines.put("bio",	new String[] {"Iron Arm", "Enfeeble", "Life Leech", "Warp Speed", "Endurance", "Haemorrhage"});
			disciplines.put("div", 	myDivination);
			disciplines.put("dmn", myDaemonology);
			disciplines.put("pyr", myPyromancy);

		Scanner console = new Scanner(System.in);
		
		//Prints the key for Discipline codes
		System.out.println("Input key:\nBiomancy: bio\t\tDivination: div\nDaemonology: dmn\tPyromancy: pyr");
		System.out.println("Telekinesis: tks\tTelapathy: tpy\nTzeentch: tzch\t\tChange: cge");
		System.out.println("Sinistrum: sin\t\tHeretech: her\nEctomancy: ect\t\tGeomortis: geo\n");
		
		System.out.print("Input Discipline choice/s: ");
		String choice = console.nextLine();
		String[] discipline = choice.split("\\s+");	//Splits the tokens to read multiple inputs on a line
		
		for(String power : disciplines.get(choice))	{
			System.out.println("foo");
			System.out.println(power);
			
			Random result = new Random();	//Creates a new "Random" object
			int r = result.nextInt(6);	//Sets the # of values (Starting at 0) that can be picked
			
			System.out.println(discipline[r]);
			System.out.println(r);
			
		}
		
		console.close();
	}
	/*	HURDLES TO SOLVE:
	 * 1) Get the hash table to read the inputs
	 * 	-Will add Sanctic powers if this turns out well
	 * 	-Possibly use something similar to "charAt" to retrieve power.  
	 */
}
