package Questions4;

public class Node {
	public Node[] adjacentNodeList ; // for each node , store it's adjacent node in the list
	private String V ; // Node name Vertext ;
	public States.Status state;
	public int adjacentIndex;
	public int adjacentNodeTotal ;
	
	public Node (String V , int adjacentNodeTotal)
	{
		this.V = V ;
		this.adjacentNodeTotal = adjacentNodeTotal ;
		adjacentNodeList = new Node[adjacentNodeTotal] ; // create new node array 
		this.adjacentIndex = 0 ; // initialize 
	}
	public void addAdjacentNode(Node v)
	{
		if (this.adjacentIndex < this.adjacentNodeTotal)
		{
			this.adjacentNodeList[adjacentIndex] = v ;
			adjacentIndex ++ ;
		}
		else
			System.out.print("No more adjacent can be added");
	}
	public Node[] getAdjacentList()
	{
		return adjacentNodeList ;
	}
	public String getVertex()
	{
		return V ;
	}
	
}
