# Jokes API

A simple Spring Boot 3.3.5 project with:

- Uses [JokeAPI](https://v2.jokeapi.dev) to fetch random jokes
- Custom `ApiResponse` wrapper for uniform JSON responses
- `ResponseBodyAdvice` to auto-wrap responses
- Swagger UI documentation (SpringDoc OpenAPI)
- DevTools support
- Security disabled for all endpoints (permitAll)

---

## Swagger Documentation

- <http://localhost:8080/swagger-ui/index.html>

### The OpenAPI JSON spec is available at

- <http://localhost:8080/v3/api-docs>
