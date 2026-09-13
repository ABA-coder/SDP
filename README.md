# Builder Pattern Assignment: Travel Itinerary

**Course:** Software Design Patterns  
**Language:** Java  

## 1. Project Description
This repository contains the implementation of the Creational **Builder Design Pattern**. The chosen domain is a `TravelItinerary`, which naturally benefits from step-by-step construction due to its multiple optional and mandatory components (e.g., departure, destination, vehicle, hotel).

### Architecture Components:
* **Product:** `TravelItinerary` - The complex object being built.
* **Builder:** `TravelItinerary.Builder` - Implements the fluent API for step-by-step assembly.
* **Director:** `TravelDirector` - Orchestrates the build sequence for predefined travel packages (e.g., Business Trip, Hiking Trip).
* **Client:** `Client` - Contains the `main` method to demonstrate and test the application.

---

## 2. Clean Code Principles Applied

In accordance with the "Clean Code" requirements, the following five principles were explicitly implemented and justified:

**1. Meaningful, intention-revealing names**
Classes and methods directly reflect the business logic and domain. 
* *Before:* `class Main` or `class Builder`
* *After:* `class TravelItinerary` and `constructBusinessTrip()`. This instantly reveals what the entity is and what the method does without needing extra comments.

**2. Validated construction (Fail-fast principle)**
The application prevents the creation of an object in an invalid state. The `build()` method enforces mandatory fields before instantiation.
Code Excerpt:
  if (departure == null || destination == null) {
      throw new IllegalStateException("Departure and destination are mandatory fields!");
  }
3. Small methods, each doing one thing
Each setter method inside the Builder is atomic. It performs exactly one task (assigning a specific variable) and returns the builder instance.

Code Excerpt:
public Builder setVehicle(String vehicle) {
    this.vehicle = vehicle;
    return this;
}
4. Fluent API (Readability)
Method chaining allows the client code to be read top-down like a cohesive narrative sentence, minimizing local variable clutter.

Code Excerpt:
new TravelItinerary.Builder().setDeparture("Astana").setDestination("Paris").build();

5. Encapsulation and Detail Hiding
The constructor of the product class is strictly private (private TravelItinerary(Builder builder)). The client is physically restricted from bypassing the Builder logic to instantiate the object directly via the new keyword, preserving structural integrity.