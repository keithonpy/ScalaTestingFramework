# Scala Testing

## Overview of testing

### Unit Test

Test the behaviour of an individual unit or component of application code such as methods or classes in isolation. These tests are usually automated and run frequently during development to catch regressions early.

### Integration Test

Test the behaviour of a set of units, or different components or modules of your application operating together. They focus on testing interactions between different parts of your code rather than individual units.


## Driven Development

### Test Driven Development
In Test-Driven Development (TDD), developers write tests that define the desired functionality of the code before writing the code itself. The process typically involves the following steps:

* Write a Test: Developers create a test that defines the behavior the code should exhibit. This test usually fails initially because the corresponding code hasn't been implemented yet.

* Write the Code: Developers then write the minimum amount of code necessary to pass the test. This often results in simpler, more modular code because it focuses on meeting the requirements defined by the test.

* Run the Tests: After writing the code, developers run all tests to ensure that the new code didn't break any existing functionality.

* Refactor: If necessary, developers refactor the code to improve its design, readability, or performance, while ensuring that all tests still pass.

* Repeat: The cycle is repeated for each new piece of functionality or improvement.

### Behaviour Driven Development

is a variation of TDD that focuses on the behavior of the software from the perspective of its stakeholders. BDD encourages collaboration between developers, testers, and business representatives to ensure that the software meets the desired behavior or "specifications."

* Define Behavior: Stakeholders describe the desired behavior of the software using structured, natural language specifications called "scenarios" or "user stories."

* Write Acceptance Tests: Developers and testers translate these scenarios into executable acceptance tests using a framework like Cucumber or Behave. These tests serve as both documentation and verification of the system's behavior.

* Write Code: Developers implement the code necessary to satisfy the acceptance tests. Similar to TDD, this is an iterative process where code is written in small increments, with tests being run frequently to ensure that the behavior remains consistent.

* Refactor: Developers refactor the code as needed to improve its quality, performance, or maintainability while ensuring that all acceptance tests still pass.


