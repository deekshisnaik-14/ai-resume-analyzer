package com.example.resumeanalyzer.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AnalysisRequest(
    @NotBlank @Size(max=30000) String resumeText,
    @NotBlank @Size(max=20000) String jobDescription
) {}
