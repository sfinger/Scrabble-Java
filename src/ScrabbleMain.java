
public class ScrabbleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board objBoard = new Board();
		for (int i=0;i<225;i++){
			System.out.print(i+"  ");
			System.out.print(i/15+" ");
			System.out.println(i%15+"  ");
		
		}
		objBoard.setLetter(0,'k');
		objBoard.setLetter(113, 'Z');
		System.out.println(objBoard);
		
	}
}
