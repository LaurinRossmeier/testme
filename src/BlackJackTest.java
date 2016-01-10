

public class BlackJackTest {
	private final int numberCardOfOneColor = 13;
	private final int numberColor = 4;
	private Card [] batch ;
	
	
BlackJackTest(){
	batch = new Card[(numberCardOfOneColor*numberColor*6)];
	fillCardBatch();
	
}
	
	
	private void fillCardBatch() {
		
		for (int i=0;i<batch.length;i++) {
			int colour=0;
			
			switch(i/numberCardOfOneColor){
			case 0 : colour=0; break;
			case 1 : colour=1; break;
			case 2 : colour=2; break;
			case 3 : colour=3; break;
			case 4 : colour=0; break;
			case 5 : colour=1; break;
			case 6 : colour=2; break;
			case 7 : colour=3; break;
			case 8 : colour=0; break;
			case 9 : colour=1; break;
			case 10 : colour=2; break;
			case 11 : colour=3; break;
			case 12 : colour=0; break;
			case 13 : colour=1; break;
			case 14 : colour=2; break;
			case 15 : colour=3; break;
			case 16 : colour=0; break;
			case 17 : colour=1; break;
			case 18 : colour=2; break;
			case 19 : colour=3; break;
			case 20 : colour=0; break;
			case 21 : colour=1; break;
			case 22 : colour=2; break;
			case 23 : colour=3; break;

			}
			batch[i] = new Card(i%numberCardOfOneColor, colour);
			batch[i].print();
		}
		
	}
	private Card pickOneRandom() {
		int takencards=0;
		Card temp;
		for (int i=0;i<1;i++) {
			int randomNumber = (int)(Math.random()*(batch.length-i));
			hand[i] = batch[randomNumber];
			Card lastItemInBatch = batch[(batch.length-i-1)];
			batch[(batch.length-i-1)] = batch[randomNumber];
			batch[randomNumber] = lastItemInBatch;
		}
			return temp;
		}
	}
}
