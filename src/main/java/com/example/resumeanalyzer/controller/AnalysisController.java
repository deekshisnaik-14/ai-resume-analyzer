package com.example.resumeanalyzer.controller;
import com.example.resumeanalyzer.model.AnalysisRequest;
import com.example.resumeanalyzer.model.AnalysisResponse;
import com.example.resumeanalyzer.service.ResumeAnalysisService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class AnalysisController {
    private final ResumeAnalysisService service;
    public AnalysisController(ResumeAnalysisService service) { this.service = service; }

    @PostMapping("/analyze")
    public AnalysisResponse analyze(@Valid @RequestBody AnalysisRequest request) {
        try {
            return service.analyze(request);
        } catch (IllegalArgumentException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY,
                "AI provider failed. Check the API endpoint, model, and server logs.");
        }
    }
}
