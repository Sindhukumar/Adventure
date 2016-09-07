import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");

		System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
		if (sc.nextLine().equalsIgnoreCase("kitchen")) {
			System.out.println(
					"There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
			if (sc.nextLine().equalsIgnoreCase("refrigerator")) {
				System.out.println(
						"Inside the refrigerator you see food and stuff.  It looks pretty nasty.Would you like to eat some of the food? (\"yes\" or \"no\")");
				if (sc.nextLine().equalsIgnoreCase("no"))
					System.out.println("You die of starvation... eventually.");
			} else {
				System.out.println("You see a cookie Jar,whould you like to eat some cookie (\"yes\"/\"no\")");
				if (sc.nextLine().equalsIgnoreCase("yes"))
					System.out.println("Enjoy delicious cookies");
				else
					System.out.println("Learn to say \"Yes\" to life!. \n Game Over");
			}

		} else {
			System.out.println(
					"Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like to go?");
			if (sc.nextLine().equalsIgnoreCase("bedroom")) {
				System.out.println(
						"You are in a plush bedroom, with expensive-looking hardwood furniture.  The bed is unmade.  In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\")");
				if (sc.nextLine().equalsIgnoreCase("no"))
					System.out.println(
							"Well, then I guess you'll never know what was in there.  Thanks for playing, I'm tired of making nested if statements.");
				else
					System.out.println("Enjoy the view");
			} else {
				System.out.println("You see a nice bathroom. whould you like to take a shower? (\"yes\"/\"no\")");
				if (sc.nextLine().equalsIgnoreCase("yes"))
					System.out.println("Now you feel Refreshed. Enjoy your day!");
				else
					System.out.println("Stay Stinky \n Game Over");
			}
		}

		sc.close();
	}

}
