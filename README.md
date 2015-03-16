*Padda* is an Open source e-commerce suite written in Java

The name "[padda] (http://en.wikipedia.org/wiki/Padda)" comes from a bird from Java (Indonesia) that can eat a huge amount of seeds in a short time ;-) In the same way, Padda e-commerce will be able to handle a huge amount of users.

# Goals

  * Same functionality as [Magento] (http://www.magentocommerce.com/)
  * Modularity: split into small modules that can be replaced or reused in specific applications. No module should take more than 2 weeks to write.
  * Performance
  * Simplicity: keep the project as simple as possible, less code, less features, but lots of extension points
  * Full Java

# Roadmap

Done:
   1. Functional [requirements] https://github.com/fxbonnet/padda/wiki/Requirements) (with 2 categories : necessaryToStart, canBeDoneLater)
   1. Functional architecture : [modules] (https://github.com/fxbonnet/padda/wiki/Modules)
   1. First mockup implementation: interfaces and mock implementations for products and categories
   
TODO:
   1. Code [review] (https://github.com/fxbonnet/padda/wiki/FirstMockupReview) of first mockup implementation
   1. Interfaces, javadoc, wiki (1 page for all modules)
   1. Mock modules (ex: no database, hard coded products...)
   1. Integration of all the mock modules as a webapp to make a complete live prototype
   1. Review of the prototype by e-commerce experts
   1. Improvements of the prototype
   1. Validation
   1. Development of the real implementation 
   1. First production-ready release

# Technical choices

  * Built with maven
  * Several maven projects
  * padda (core module) will contain interfaces only (no library dependencies) with complete javadoc
  * Separate project for each module
  * Back-office using gwt?
  * Modules injected with Spring IOC?
