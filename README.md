# GraphGameSimulations

---

## 📍 1. FlightPathGraph – Directed Graph using Adjacency List

- This class represents a directed graph where each node is a city, and each edge is a flight path from one city to another. It's implemented using an adjacency list, where each city node points to a linked list of its destination cities.


🔧 Core Features:
Constructor: Builds a graph from a list of city names.

addEdge(): Adds a directed edge (flight path) from one city to another, unless the edge already exists.

removeEdge(): Removes a directed flight from one city to another if it exists.

📌 Example Use: Simulating a flight map where airports are vertices and direct flights are edges—useful for routing, optimization, or visualizing airline networks.

- **Data Structure**: Array of linked lists (each node is a `City`).
- **Functionality**:
  - `addEdge(String departure, String arrival)`: Adds a directed edge from departure to arrival if it doesn't exist.
  - `removeEdge(String departure, String arrival)`: Removes the directed edge if it exists.


---

## 🟩 2. MinecraftLP – Linear Probing Hash Table

- This class simulates a Minecraft-style inventory system, where each unique item (e.g., "Diamond", "Pickaxe") is stored in a hash table using linear probing for collision resolution.

🔧 Core Features:
put(): Adds or updates an item’s quantity in the table. Automatically resizes the table when it's half full.

delete(): Removes a specific quantity of an item. If the count becomes zero, the item is removed and the table is rehashed.

search(): Returns the index of an item if it exists.

resize() and rehash(): Manage memory efficiently and keep the table performant as items are added or removed.

📌 Example Use: Represents an inventory bar in a game like Minecraft, ensuring fast access to item counts and handling limited storage slots.

- **Data Structure**: Linear probing hash table `Item[] st` with custom load factor rules.
- **Key Features**:
  - `put(String name, int count)`: Inserts or updates item quantities.
  - `delete(String name, int count)`: Decreases quantity or deletes item if zero.
  - Auto-resizes on:
    - ≥50% load factor → doubles
    - ≤25% (with cap > 9) → halves
- **Methods**:
  - `resize(int capacity)`
  - `rehash(int i)`
  - `search(String name)`

---

## 📎 Notes

- These structures use Java primitives and focus on algorithmic rigor with minimal external libraries.

© 2025 Azra Bano
