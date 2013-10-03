Demo applikation to show versioned REST apis with JsonView and JAX-RS

Usage:

    git clone https://github.com/kyuff/versioned-service-demo.git
    cd versioned-service-demo
    mvn jetty:run

Point a browser to:

* http://localhost:8080/api/person/7/1
* http://localhost:8080/api/person/7/2

Where the last number in the URL is the API version number.