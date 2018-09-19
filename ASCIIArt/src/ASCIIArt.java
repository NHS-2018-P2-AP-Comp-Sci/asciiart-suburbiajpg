
public class ASCIIArt {
	public static void main(String[] args) {
		makeBoxTop();
		makeFirstSides();
		makeBoxSides();
		makeWordSides();
		makeBoxSides();
		makeBoxBottom();
		makeHandleSides();
		makeHandleSides();
		makeHandleSides();
		makeHandleSides();
		makeHandleBottom();
	}
	
	public static void makeBoxTop() {
		System.out.println("______________________________");
	}

	public static void makeFirstSides() {
		System.out.println("|   _________                 |");
		System.out.println("|   |  .--  |                 |");
		System.out.println("|   |  :..  |       DAYS      |");
		System.out.println("|   |  \\__) |                 |");
		System.out.println("|   |_______|                 |");
	}
	
	public static void makeBoxSides() {
		System.out.println("|                             |");
	}
	
	public static void makeWordSides() {
		System.out.println("|      S I N C E   O U R      |");
		System.out.println("|           L A S T           |");
		System.out.println("|       N O N S E N S E       |");
	}
	
	public static void makeBoxBottom() {
		System.out.println("|_____________________________|");
	}
	
	public static void makeHandleSides() {
		System.out.println("             \"  \" ");
	}
	
	public static void makeHandleBottom() {
		System.out.println("             \"__\" ");
	}	
}
