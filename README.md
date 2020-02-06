# docker-example
Shows how to create a spring boot application + mysql

Compiling the project:
mvn clean install

Create MySQL
 docker run --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -d mysql:8.0

Build image
docker build -t user/app .

Run container
docker run -t --name user_app --link mysql:mysql -p 8080:8080 user/app


