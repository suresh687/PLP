package com.cg.capgstore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventory")
public class StoreDTO {
	@Id
	@Column(name="product_id")
	Integer productId;
	@Column(name="product_name")
	String productName;
	@Column(name="product_desc")
	String productDesc;
	@Column(name="category_id")
	Integer categoryId;
	@Column(name="merchant_userid")
	Integer merchantUserId;
	@Column(name="product_price")
	Integer productPrice;
	@Column(name="product_quantity")
	Integer productQuantity;
	@Column(name="subcategory_id")
	Integer subcategoryId;
	public StoreDTO() {
		// TODO Auto-generated constructor stub
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getMerchantUserId() {
		return merchantUserId;
	}
	public void setMerchantUserId(Integer merchantUserId) {
		this.merchantUserId = merchantUserId;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	public Integer getSubcategoryId() {
		return subcategoryId;
	}
	public void setSubcategoryId(Integer subcategoryId) {
		this.subcategoryId = subcategoryId;
	}
	/**
	 * @param productId
	 * @param productName
	 * @param productDesc
	 * @param categoryId
	 * @param merchantUserId
	 * @param productPrice
	 * @param productQuantity
	 * @param subcategoryId
	 */
	public StoreDTO(Integer productId, String productName, String productDesc, Integer categoryId,
			Integer merchantUserId, Integer productPrice, Integer productQuantity, Integer subcategoryId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.categoryId = categoryId;
		this.merchantUserId = merchantUserId;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.subcategoryId = subcategoryId;
	}
	@Override
	public String toString() {
		return "StoreDTO [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", categoryId=" + categoryId + ", merchantUserId=" + merchantUserId + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + ", subcategoryId=" + subcategoryId + "]";
	}
}