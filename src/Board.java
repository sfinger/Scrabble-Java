
public class Board {
	private char[][] objBoard = new char[15][15];
	public boolean setLetter(int space,char input){
		int x = space/15;
		int y = space%15;
		if (objBoard[x][y]<9){
			objBoard[x][y]=input;
			return true;
		}
		return false;
	}
	public String toString(){
		String output = "";
		for (int i=0;i<225;i++){
			if(objBoard[i/15][i%15]==0){
				output=output+" | " + String.format("%03d", i);
			}
			else{
				output =output +" |  " + objBoard[i/16][i%15]+" ";
			}
			if (i%15==14 && i/15<14){
				output = output + " |\n"
						+ " +-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+\n";
			}
		}
		output = output + " |";
		return output;
	}
}
