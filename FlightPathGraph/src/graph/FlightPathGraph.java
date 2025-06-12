package graph; 

/*
 * CS112 Graph Lab
 * 
 * Implement the constructor, addEdge(), removeEdge() using an linked adjacency list
 * based representation of an directed graph
 * 
 * @author Colin Sullivan
 */
public class FlightPathGraph {
    // Adjacency list of cities. Each index corresponds to a City node which is the head of a linked list.
    // Each list is an edge list, meaning the first node has an edge to all the rest of the nodes in the list.
    public City[] flightPaths;

    // i.e. if flightPaths[0].getCity() is "New York", and flightPaths[0].next.getCity() is "London", it means New York
    // has a directed edge to London. If New York is also placed in Londons list, the edge is then undirected.

    /**
     * Constructor which initializes the adjacency list with the given verticies, with no edges
     *  
     * 1) Initiate the flightPaths array to the same size as the cities array
     * 2) Add a new City node to each index in flightPaths, with the corresponding
     *    city name from the same index in cities[]
     * @param cities array of city names to be added to the graph
     */
    public FlightPathGraph(String[] cities) {
        // WRITE YOUR CODE HERE
        flightPaths = new City[cities.length];
        for (int i = 0; i < cities.length; i++) {
            flightPaths[i] = new City(cities[i]);
        }
    }

    

    /**
     * Adds an directed edge between the departure and arrival locations
     * 
     * Don't insert if an edge already exists
     * 
     * Add a new City node containing the arrival city to the END 
     * of the departure citys edgelist
     * @param departure the city to add an edge from
     * @param arrival the city to add an edge to
     */
    public void addEdge(String departure, String arrival) {
        // WRITE YOUR CODE HERE
        // Note: Insert all edges as directed. Directed edges will appear as a red line in the driver.
        if (departure.equals(arrival)) {
            return; 
        }
        City departureCity = null;
        for (City city : flightPaths) {
            if (city.getCity().equals(departure)) {
                departureCity = city;
                break; 
            }
        }
        if (departureCity == null) {
            return; 
        }
    
        City current = departureCity.getNext();
        while (current != null) {
            if (current.getCity().equals(arrival)) {
                return; 
            }
            current = current.getNext();
        }
    
        City newCityNode = new City(arrival);
    
        current = departureCity;
        while (current.getNext() != null) {
            current = current.getNext(); 
        }
    
        current.setNext(newCityNode);
    }
    /**
     * Removes the directed edge between the departure and arrival cities
     * 
     * Remove the City node containing "arrival" from "departure"'s edge list
     * 
     * @param departure the city to remove an edge from
     * @param arrival the city to remove an edge to
     */
    public void removeEdge(String departure, String arrival) {
        // WRITE YOUR CODE HERE
        City departureCity = null;
    for (City city : flightPaths) {
        if (city.getCity().equals(departure)) {
            departureCity = city;
            break;
        }
    }
    
    if (departureCity == null) {
        return;
    }

    City current = departureCity;
    while (current.getNext() != null) {
        if (current.getNext().getCity().equals(arrival)) {
            current.setNext(current.getNext().getNext());
            return; 
        }
        current = current.getNext();
    }
}
    

    /*
     * Getter method for number of vertices
     * 
     * @return number of riders in line (lineLength)
     */
    public int getNumberOfVertices() {
        // DO NOT MODIFY
        return flightPaths.length;
    }

}
