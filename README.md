# simple-msa-in-action

* Registration & Discovery
  * [Spring Cloud Netflix(Eureka)](https://cloud.spring.io/spring-cloud-netflix/reference/html/)
* Gateway
  * [Spring Cloud Gateway](https://cloud.spring.io/spring-cloud-gateway/reference/html/)
* Config Server
  * [Spring Cloud Config](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/)
* MicroService To MicroService
  * [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)
* Tracing
  * [Micrometer, Zipkin](https://micrometer.io/)
  * Spring Boot 3.1까지만 [Spring Cloud Sleuth](https://spring.io/projects/spring-cloud-sleuth) 지원, [Micrometer](https://micrometer.io/)로 이전함
    * [관련자료](https://docs.spring.io/spring-cloud-sleuth/docs/current-SNAPSHOT/reference/html/)
* Composition
  * API Composition
  * CQRS (예정)
* Transaction Management ?
  * Saga Pattern ?
    * Kafka ?
    * Axon ?


### Description
* JDK 21
* Spring Boot 3.2.5
* Kotlin 1.9

---

* Eureka Server (Port : `8761`)
  * Spring Eureka Dashboard : http://localhost:8761
    <details>
    <summary>image</summary>
    <div markdown="1">
      <img src="./image/eureka-screenshot.png" alt="eureka-screenshot">
    </div>
    </details>
* Config Server (Port : `8888`)
  * http://localhost:8888/{application}/{profile}
  * 민감한 정보 처리하게 된다면 암호화 필요
  * 파일시스템 활용하여 구축하였지만, git repository로 구축하는 방법도 있음
  * 서버별로 `POST | /actuator/refresh`를 호출하는 방법도 있지만, cloud bus를 활용하는 방법도 있음 (여러 서버 config 값을 갱신 시킬 때 유용, kafka etc...) 
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

---

  * [Docker] Zipkin Server (Port : `9411`)
    * Brave + Zipkin 구성으로 적용 (+ OpenFeign Micrometer)
    * `docker run -d -p 9411:9411 openzipkin/zipkin`
    * http://localhost:9411/zipkin
  
    ![](./image/service-structure-screenshot.png)*service structure image*