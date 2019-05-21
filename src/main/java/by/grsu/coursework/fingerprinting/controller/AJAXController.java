package by.grsu.coursework.fingerprinting.controller;

import by.grsu.coursework.fingerprinting.model.dao.interfaces.FingerprintDetailsDao;
import by.grsu.coursework.fingerprinting.model.domain.entity.FingerprintDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AJAXController {

    @Autowired
    FingerprintDetailsDao fingerprintDetailsDao;

    @PostMapping("/saveFp")
    public String saveFingerprint(@RequestBody FingerprintDetails fingerprintDetails){
        if(fingerprintDetailsDao.isFingerprintDuplicaded(fingerprintDetails.getFingerprint())==0)
            fingerprintDetailsDao.saveFingerprintDetails(fingerprintDetails);
        return "index";
    }
}
