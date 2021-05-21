# 스프링 부트 도커 예제

도커 이미지 만들기
```
docker build -t spring-boot-docker-example .
```

도커 컨테이너 실행
```
docker run -p 5000:8080 spring-boot-docker-example
```