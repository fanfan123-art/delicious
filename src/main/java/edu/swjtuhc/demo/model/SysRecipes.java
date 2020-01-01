package edu.swjtuhc.demo.model;

import java.util.Date;

public class SysRecipes {
	
	private String recipesName;
	private Date publishDate;
	private String rimg;
	private String publisher;
	
	public String getRecipesName() {
		return recipesName;
	}
	public void setRecipesName(String recipesName) {
		this.recipesName = recipesName;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	public String getRimg() {
		return rimg;
	}
	public void setRimg(String rimg) {
		this.rimg = rimg;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "SysRecipes [recipesName=" + recipesName + ", publishDate=" + publishDate + ", rimg=" + rimg
				+ ", publisher=" + publisher + "]";
	}
	
	
}
