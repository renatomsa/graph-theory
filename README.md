# Graph Theory Implementations

This project implements basic graph structures and algorithms, including depth-first search (DFS) and breadth-first search (BFS) for creating spanning trees. Below is an explanation of the key concepts and implementations.

## Graph Representation

### Vertex Class
The `Vertex` class represents a node in the graph. Each vertex has:
- A label (string identifier)
- A degree (number of edges connected to it)

### Graph Class
The `Graph` class represents the entire graph structure. It uses:
- An adjacency list to store connections between vertices
- A map to quickly look up vertices by their labels

## Graph Algorithms

### Depth-First Search (DFS)
DFS is implemented in the `SpanningTreeDFS` class. It explores as far as possible along each branch before backtracking.

Key characteristics:
- Uses recursion (implicitly using the call stack)
- Tends to create "deeper" spanning trees
- Time complexity: O(V + E) where V is the number of vertices and E is the number of edges

### Breadth-First Search (BFS)
BFS is implemented in the `SpanningTreeBFS` class. It explores all neighbors at the present depth before moving to vertices at the next depth level.

Key characteristics:
- Uses a queue to keep track of vertices to visit
- Tends to create "shallower" spanning trees
- Time complexity: O(V + E)

## Spanning Trees

A spanning tree is a subgraph of a connected, undirected graph that includes all vertices of the graph with the minimum possible number of edges. Both DFS and BFS can be used to create spanning trees.

Characteristics of spanning trees:
- Contains all vertices of the original graph
- Has exactly V-1 edges (where V is the number of vertices)
- Is acyclic (contains no cycles)

## Data Structures Used

### HashSet
Used to keep track of visited vertices in both DFS and BFS implementations.
- Provides O(1) average time complexity for add, remove, and contains operations
- Ensures each vertex is processed only once (given that labels should be different)

### Queue (LinkedList)
Used in the BFS implementation to maintain the order of vertices to be visited.
- Offers FIFO (First-In-First-Out) behavior
- Key operations: offer() to add elements to the back of the queue, poll() to remove and return the head element (first element)

## Time and Space Complexity

For both DFS and BFS:
- Time Complexity: O(V + E)
- Space Complexity: O(V) for the visited set and recursion stack (DFS) or queue (BFS)

Where V is the number of vertices and E is the number of edges in the graph.

## Applications

- Network routing protocols
- Finding shortest paths
- Solving puzzles and mazes
- Web crawling
- Social network analysis

These implementations provide a foundation for more complex graph algorithms and can be extended for various applications in computer science and real-world problems involving network structures.
