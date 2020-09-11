public class SnakeLadderUC4{
   public static void main(String[] args){
		int dieMin = 1;							// Min limit of Die Value by rolling
		int dieMax = 6;							// Max limit of Die value by rolling
		int optionMin = 1;						// Min limit of play options signifying No Play
		int optionMax = 3;						// Max limit of play options signifying Snake outcome
      int playerPos = 0; 					// Starting Position initialization
		int dieValue ;
		int optionValue;
		
		System.out.println("Starting Player Postion: " +playerPos);
		
	
		while (playerPos < 100) {
			
			dieValue = (int)(Math.random() * (dieMax - dieMin +1) + 1);
			System.out.println("Die Value from roll: " +dieValue);
			
			optionValue = (int)(Math.random()*(optionMax - optionMin + 1) + 1);		
			switch(optionValue){
			case 1:
				System.out.println("No Play");
				break;
			case 2:				
				playerPos = playerPos + dieValue;
				System.out.println("Ladder, so moving ahead by die value " +dieValue);
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

}
