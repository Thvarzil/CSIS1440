package nuisance;

import java.util.Arrays;
import java.util.List;

public class NuisanceApp {

	public static void main(String[] args) {
		//Test Person Class
		Friend[] friends = new Friend[] {new Friend("Juan",27,Hobby.MUSIC),new Friend("Kate",27,Hobby.SPORTS),
				new Friend("Alex",21,Hobby.MUSIC)};
		
		System.out.println("Friends:");
		for(Friend friend : friends) {
			System.out.println(friend);
		}
		System.out.println();
		System.out.println("friend1 equals friend2: "+friends[0].equals(friends[1]));
		System.out.println("friend1 equals friend3: "+friends[0].equals(friends[2]));
		
		Friend twin = new Friend("Kate",27,Hobby.SPORTS);
		
		System.out.println("friend2 equals new friend: "+friends[1].equals(twin));
		
		Telemarketer fritz = new Telemarketer("Fritz",25);
		
		System.out.println();
		System.out.println(fritz);
		//Test Insect Class
		Mosquito mosq = new Mosquito("Aedes vexans");
		PeskyMosquito pesMosq = new PeskyMosquito("Anopheles walkeri");
		Butterfly bFly1 = new Butterfly("Swallowtail",Arrays.asList("yellow","black","blue"));
		Butterfly bFly2 = new Butterfly(bFly1);
		
		Insect[] insects = new Insect[] {mosq, pesMosq, bFly1, bFly2};
		System.out.println();
		System.out.println("Insects: ");
		for(Insect insect : insects) {
			System.out.println(insect);
		
		}
		//Test Nuisance Interface
		Nuisance[] nuisances = new Nuisance[] {fritz, mosq, pesMosq};
		System.out.println();
		System.out.println("Nuisances: ");
		for(Nuisance nuisance : nuisances) {
			if(nuisance instanceof Mosquito) System.out.println(((Mosquito)nuisance).buzz());
			if(nuisance instanceof PeskyMosquito) System.out.println(((PeskyMosquito)nuisance).bite());
			System.out.println(nuisance.annoy());
			System.out.println();
		}
				
	}
	
}
