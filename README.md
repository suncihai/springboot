# springboot
SpringBoot PlayGround

This project is to get used to SpringBoot.

* has successfully connected to mysql

Note: 
## Setup
1. make sure gradle-wrapper.properties version right to your local gradle version.
2. remember some useful plugins and dependencies

## Connect to mysql
1. "com.mysql.jdbc.Driver" has deprecated, use "com.mysql.cj.jdbc.Driver"
2. "Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 
   5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. 
   For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. 
   You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for
   server certificate verification."
   
   try jdbcUrl, append "?autoReconnect=true&useSSL=false"
3. "java.sql.SQLException: The server time zone value 'xxxx' is unrecognized or represents more than one time zone. 
   You must configure either the server or JDBC driver (via the serverTimezone configuration property) to use a more 
   specifc time zone value if you want to utilize time zone support"
   
   try jdbcUrl, append "?serverTimezone=UTC"
   
