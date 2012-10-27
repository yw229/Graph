package Questions4;

public class Graph {

	private Node VertextList[] ;
	public int NodeIndex ;
	public int TotalNode ; 
	
	public Graph(int TotalNode)
	{
		this.TotalNode = TotalNode ;
		VertextList = new Node[TotalNode] ;
		NodeIndex = 0 ;
		
	}
	public Graph()
	{
		;
	}
	
	public void addGraphNode(Node v)
	{
		if (NodeIndex < TotalNode)
		{
			this.VertextList[NodeIndex] = v ;
			NodeIndex ++ ;
		}
		else
		{
			System.out.println("Graph is full") ;
		}
	}
	public Node[] getNodeList()
	{
		return VertextList ;
	}
	
	

}
