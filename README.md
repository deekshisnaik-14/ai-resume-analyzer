# AI Resume Analyzer

A full-stack beginner project that compares resume text with a job description and returns an approximate fit score, matching skills, missing skills, strengths, and improvement suggestions.

## Stack
- Java 17, Spring Boot, Maven
- HTML, CSS, vanilla JavaScript
- Optional OpenAI-compatible chat-completions API integration
- Demo keyword analysis works without an API key

## Run
1. Install JDK 17+ and Maven.
2. Optional (PowerShell): `$env:AI_API_KEY="your_api_key"`
3. Run `mvn spring-boot:run`
4. Open http://localhost:8080

Optional environment variables:
- `AI_API_KEY` (leave unset to use demo mode)
- `AI_API_URL` (defaults to `https://api.openai.com/v1/chat/completions`)
- `AI_MODEL` (defaults to `gpt-4o-mini`; use a model available to your provider)

Check your provider's current API documentation and pricing. Never put API keys in frontend code or commit them to GitHub.

## API
`POST /api/analyze`
```json
{"resumeText":"Java, SQL, Spring Boot...","jobDescription":"Junior developer role requiring Java and SQL..."}
```

## Important
- The score is an approximate fit estimate, not a probability of being hired.
- Demo mode is keyword-based and may miss synonyms or context.
- Do not paste sensitive personal information without permission.
- Review all suggestions and never claim skills or experience you do not have.

## GitHub
Create an empty GitHub repository, then from this folder run:
```bash
git init
git add .
git commit -m "Build AI Resume Analyzer"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/ai-resume-analyzer.git
git push -u origin main
```

## Resume bullet (only after testing it yourself)
**AI Resume Analyzer | Java, Spring Boot, REST API, HTML, CSS, JavaScript**
- Built a full-stack application that compares resume content against job descriptions and highlights matching and missing skills.
- Implemented a Spring Boot REST API, responsive interface, and optional LLM integration with server-side API-key configuration.
