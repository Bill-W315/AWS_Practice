package com.example.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
