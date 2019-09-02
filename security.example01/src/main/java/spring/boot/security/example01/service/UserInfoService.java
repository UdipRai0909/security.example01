package spring.boot.security.example01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.security.example01.dao.IUserInfoDAO;
import spring.boot.security.example01.model.Article;

@Service
public class UserInfoService implements IUserInfoService {
	@Autowired
	private IUserInfoDAO userDAO;

	@Override
	public List<Article> getAllUserArticles() {
		return userDAO.getAllUserArticles();
	}
}
