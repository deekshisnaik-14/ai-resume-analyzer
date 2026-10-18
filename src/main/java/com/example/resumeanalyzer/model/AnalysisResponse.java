package com.example.resumeanalyzer.model;
import java.util.List;

public record AnalysisResponse(
    int matchScore, List<String> matchingSkills, List<String> missingSkills,
    List<String> strengths, List<String> suggestions, String summary, String mode
) {}
