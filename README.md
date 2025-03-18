1. Project Description

The Elevator Simulation project is a Java program that simulates an elevator system. Passengers call the elevator from different floors randomly over a specified duration. The program tracks the time taken to process all requests and analyzes the frequency of calls from each floor. The simulation helps identify usage patterns and evaluate elevator efficiency.

2. Design Choices

Data Structures:
Queue (LinkedList): Used to manage passenger requests in the order they are received.
Map (HashMap): Used to track the frequency of calls from each floor.
Elevator Logic:
The elevator processes requests one by one, moving to the requested floor and calculating the time taken for each move.
The total time is accumulated as the elevator moves between floors.
Randomization:
Passenger calls are generated randomly using the Random class to simulate real-world usage.
3. Algorithms and Data Structures

Algorithm:
The elevator processes requests in a First-Come-First-Served (FCFS) manner.
The time taken to move between floors is calculated as the absolute difference between the current floor and the target floor.
Data Structures:
Queue: Stores elevator requests.
Map: Tracks the number of calls from each floor.
4. Improvements to Initial Implementation

Error Handling:
Added input validation to ensure floor numbers are within the valid range (1 to maxFloors).
Scalability:
The program can handle any number of floors and simulation durations, making it flexible for different scenarios.
Output Clarity:
The simulation results are displayed clearly, showing the elevator's movement and call frequency per floor.
5. Input and Output

Input:
The program takes user input for the number of floors, maximum passengers per trip, and simulation duration.
No external files are used for input.
Output:
The program outputs the elevator's movement and total time taken to process all requests.
It also displays the frequency of calls from each floor.
No external files are used for output.
6. Challenges Encountered

Randomization:
Generating realistic passenger calls required careful use of the Random class.
Efficiency:
The current implementation processes requests sequentially. Optimizing the elevator's route (e.g., processing nearest requests first) could improve efficiency.
Passenger Capacity:
The current implementation does not account for the maximum number of passengers per trip, which could be added in future versions.
7. Additional Explanations

The program is designed to be simple and easy to understand, focusing on core functionality.
Future improvements could include:
Implementing a smarter elevator algorithm (e.g., Shortest Seek Time First).
Adding support for multiple elevators.
Using external files for input (e.g., predefined passenger requests) and output (e.g., saving simulation results to a file).
<img width="846" alt="Снимок экрана 2025-03-18 в 23 22 18" src="https://github.com/user-attachments/assets/ec2f9256-e21f-4353-a078-e9e77e893c68" />
<img width="749" alt="Снимок экрана 2025-03-18 в 23 22 00" src="https://github.com/user-attachments/assets/da199165-422e-409c-a700-03c8df17b643" />
<img width="749" alt="Снимок экрана 2025-03-18 в 23 21 53" src="https://github.com/user-attachments/assets/f0bbf81d-b321-44db-a000-68033adfc6a3" />
made by MUKHIDIN KARAKOZUEV
