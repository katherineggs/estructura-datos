from sys import maxsize
from collections import deque
class Vertex:
    def __init__(self, name:str):
        self.name = name

class Graph:
    def __init__(self):
        self.vertices = {}
        self.edges = []
        self.edgeIndices = {}

    def addVertex(self,vertex):
        if vertex.name in self.vertices:
            return False
        else:
            self.vertices[vertex.name] = vertex
            for row in self.edges:
                row.append(0)
            self.edges.append([0] * (len(self.edges)+1))
            self.edgeIndices[vertex.name] = len(self.edgeIndices)
            return True

    def addEdge(self, u, v, weight = 1):
        if u in self.vertices and v in self.vertices:
            self.edges[self.edgeIndices[u]][self.edgeIndices[v]] = weight
            self.edges[self.edgeIndices[v]][self.edgeIndices[u]] = weight
            return True
        else:
            return False

    def shortestPath(self, src):
        V = len(self.vertices)
        distance = [0] * V
        for i in range (V):
            distance[i] = maxsize

        queue = deque() 
        distance[src] = 0
        queue.append(src)

        while queue:
            value = queue[0]
            queue.popleft()

        # for i in range(len(self.edges[value])): 
        #     if (distance[self.edges[value][i]] >  
        #         distance[value] + self.edges[value][i]): 
        #         distance[self.edges[value][i] == distance[value] + self.edges[value][i]
        #         if self.edges[value][i] == 0: 
        #             queue.appendleft(self.edges[value][i]) 
        #         else: 
        #             queue.append(self.edges[value][i]) 
  
        for i in range(V): 
            print(distance[i], end = " ") 
        print() 

    def printGraph(self):
        for v, i in sorted(self.edgeIndices.items()):
            print(v + " ", end = "")
            for j in range(len(self.edges)):
                print(self.edges[i][j], end = "")
            print(" ")

def main():
    G= Graph()
    for i in range(ord("A"), ord("F")):
        G.addVertex(Vertex(chr(i)))

    edges = ["AB", "BC", "BD", "CD", "DE"]
    for edge in edges:
        G.addEdge(edge[0], edge[1])

    G.printGraph()
    print(G.shortestPath(4))


if __name__ == "__main__":
    main()