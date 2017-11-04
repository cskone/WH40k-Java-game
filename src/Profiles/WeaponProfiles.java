package Profiles;
import java.util.*;
public class WeaponProfiles {
	private int range;
	private int strength;
	private int ap;
	private int rpm;
	private String type;

	public WeaponProfiles(int range, int strength, int ap, int rpm, String type)	{
		this.range = range;
		this.strength = strength;
		this.ap = ap;
		this.rpm = rpm;
		this.type = type;
	}

	public void specialRules()	{
		if(this.type.equals("Rapid Fire"))	{
			Scanner wtCon = new Scanner(System.in);
			System.out.println("Use Rapid Fire rule?");
			int confirm = wtCon.nextInt();

			if(confirm == 1)	{
				this.range /= 2;
				this.rpm = 2;
				
				System.out.println("bang bang");
			}else	{
				System.out.println("bang");
			}
		}
	}
	
	public static void main(String[] args)	{
		WeaponProfiles bolter = new WeaponProfiles(24, 4, 0, 1, "Rapid Fire");
		bolter.specialRules();
	}
}