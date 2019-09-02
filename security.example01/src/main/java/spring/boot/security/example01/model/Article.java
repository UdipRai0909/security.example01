package spring.boot.security.example01.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="articles")
public class Article implements Serializable { 
	
	private static final long serialVersionUID = 1L;
	
	// Properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="article_id")
    private int articleId;  
	
	@Column(name="title")
    private String title;
	
	@Column(name="category")	
	private String category;
	
	// Getters and Setters
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
