/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void  addVetrex(){
        Graph graph = new Graph();

        graph.addVetrex("Bob");
        graph.addVetrex("Mary");
        graph.addVetrex("Alice");
        graph.addVetrex("Carl");

        assertEquals(4, graph.size());
    }

    @Test
    public void  addEdge(){
        Graph graph = new Graph();

        graph.addVetrex("Bob");
        graph.addVetrex("Mary");
        graph.addVetrex("Alice");
        graph.addVetrex("Carl");

        graph.addEdge("Bob","Alice");

        assertEquals("Vertex{label='Bob'}[Vertex{label='Alice'}]Vertex{label='Carl'}[]Vertex{label='Alice'}[Vertex{label='Bob'}]Vertex{label='Mary'}[]", graph.printGraph());
    }

    @Test
    public void  size(){
        Graph graph = new Graph();

        graph.addVetrex("Bob");
        graph.addVetrex("Mary");
        graph.addVetrex("Alice");
        graph.addVetrex("Carl");

        assertEquals(4, graph.size());
    }

    @Test
    public void  nullGraph(){
        Graph graph = new Graph();

        assertNotNull(graph);
    }

    @Test
    public void  bft(){
        Graph graph = new Graph();

        graph.addVetrex("Bob");
        graph.addVetrex("Mary");
        graph.addVetrex("Alice");
        graph.addVetrex("Carl");
        graph.printGraph();
        assertNotEquals("[Alice, Carl, Bob, Mary]", graph.bft(graph, "Alice").toString());
    }

    @Test
    public void  removeVetrex(){
        Graph graph = new Graph();

        graph.addVetrex("Bob");
        graph.addVetrex("Mary");
        graph.addVetrex("Alice");
        graph.addVetrex("Carl");

        graph.removeVertex("Bob");

        assertEquals("Vertex{label='Carl'}[]Vertex{label='Alice'}[]Vertex{label='Mary'}[]", graph.printGraph());

    }

    @Test
    public void  removeEdge(){
        Graph graph = new Graph();

        graph.addVetrex("Bob");
        graph.addVetrex("Mary");
        graph.addVetrex("Alice");
        graph.addVetrex("Carl");

        graph.addEdge("Bob","Alice");
        graph.addEdge("Bob","Mary");
        graph.addEdge("Alice","Carl");

        graph.removeEdge("Bob","Alice");

        assertEquals("Vertex{label='Bob'}[Vertex{label='Mary'}]Vertex{label='Carl'}[Vertex{label='Alice'}]Vertex{label='Alice'}[Vertex{label='Carl'}]Vertex{label='Mary'}[Vertex{label='Bob'}]", graph.printGraph());

    }

    @Test
    public void  dft(){
        Graph graph = new Graph();

        graph.addVetrex("Bob");
        graph.addVetrex("Mary");
        graph.addVetrex("Alice");
        graph.addVetrex("Carl");
        graph.printGraph();
        assertNotEquals("[Alice, Carl, Bob, Mary]", graph.dft(graph, "Alice").toString());
    }



}
