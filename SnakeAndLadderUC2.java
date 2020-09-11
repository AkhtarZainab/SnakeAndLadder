class SnakeLadderUC2{
	public static void main(String args[]){
		int min = 1;
		int max = 6;
		int random_int = (int)(Math.random() * (max - min + 1) + min);
		System.out.println( "The player gets " +random_int);
	}
}
