package cf.vtool.projectv.service.impl;

import cf.vtool.projectv.domain.Parcel;
import cf.vtool.projectv.dao.ParcelDao;
import cf.vtool.projectv.service.IParcelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ParcelServiceImpl extends ServiceImpl<ParcelDao, Parcel> implements IParcelService {
}
