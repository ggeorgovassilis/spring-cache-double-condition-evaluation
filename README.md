# spring-cache-double-condition-evaluation

Test case for [SPR-17024](https://jira.spring.io/browse/SPR-17024)

Demonstration of a double-check cache bug in Spring. The `@Cacheable` annotation has a `condition` argument which can be 
used to specify an EL and delegate the caching decision to a component. It turns out that in spring 5.0.7 (possibly earlier)
this condition is evaluated twice per invocation.
