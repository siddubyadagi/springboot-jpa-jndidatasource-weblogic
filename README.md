# Read Me First
The following was discovered as part of building this project:

* This project is used to connect to mysql database over jndi datasource provided by weblogic server.
* Retrieve customer and company details using spring boot api over jpa repository api.  

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides

* Springboot 2.x
* Maven 3.x 
* JPA
* JNDI Datasource
* MySql 
* Runtime container weblogic 14.x

# Endpoints

* http://localhost:7001/springboot/api/test
* http://localhost:7001/springboot/api/company
 
 <p>[
{
"companyname": "accurate",
"companyphone": "4077608599",
"companyaddress": "bangalore",
"stockvalue": "90",
"id": 1
},
{
"companyname": "accurate inc",
"companyphone": "4077608599",
"companyaddress": "bangalore",
"stockvalue": "95",
"id": 2
},
{
"companyname": "accurate sols",
"companyphone": "4077608599",
"companyaddress": "bangalore",
"stockvalue": "98",
"id": 3
},
{
"companyname": "accurate pvt ltd",
"companyphone": "4077608599",
"companyaddress": "bangalore",
"stockvalue": "58",
"id": 4
},
{
"companyname": "accurate farmacy",
"companyphone": "4077608599",
"companyaddress": "mumbai",
"stockvalue": "50",
"id": 5
},
{
"companyname": "accurate cons",
"companyphone": "4077608599",
"companyaddress": "mumbai",
"stockvalue": "20",
"id": 6
}
]

</p>