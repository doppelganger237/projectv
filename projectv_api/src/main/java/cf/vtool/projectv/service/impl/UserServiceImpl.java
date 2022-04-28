package cf.vtool.projectv.service.impl;

import cf.vtool.projectv.dao.UserDao;
import cf.vtool.projectv.domain.User;
import cf.vtool.projectv.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {
}
