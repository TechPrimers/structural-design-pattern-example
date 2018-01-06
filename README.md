# Structural Design Patterns
## Table of Contents
- [Adapter](#adapter)
- [Composite](#composite)
- [Decortor](#decorator)

## Adapter <a name="adapter"></a>
- Bridge between 2 interfaces (Useful when we work with Legacy code)

### Disadvantages
- No new functionalities
- Multiple Adapters

## Composite <a name="composite"></a>
- Tree structure
- Component
- Leaf
- Composite

### Disadvantages
- Very costly to create more composite impl
- Overly simple

## Decorator <a name="decorator"></a>
- Wrapper
- Add functionality or behavior
- Single Responsibility Principle
- Dynamically compose behavior
- Inheritance and Composition

## Disadvantages
- New Class for every feature
- no of objects (more)
- more comples for the clients

