package by.grsu.coursework.fingerprinting.model.dao.impl;

import by.grsu.coursework.fingerprinting.model.dao.interfaces.FingerprintDetailsDao;
import by.grsu.coursework.fingerprinting.model.domain.entity.FingerprintDetails;
import by.grsu.coursework.fingerprinting.model.domain.mapper.FingerprintDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FingerprintDetailsDaoImpl implements FingerprintDetailsDao {


    private static final String SQL_GET_FINGERPRINT_DETAILS_BY_FINGERPRINT = "select * from fingerprintDetails fpd where fpd.user_fingerprint=?";

    private static final String SQL_SAVE_FINGERPRINT_DETAILS = "insert into fingerprintdetails(user_fingerprint, userAgent, language, colorDepth, deviceMemory, hardwareConcurrency, screenResolution, availableScreenResolution, timezoneOffset, timezone, sessionStorage, localStorage, indexedDb, addBehavior, openDatabase, cpuClass, platform, plugins, canvas, webgl, webglVendorAndRenderer, adBlock, hasLiedLanguages, hasLiedResolution, hasLiedOs, hasLiedBrowser, touchSupport, fonts, audio,username) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public FingerprintDetails getFingerprintDetailsByFingerprint(String fp) {
        return jdbcTemplate.queryForObject(SQL_GET_FINGERPRINT_DETAILS_BY_FINGERPRINT,new FingerprintDetailsMapper());
    }

    @Override
    public int saveFingerprintDetails(FingerprintDetails fingerprintDetails) {
        return jdbcTemplate.update(SQL_SAVE_FINGERPRINT_DETAILS);
    }
}
