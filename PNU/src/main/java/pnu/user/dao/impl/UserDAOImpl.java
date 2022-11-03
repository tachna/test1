package pnu.user.dao.impl;

import egovegramework.rte.psl.dataaccess.
import pnu.user.dao.UserDAO;

@Repository
public class UserDAOImpl EgovAbstracMapper implements UserDAO{
		@Override
		public String selectPwd(String userId) {
			return selectOne("User.selectPwd", userId)
		}
}
