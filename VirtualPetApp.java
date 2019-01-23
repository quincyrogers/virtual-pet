package VirtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your pet's name");
		
		String namePuppy = input.nextLine();
		
		System.out.println("Say Hello to your little friend " + namePuppy + "!");
		
		
		VirtualPet yourPal = new VirtualPet(5, 5, 5, 5, 5);

		String decision = "";
		while (!decision.equalsIgnoreCase("Yes")) {

			System.out.println("Your pal " + namePuppy + " needs you!");
			System.out.println("Hunger: " + yourPal.getHunger());
			System.out.println("Thirst: " + yourPal.getThirst());
			System.out.println("Waste: " + yourPal.getWaste());
			System.out.println("Boredom: " + yourPal.getBoredom());
			System.out.println("Sickness: " + yourPal.getSickness());

			String buttonPushed = "";

			System.out.println("How will you help your furry friend?");
			System.out.println("1. Feed " + namePuppy + " kibble" );
			System.out.println("2. Sneak your pal " + namePuppy +  " some table scraps");
			System.out.println("3. Who wants a birthday Steak");
			System.out.println("4. Fill the " + namePuppy + "'s water dish");
			System.out.println("5. Time to let " + namePuppy + " leave a gift for the meter maid");
			System.out.println("6. Go lay down it NAP TIME");
			System.out.println("7. Let " + namePuppy + " run those Zoomies Out");
			System.out.println("8. Give " + namePuppy + " Chocolate");
			buttonPushed = input.nextLine();

			int hunger = 1;
			int thirst = 1;
			int waste = 1;
			int boredom = 1;
			int sickness = 1;

			if (buttonPushed.equals("1")) {
				yourPal.feedKibble();
				System.out.println("You fed " + namePuppy + " dry kibble.");
				System.out.println("Serving " + namePuppy + " the dry food added to thirst while adding " + waste
						+ " additional pitstop worth of waste and is making " + namePuppy + " a little sick and tired by " + sickness + "serving.");

			} else if (buttonPushed.equals("2")) {
				yourPal.giveTableScraps();
				System.out.println("Sneak " + namePuppy + " just " + hunger + " scoop of table scraps, AKA people food.");
				System.out.println("Sneaking " + namePuppy + " a slice of pizza or chicken fingers reduces thirst while adding to waste and making " + namePuppy + " possibly giving him a little gout ");
				
			} else if (buttonPushed.equals("3")) {
				yourPal.giveTableScraps();
				System.out.println("Happy Birthday " + namePuppy + " this T-Bone is for you pal!!!");
				System.out.println("Giving " + namePuppy + " a Medium T-Bone Steak reduces thirst while adding an additional fire hydrant worth of waste but it makes " + namePuppy + " so happy it kicks sick and tired aside and gives a little fur ball the strength of 10 Mastiffs ");
				
			} else if (buttonPushed.equals("4")) {
				yourPal.getThirst();
				System.out.println("You gave " + namePuppy + thirst + " water and now " + namePuppy + " feels less parched.");
				System.out.println("but it looks like him may need to get outside soon to get rid of the ... well... you know.");

			} else if (buttonPushed.equals("5")) {
				yourPal.pooPeeDoo();
				System.out.println("The meter maid is lurking near your block and you just had that boot on your Delorean removed by the guy that advertises for his Dental Practice on Craigslist .");
				System.out.println("So you let " + namePuppy + " do his business on the sidewalk by the two nearest cars. I hope she has a spare toothbrush and some oxyclean for those retro Patrick Ewing's she's rocking. Either way you pal just reduced his baggage by " + waste + "for waste.");
				System.out.println(namePuppy + "'s tail is wagging now that he is a little less nauseaous");


			} else if (buttonPushed.equals("6")) {
				yourPal.napTime();
				System.out.println("Hold is very sleepy and curls up in his bed...");
				System.out.println("Hold is now sleeping and it took -" + sickness);

			} else if (buttonPushed.equals("7")) {
				System.out.println("On your Mark! Get Ssssseeeeettt! GO!");
				System.out.print(namePuppy + " is out of the gate fast! Juking left! Juking right!");
				System.out.print(" Around in circles! And SPLASH! The Pup ends the zoom with a nose dive into a large mud puddle! ");
				System.out.println("Okay I think the Pup is now rolling in it...");

			} else {
				buttonPushed.equals("8");
				System.out.println("Are you sure you wish to give " + namePuppy + " chocolate and quit program?");
				System.out.println("Enter Yes or No");
				decision = input.nextLine();

				if (decision.equalsIgnoreCase("Yes")) {
					System.out.println("Geez some kind of friend you are buddy. " + namePuppy + " deserved better than that! And the chocolate thing isn't a myth ya know!");
					System.out.println("He's probably still licking her roof of his mouth in the big doggy park in the sky ...");

				} else {
					decision.equalsIgnoreCase("No");
					System.out.println("Thank you for being a friend... Traveled down a road and back again... Your heart is true, you're a pal and a confidant ");
					System.out.println("Live to bark another day...");
				}
			}
			yourPal.tick();
		} 

		input.close();
	}

}