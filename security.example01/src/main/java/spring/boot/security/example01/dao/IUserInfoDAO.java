package spring.boot.security.example01.dao;

import java.util.List;

import spring.boot.security.example01.model.Article;
import spring.boot.security.example01.model.UserInfo;

public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);

	List<Article> getAllUserArticles();
}
