package br.com.kumabe.api.dto;

// Using Java 14+ Records for immutable DTOs (perfect for Java 21)
public record HelloResponse(String message, String status) {
}