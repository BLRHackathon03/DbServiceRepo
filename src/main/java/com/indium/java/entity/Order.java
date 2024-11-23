package com.indium.java.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stockOrder")
public class Order {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long orderId;
		private String stockName;
		private double currentPrices;
		private int quantity;
		private Long userid;
		private Long stockId;
		private String orderType;
		public Long getOrderId() {
			return orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public String getStockName() {
			return stockName;
		}
		public void setStockName(String stockName) {
			this.stockName = stockName;
		}
		public double getCurrentPrices() {
			return currentPrices;
		}
		public void setCurrentPrices(double currentPrices) {
			this.currentPrices = currentPrices;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public Long getUserid() {
			return userid;
		}
		public void setUserid(Long userid) {
			this.userid = userid;
		}
		public Long getStockId() {
			return stockId;
		}
		public void setStockId(Long stockId) {
			this.stockId = stockId;
		}
		public String getOrderType() {
			return orderType;
		}
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
		public Order() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Order(Long orderId, String stockName, double currentPrices, int quantity, Long userid, Long stockId,
				String orderType) {
			super();
			this.orderId = orderId;
			this.stockName = stockName;
			this.currentPrices = currentPrices;
			this.quantity = quantity;
			this.userid = userid;
			this.stockId = stockId;
			this.orderType = orderType;
		}
		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", stockName=" + stockName + ", currentPrices=" + currentPrices
					+ ", quantity=" + quantity + ", userid=" + userid + ", stockId=" + stockId + ", orderType="
					+ orderType + "]";
		}
		
		
		
   
}