package com.batistaweb.curse.entities;

import java.io.Serializable;

import com.batistaweb.curse.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable{
	private static final long serialVersionUID = 1L;

	
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	private Integer quantity;
	private Double prince;
	
	
	public OrderItem() {
		
	}


	public OrderItem(Order order,Product product,Integer quantity, Double prince) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.prince = prince;
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
			
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	
	public Product getProduct() {
		return id.getProduct();
			
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrince() {
		return prince;
	}


	public void setPrince(Double prince) {
		this.prince = prince;
	}
	
	public Double getSubTotal() {
		return prince * quantity;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	


	
	
	
	
	
}
