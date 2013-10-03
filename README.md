Demo applikation to show versioned REST apis with JsonView and JAX-RS

Usage:

    git clone https://github.com/kyuff/versioned-service-demo.git
    cd versioned-service-demo.git
    mvn jetty:run

Point a browser to:

http://localhost:8080/api/person/<id>/<api version>

Where
<id> is a random number
<api version> is either 1 or 2