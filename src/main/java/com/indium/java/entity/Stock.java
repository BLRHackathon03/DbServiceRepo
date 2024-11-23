package com.indium.java.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stockId;
	private String stockName;
	private String stockAlias;
	private double currentPrices;
	private Date updatedAt;
	private int stockNum;
	
	
    @OneToOne
    @JoinColumn(name = "orderId")
    private Order orderObj;
	
	public Long getStockId() {
		return stockId;
	}
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockAlias() {
		return stockAlias;
	}
	public void setStockAlias(String stockAlias) {
		this.stockAlias = stockAlias;
	}
	public double getCurrentPrices() {
		return currentPrices;
	}
	public void setCurrentPrices(double currentPrices) {
		this.currentPrices = currentPrices;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public int getStockNum() {
		return stockNum;
	}
	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}
	public Stock(Long stockId, String stockName, String stockAlias, double currentPrices, Date updatedAt,
			int stockNum) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockAlias = stockAlias;
		this.currentPrices = currentPrices;
		this.updatedAt = updatedAt;
		this.stockNum = stockNum;
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", stockAlias=" + stockAlias
				+ ", currentPrices=" + currentPrices + ", updatedAt=" + updatedAt + ", stockNum=" + stockNum + "]";
	}
	
	

}
