package com.example.jokes.services.flag;

import org.springframework.stereotype.Service;

import com.example.jokes.client.FlagApiClient;
import com.example.jokes.dtos.FlagDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FlagServiceImpl implements FlagService {
    private final FlagApiClient apiClient;

    @Override
    public FlagDto getFlags() {
        return apiClient.getFlags();
    }
}
