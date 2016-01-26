public class Player {
	
	public String name = "";
	ArrayList<Tiles> tiles = new ArrayList<Tiles>();
	
	
	public Player(String name) {
		
		this.name = name;
	}
	public void addTile(Tiles input ){
		tiles.add(input);
	}