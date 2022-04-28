package cf.vtool.projectv.service;

import cf.vtool.projectv.domain.Parcel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ParcelServiceTests {
    @Autowired
    private IParcelService parcelService;

    @Test
    public void testParcelService(){
        Parcel parcel = new Parcel();
        parcel.setLocation("锁金村");
        parcel.setCode("123");
        System.out.println( parcelService.save(parcel));



    }
}
