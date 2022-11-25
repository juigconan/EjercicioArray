package Ejercicios;

public class Ajedrez {
	// 8x8
	public static void main(String[] args) {
		
		char[][] tableroConBucle = new char[8][8];
		final char[][] tableroAMano = {
				{' ','X',' ','X',' ','X',' ','X'},
				{'X',' ','X',' ','X',' ','X',' '},
				{' ','X',' ','X',' ','X',' ','X'},
				{'X',' ','X',' ','X',' ','X',' '},
				{' ','X',' ','X',' ','X',' ','X'},
				{'X',' ','X',' ','X',' ','X',' '},
				{' ','X',' ','X',' ','X',' ','X'},
				{'X',' ','X',' ','X',' ','X',' '}
		};
		
		for (int i = 0; i < tableroConBucle.length; i++) {
			for (int j = 0; j < tableroConBucle[i].length; j++) {
				if((i+1) % 2 != 0) {
					if((j+1) % 2 != 0) {
						tableroConBucle[i][j] = ' ';
					}else {
						tableroConBucle[i][j] = 'X';
					}
				}else {
					if((j+1) % 2 != 0) {
						tableroConBucle[i][j] = 'X';
					}else {
						tableroConBucle[i][j] = ' ';
					}
				}
			}
		}
		
		for (int i = 0; i < tableroConBucle.length; i++) {
			for (int j = 0; j < tableroConBucle[i].length; j++) {
				System.out.print(tableroConBucle[i][j]);				
			}
			System.out.println();
		}
	}

}
