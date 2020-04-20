
class Vertex:
    def __init__(self, name: str):
        self.name = name
        self.neighbors = list()

    def addNeighbor(self,v):
        if v not in self.neighbors:
            self.neighbors.append(v)
            self .neighbors.sort

class Graph:
    def __init__(self):
        self.vertices = {}

    def addVertex(self, vertex):
        if vertex.name in self.vertices:
            return False
        else:
            self.vertices[vertex.name] = vertex

    def addEdge(self,u,v):
        if u in self.vertices and v in self.vertices:
            self.vertices[u].addNeighbor(v)
            self.vertices[v].addNeighbor(u)
            return True
        else:
            return False

    

    def printGraph(self):
        for vertex in sorted(self.vertices.keys()):
            print(vertex, "=>", self.vertices[vertex].neighbors)

def main():
    G = Graph()
    a = Vertex('A')
    G.addVertex(a)
    G.addVertex(Vertex('B'))
    for i in range(ord('C'), ord('F')):
        G.addVertex(Vertex(chr(i)))

    edges = ["AB", "BC", "BD", "CD", "DE"]
    for edge in edges:
        G.addEdge(edge[0], edge[1])

    G.printGraph()


if __name__ == "__main__":
    main()