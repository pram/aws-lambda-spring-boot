package com.naughtyzombie.aws.service;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class AwsLambaService {
    public String uppercase(final String input) {
        return input.toUpperCase(Locale.ENGLISH);
    }
}
