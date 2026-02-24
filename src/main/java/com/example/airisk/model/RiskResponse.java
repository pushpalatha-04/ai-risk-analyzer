package com.example.airisk.model;

public class RiskResponse {

    private int riskScore;
    private String riskLevel;
    private String technicalChallenges;
    private String recommendations;

    public RiskResponse(int riskScore, String riskLevel,
                        String technicalChallenges,
                        String recommendations) {
        this.riskScore = riskScore;
        this.riskLevel = riskLevel;
        this.technicalChallenges = technicalChallenges;
        this.recommendations = recommendations;
    }

    public int getRiskScore() { return riskScore; }
    public String getRiskLevel() { return riskLevel; }
    public String getTechnicalChallenges() { return technicalChallenges; }
    public String getRecommendations() { return recommendations; }
}