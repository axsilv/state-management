# State Management

## Description

**State Management** is a system designed to manage event states from multiple different sources. It can understand the correct order of events regardless of the order in which they arrive at the system. Additionally, the system functions as an **event store**, storing all events for future queries and analysis.

## Features

- **Event Management**: Receives and processes events from multiple sources.
- **Event Ordering**: Ensures the correct order of events based on timestamps or unique identifiers.
- **Event Storage**: Persists events in an event-oriented database.
- **Consistency and Reliability**: Maintains data consistency and handles failures efficiently.
- **Scalability**: Supports an increase in the number of events.

## Technologies Used

- Kotlin 
- Spring 
- Kafka
- Postgresql 

## Architecture and Design Used

- Hexagonal Architecture
- CQRS (Command Query Responsibility Segregation)
- Asynchronous and Reactive Systems
