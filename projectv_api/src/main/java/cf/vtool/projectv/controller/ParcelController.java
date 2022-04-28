package cf.vtool.projectv.controller;

import cf.vtool.projectv.domain.Parcel;
import cf.vtool.projectv.exception.BusinessException;
import cf.vtool.projectv.service.IParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parcels")
public class ParcelController {

    @Autowired
    private IParcelService parcelService;

    @GetMapping("{id}")
    public R getById(@PathVariable Long id) {
        return new R<>(parcelService.getById(id));
    }

    @PostMapping
    public R add(Parcel parcel) {
        try {
            parcelService.save(parcel);
            return new R();
        } catch (Exception e) {
            throw new BusinessException(Code.BUSINESS_ERR, "添加包裹失败");
        }
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Long id) {
        try {
            parcelService.removeById(id);
            return new R();
        } catch (Exception e) {
            throw new BusinessException(Code.BUSINESS_ERR, "删除包裹失败");
        }
    }

    @PutMapping
    public R update(Parcel parcel) {
        try {
            parcelService.updateById(parcel);
            return new R();
        } catch (Exception e) {
            throw new BusinessException(Code.BUSINESS_ERR, "修改包裹失败");
        }
    }
}
