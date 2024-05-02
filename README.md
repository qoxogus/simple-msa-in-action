# simple-msa-in-action

* Registration & Discovery
  * [Spring Cloud Netflix(Eureka)](https://cloud.spring.io/spring-cloud-netflix/reference/html/)
* Gateway
  * [Spring Cloud Gateway](https://cloud.spring.io/spring-cloud-gateway/reference/html/)
* Config Server
  * [Spring Cloud Config](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/) (추후 필요할 때 구축)
* MicroService To MicroService
  * [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign) (예정)
* Tracing
  * [Spring Cloud Sleuth (Zipkin)](https://spring.io/projects/spring-cloud-sleuth) (예정)
* Transaction Management (예정)
  * Saga Pattern ?
    * Kafka ?
    * Axon ?
* API Composition, CQRS (예정)
  * ...


### Description
* Eureka Server (Port : `8761`)
  * Spring Eureka Dashboard : http://localhost:8761
    <details>
    <summary>example images</summary>
    <div markdown="1">
      <img src="./image/eureka-screenshot.png" alt="eureka-screenshot">
    </div>
    </details>
* Gateway Server (Port : `8000`)
  * http://localhost:8000/api/v1/health-check
* Member Server (Port : `8080`)
  * http://localhost:8080/api/v1/members/health-check
  * for gateway : http://localhost:8000/api/v1/members/health-check
    * predicate : `/api/{version}/members/**`
    * forward : `8000` -> `8080`
* Book Server (Port : `9090`)
  * http://localhost:9090/api/v1/books/health-check
  * for gateway : http://localhost:8000/api/v1/books/health-check
    * predicate : `/api/{version}/books/**`
    * forward : `8000` -> `9090`