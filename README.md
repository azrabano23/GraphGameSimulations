# GraphGameSimulations

---

## 📍 1. FlightPathGraph – Directed Graph using Adjacency List

- **Data Structure**: Array of linked lists (each node is a `City`).
- **Functionality**:
  - `addEdge(String departure, String arrival)`: Adds a directed edge from departure to arrival if it doesn't exist.
  - `removeEdge(String departure, String arrival)`: Removes the directed edge if it exists.
- **Use Case**: Flight network routing and mapping.

---

## 🟩 2. MinecraftLP – Linear Probing Hash Table

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
- **Use Case**: Inventory system similar to Minecraft.

---

## 📎 Notes

- These structures use Java primitives and focus on algorithmic rigor with minimal external libraries.

© 2025 Azra Bano
