def dijkstra(graph, start, end):
    distances = {node: float("inf") for node in graph}
    distances[start] = 0
    return _dijkstra(graph, start, end, distances)

def _dijkstra(graph, current, end, distances):
    if current == end:
        return distances
    for neighbor, weight in graph[current].items():
        if distances[neighbor] > distances[current] + weight:
            distances[neighbor] = distances[current] + weight
            _dijkstra(graph, neighbor, end, distances)
    return distances

""" 
This recursively explores the graph, keeping track of the shortest distance to each node. 
It works as follows:

1. It initializes all distances to infinity except the start node, which has a distance of 0.
2. It calls the recursive _dijkstra() function, passing in the start node.
3. _dijkstra() checks if the current node is the end node. If so, it returns the distances.
4. Otherwise, it iterates through the neighbors of the current node.
4. For each neighbor, it checks if the distance via the current node is shorter. If so, it updates the distance.
5. It then recursively calls itself with that neighbor as the current node.
6. This recursion bottoms out when it reaches the end node, and then unwinds back up the call stack.

On unwinding, it returns the shortest distances to all nodes, which is then returned by the top-level dijkstra() call.

The advantages of this recursive approach are:

1. Simple and intuitive implementation
2. Handles graphs with cycles
3. Handles graphs with negative edge weights
4. The main disadvantage is the potential for a deep call stack if the graph is very large. But for moderate-sized graphs, this recursive Dijkstra's algorithm works well.

Hope this helps! 
"""