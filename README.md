AI Risk Analyzer

An AI-powered web application that analyzes project descriptions and generates:

- Risk Score  
- Risk Level  
- Technical Challenges  
- Recommendations  

This application is built using Spring Boot, integrated with Google Gemini API, containerized using Docker, and deployed on cloud infrastructure.
 Live Demo

Deployed URL:
https://ai-risk-analyzer.onrender.com

 Tech Stack

 Backend
- Spring Boot
- Java 17
- REST API
- Maven

 Frontend
- HTML
- CSS (ChatGPT-style dark theme UI)
- JavaScript (Fetch API)

 AI Integration
- Google Gemini API

 DevOps & Deployment
- Docker (Multi-stage build)
- Render (Cloud Deployment)
- Environment Variables for secure API key management



 Features

- ChatGPT-style dark UI
- User input box fixed at bottom
- Scrollable chat interface
- AI-based project risk analysis
- Clean REST API architecture
- Secure API key handling using environment variables
- Dockerized production-ready build
- Cloud deployment support

Application Workflow

1. User enters a project description.
2. Frontend sends a POST request to `/api/risk`.
3. Spring Boot backend processes the request.
4. Backend securely calls Google Gemini API.
5. AI-generated analysis is returned.
6. Response is displayed in chat-style UI.

 Environment Variables

The application requires the following environment variable:

GEMINI_API_KEY=your_api_key_here

The API key is not stored in the source code for security reasons.

 Docker Support

This project uses a multi-stage Docker build.

 Build Docker Image

docker build -t ai-risk-analyzer .

 Run Docker Container

docker run -p 8080:8080 ai-risk-analyzer

 Deployment

This project is deployed using Docker on Render cloud platform.

Deployment Steps:
- Push project to GitHub
- Connect repository to Render
- Select Docker environment
- Add environment variable (GEMINI_API_KEY)
- Deploy

 Future Enhancements

- User authentication system
- Project history tracking
- Export analysis as downloadable PDF
- Admin dashboard
- UI animations and loading indicators
- Risk score visualization charts

 Author
Pushpalatha J 
Computer Science Engineering Student  





