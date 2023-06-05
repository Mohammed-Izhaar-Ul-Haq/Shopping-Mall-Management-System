package com.tnsif.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "orderdetails")
public class OrderDetails {
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "localdate")
	private String localdate;
	@Column(name = "total")
	/* @Pattern(regexp="[+]?[0-9]*\\.?[0-9]+",message="enter valid amount") */
	private float total;
	@Column(name = "paymentmode")
	@Pattern(regexp = "(?i)^(Card|Cash|Upi)$", message = "valid payment methods are[Card|Cash|Upi]")
	private String paymentmode;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	/* private Shop shop_id; */
	public OrderDetails() {

	}

	public OrderDetails(int id, String localdatetime, float total, Customer customer_id, String paymentmode) {
		super();
		this.id = id;
		this.localdate = localdatetime;
		this.total = total;
		this.customer = customer_id;
		this.paymentmode = paymentmode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocaldatetime() {
		return localdate;
	}

	public void setLocaldatetime(String localdatetime) {
		this.localdate = localdatetime;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Customer getCustomer_id() {
		return customer;
	}

	public void setCustomer_id(Customer customer_id) {
		this.customer = customer_id;
	}

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

}
