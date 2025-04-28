package com.tep.backend.model.dto;

import com.tep.backend.model.entity.Token;

import java.time.LocalDateTime;

public class TokenDTO {

    private Long id;
    private Long companyId;
    private String productName;
    private String productImageUrl;
    private String name;
    private String symbol;
    private String contractAddress;
    private String tokenType;
    private LocalDateTime createdAt;

    public TokenDTO() {
    }

    public TokenDTO(Token entity) {
        id = entity.getId();
        companyId = entity.getCompany().getId();
        productName = entity.getProductName();
        productImageUrl = entity.getProductImageUrl();
        name = entity.getName();
        symbol = entity.getSymbol();
        contractAddress = entity.getContractAddress();
        tokenType = entity.getTokenType();
        createdAt = entity.getCreatedAt();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
