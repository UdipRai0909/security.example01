package spring.boot.security.example01.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import spring.boot.security.example01.model.Article;

public interface IUserInfoService {
	@Secured({ "ROLE_ADMIN" })
	List<Article> getAllUserArticles();
}
