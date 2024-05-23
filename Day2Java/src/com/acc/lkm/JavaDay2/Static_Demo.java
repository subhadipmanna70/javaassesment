package com.acc.lkm.JavaDay2;

public class Static_Demo {
	
	public static class order{
		public static String getOrderId() {
			return orderId;
		}
		public static void setOrderId(String orderId) {
			order.orderId = orderId;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getProduct_name() {
			return product_name;
		}
		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}
		private static String orderId;
		private int quantity;
		private String product_name;
		
	}

}
