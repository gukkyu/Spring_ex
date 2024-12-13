package com.example.lesson02.domain;

import java.time.LocalDateTime;

public class UsedGoods {
	// field
	private int id;
	private int sellor_id;
	private String title;
	private String description;
	private int price;
	private String goodsImageUrl;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	

	// getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSellor_id() {
		return sellor_id;
	}
	public void setSellor_id(int sellor_id) {
		this.sellor_id = sellor_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGoodsImageUrl() {
		return goodsImageUrl;
	}
	public void setGoodsImageUrl(String goodsImageUrl) {
		this.goodsImageUrl = goodsImageUrl;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
