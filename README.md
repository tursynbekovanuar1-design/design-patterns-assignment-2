# Assignment #2 — Factory Method & Abstract Factory

**Course:** ShP-2216 – Software Design Patterns (OP 6B06102)  
**Institution:** Astana IT University — School of Computer Engineering  
**Topic:** Option B (Vehicle Factory & Part Families)  

## Project Description
This project implements two fundamental creational design patterns in Java (JDK 17):
1. **Factory Method (Part A):** Encapsulates the creation of individual vehicles (Two-Wheeler, Three-Wheeler, Four-Wheeler) using subclasses (`TwoWheelerFactory`, `FourWheelerFactory`, etc.).
2. **Abstract Factory (Part B):** Provides an interface for creating families of related product parts (Engines and Bodies) for specific vehicle categories without specifying their concrete classes.

## Project Structure
- `src/`
  - Part A classes (`Vehicle`, `TwoWheeler`, `FourWheeler`, `VehicleFactory`, etc.)
  - Part B classes (`Engine`, `Body`, `TwoWheelerEngine`, `TwoWheelerBody`, `VehiclePartFactory`, etc.)
  - `Main.java` — Demonstration runner

## How to Run
1. Open the project in **IntelliJ IDEA** (JDK 17 or higher recommended).
2. Run the `Main.java` file to see the console output demonstrating both patterns.
