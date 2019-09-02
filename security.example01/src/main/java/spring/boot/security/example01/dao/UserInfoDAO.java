package spring.boot.security.example01.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import spring.boot.security.example01.model.Article;
import spring.boot.security.example01.model.UserInfo;

@Repository
@Transactional
public class UserInfoDAO implements IUserInfoDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public UserInfo getActiveUser(String userName) {
		UserInfo activeUserInfo = new UserInfo();
		short enabled = 1;
		List<?> list = entityManager.createQuery("SELECT u FROM UserInfo u WHERE userName=:name and enabled=:status")
				.setParameter("name", userName).setParameter("status", enabled).getResultList();
		if (!list.isEmpty()) {
			activeUserInfo = (UserInfo) list.get(0);
		}
		return activeUserInfo;
	}

	@SuppressWarnings("unchecked")
	public List<Article> getAllUserArticles() {
		String hql = "FROM Article as art ORDER BY art.articleId";
		return (List<Article>) entityManager.createQuery(hql).getResultList();
	}
}