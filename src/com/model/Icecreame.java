package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Icecreame")
public class Icecreame {

		@Id
		@GeneratedValue
		
		private int iceId;
		private String flavour;
		private double quantity;
		public int getIceId() {
			return iceId;
		}
		public void setIceId(int iceId) {
			this.iceId = iceId;
		}
		public String getFlavour() {
			return flavour;
		}
		public void setFlavour(String flavour) {
			this.flavour = flavour;
		}
		public double getQuantity() {
			return quantity;
		}
		public void setQuantity(double quantity) {
			this.quantity = quantity;
		}
	
	
}
