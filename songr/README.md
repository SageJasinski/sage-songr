# Feature

Added a rout album which will display all albums as well as let the user create albums

the application runs on port:8090 due to an internal server I have on port 8080. if you'd like to run this on port 8080
just comment out the port in the application properties file in resources

## Dependencies
implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
implementation 'org.springframework.boot:spring-boot-starter-web'
developmentOnly 'org.springframework.boot:spring-boot-devtools'
testImplementation 'org.springframework.boot:spring-boot-starter-test'
runtimeOnly'org.postgresql:postgresql'
implementation'org.springframework.boot:spring-boot-starter-data-jpa'
