package pnu.user.service.Impl;

import pnu.user.dao.UserDAO;
import pnu.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDAO;
	
	
	@Override
	public Boolean selectPwd(String userId, String pwd) {
		return pwd.equals(userDAO.selectPwd(userId))
	}
}
