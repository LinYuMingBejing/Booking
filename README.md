

# Hotel Search Engine Platform
### Environment:
* Ubuntu: 16.04 
* Java: 1.8
* Backend: Spring Boot
* Database: MongoDB, Redis
* Deploy: Docker, Docker Compose
* Dependency management: Maven

### Install Docker & Docker Compose
* sudo apt-get update
* sudo apt-get install \
    apt-transport-https \
    ca-certificates \
    curl \
    gnupg-agent \
    software-properties-common

* curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
* sudo apt-key fingerprint 0EBFCD88

* sudo add-apt-repository \
 "deb [arch=amd64] https://download.docker.com/linux/ubuntu \
   $(lsb_release -cs) \
   stable"

* sudo apt-get update
* sudo apt-get install docker-ce docker-ce-cli containerd.io
* sudo apt install docker-compose

### Install Redis
```
$ docker pull redis
$ docker run --name redis-lab -p 6379:6379 -d redis

# Check redis wherether running
$ ps -ef | grep redis
$ losf -i:6369
```


### Install MongoDB
```
$ docker pull mongo:latest
$ docker run -itd --name mongo -p 27017:27017 mongo
```

### Build Images
```
$ sudo mvn clean package docker:build -P prod
```

### Deploy project
```
$ cd docker_prd
# Run the services without building
$ docker-compose up -d

# Stop the services
$ docker-compose down

# Show the logs
sudo docker-compose logs --tail=20 -f booking

```


### API Format
| Endpoints    | Params |Methods |
| --------- | -------- | -----:|
| /hotel   |  hotel|GET|
| /hotel/city   |      city & ttn | GET |
| /hotel/town   |      town  | GET |
| /hotel/ratings   |      ratings  | GET |
| /hotel/stars   |      stars & ttn  | GET |
| /update/info   |      Booking  | POST |





