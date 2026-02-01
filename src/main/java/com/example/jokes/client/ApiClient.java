package com.example.jokes.client;

import lombok.AllArgsConstructor;

import java.util.Map;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@AllArgsConstructor
public class ApiClient {
    private final WebClient jokeWebClient;

    public <T> T get(@NonNull String uri, @NonNull Class<T> responseType) {
        return jokeWebClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(responseType)
                .block();
    }

    public <T> T get(
            @NonNull String path,
            Map<String, ?> queryParams,
            @NonNull Class<T> responseType) {

        String uri = UriComponentsBuilder
                .fromPath(path)
                .queryParams(toMultiValueMap(queryParams))
                .toUriString();

        return get(uri, responseType);
    }

    private MultiValueMap<String, String> toMultiValueMap(Map<String, ?> params) {
        var map = new org.springframework.util.LinkedMultiValueMap<String, String>();
        params.forEach((key, value) -> {
            if (key != null && value != null) {
                map.add(key, value.toString());
            }
        });
        return map;
    }
}
