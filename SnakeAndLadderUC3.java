public class SnakeLadderUC3{
   public static void main(String[] args){
      int playerPos = 0;
		int dieValue = (int)(Math.random() * (6 - 1 + 1) + 1);
		int optionValue = (int)(Math.random() * (3 - 1 + 1) + 1);
		System.out.println("Starting Player Postion: " +playerPos);
		System.out.println("Die Value from roll: " +dieValue);
		switch(optionValue){
		case 1:
				System.out.println("No Play");
				break;
		case 2:
				System.out.println("Ladder, so moving ahead by die value " +dieValue);
				playerPos = playerPos + dieValue;
				break;
		case 3:
				System.out.println("Snake, moving backward by die value " +dieValue);
				if (playerPos < dieValue) {
					playerPos = 0;
				} else {
					playerPos = playerPos - dieValue;
				}
		}
      System.out.println("Current Player position: " +playerPos);
   }
}
