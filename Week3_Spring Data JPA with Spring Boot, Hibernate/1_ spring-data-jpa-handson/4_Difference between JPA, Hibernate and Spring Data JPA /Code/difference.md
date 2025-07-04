# JPA vs Hibernate vs Spring Data JPA — Key Differences

| Feature                | JPA (Pure)                | Hibernate                     | Spring Data JPA                           |
|------------------------|----------------------------|-------------------------------|-------------------------------------------|
| Type                   | Specification (API)       | ORM implementation of JPA     | Abstraction over JPA implementations      |
| Uses Persistence Unit? | Yes (`persistence.xml`)   | Optional                      | No (uses `application.properties`)        |
| Requires Boilerplate?  | Yes                       | Yes                           | No (Very minimal)                         |
| Implementation Needed? | Yes (like Hibernate)      | Itself is the implementation  | Needs Hibernate or another JPA provider   |
| Session Management     | Manual (`EntityManager`)  | Manual (`Session`)            | Automatic via Spring                      |
| Transaction Handling   | Manual (`EntityTransaction`)| Manual / `@Transactional`   | Mostly automatic                          |
| Code Simplicity        | Complex                   |  Verbose                      | Simple                                    |
| Use Case               | Standard JPA-based persistence | ORM with extra features  | Rapid Spring Boot development             |
