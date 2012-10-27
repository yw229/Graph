package Questions4;

import java.util.LinkedList;

public class DirectRouteGraph {
	//public Graph g; 
	public Graph g ;

	public DirectRouteGraph(Graph g)
	{
		this.g = g ;
	}
	public Graph createGraph ()
	{
		this.g = new Graph(6); 
		Node[] temp = new Node[6] ;
		temp[0] = new Node("a", 3);
		temp[1] = new Node("b", 0);
		temp[2] = new Node("c", 0);
		temp[3] = new Node("d", 1);
		temp[4] = new Node("e", 1);
		temp[5] = new Node("f", 0);
		

		temp[0].addAdjacentNode(temp[1]);
		temp[0].addAdjacentNode(temp[2]);
		temp[0].addAdjacentNode(temp[4]);
		temp[3].addAdjacentNode(temp[5]);
		temp[4].addAdjacentNode(temp[5]);
		
		for (int i = 0 ; i <6 ; i ++ )
		{
			g.addGraphNode( temp[i]) ;
		}
		return g;
	}
	public  boolean isDirectedRout(Graph g, Node s, Node e)
	{ 
		LinkedList<Node> q = new LinkedList<Node>() ;
		for(Node u : g.getNodeList())
		{
			u.state= States.Status.unVisited ;
		}
		s.state = States.Status.Visiting ; // when starts search adjacent node mark current node as Visiting
		q.add(s) ;
		
		while (!q.isEmpty())
		{
			Node out =q.removeLast() ;
			for(Node t : out.adjacentNodeList)
			{
				//if (t!=null)
				{
					if (t.state == States.Status.unVisited)
						{
							if( t == e)
							//u.status = States.Status.Visiting ;
								return true;
							else
							{
								t.state = States.Status.Visiting ;
								q.add(t) ;
							}
						}
				t.state = States.Status.Visited ;
				}
			}
		}
		return false;
		
       /*
		LinkedList<Node> q = new LinkedList<Node>();
        for (Node u : g.getNodes()) {
            u.state = State.Unvisited;
        }
        s.state = State.Visiting;
        q.add(s);
        Node u;
        while(!q.isEmpty()) {
            u = q.removeFirst();
            if (u != null)
               {
	            for (Node v : u.getAdjacentList()) 
	            {
	                if (v.state == State.Unvisited) 
	                {
	                    if (v == e) {
	                        return true;
	                    } else {
	                        v.state = State.Visiting;
	                        q.add(v);
	                    }
	                }
	            }
	            u.state = State.Visited;
            }
        }
        return false;
    } */
	}
  

	public static void main (String[] a)
	{
		Graph g = new Graph();
		DirectRouteGraph dg = new DirectRouteGraph(g) ;
		Graph newg = dg.createGraph() ;
		
		Node[] n = newg.getNodeList();
		Node start = n[2];
		Node end = n[0];
		System.out.println("Node Start is: " + start.getVertex() + " End:" + end.getVertex() );
		System.out.println( "Is there any direct route ?" + dg.isDirectedRout(newg, start, end)); 
				
		
	}

}
