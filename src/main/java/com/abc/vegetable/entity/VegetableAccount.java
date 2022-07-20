package com.abc.vegetable.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.abc.vegetable.entity.VegetableAccount;

@Entity
public class VegetableAccount implements Comparable<VegetableAccount>
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int vegetableId;
	public String vegetableName;
	public String vegetableType;
	public int vegetableAmount;
	public String picture;

	public VegetableAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VegetableAccount(int vegetableId, String vegetableName, String vegetableType, int vegetableAmount, String picture) {
		super();
		this.vegetableId = vegetableId;
		this.vegetableName = vegetableName;
		this.vegetableType = vegetableType;
		this.vegetableAmount = vegetableAmount;
		this.picture = picture;
	}

	public int getvegetableId() {
		return vegetableId;
	}

	public void setvegetable(int pizzaId) {
		this.vegetableId = vegetableId;
	}

	public String getvegetableName() {
		return vegetableName;
	}

	public void setvegetableName(String vegetableName) {
		this.vegetableName = vegetableName;
	}

	public String getvegetableType() {
		return vegetableType;
	}

	public void setvegetableType(String vegetableType) {
		this.vegetableType = vegetableType;
	}

	public int getvegetableAmount() {
		return vegetableAmount;
	}

	public void setvegetableAmount(int vegetableAmount) {
		this.vegetableAmount = vegetableAmount;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public int hashCode() {
		return Objects.hash(picture, vegetableAmount, vegetableId, vegetableName, vegetableType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VegetableAccount other = (VegetableAccount) obj;
		return Objects.equals(picture, other.picture) && vegetableAmount == other.vegetableAmount && vegetableId == other.vegetableId
				&& Objects.equals(vegetableName, other.vegetableName) && Objects.equals(vegetableType, other.vegetableType);
	}

	@Override
	public String toString() {
		return "PizzaAccount [vegetableId=" + vegetableId + ", vegetableName=" + vegetableName + ", vegetableType=" + vegetableType
				+ ", vegetableAmount=" + vegetableAmount + ", picture=" + picture + "]";
	}

	@Override
	public int compareTo(VegetableAccount o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}