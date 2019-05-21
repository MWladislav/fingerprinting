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

    private static final String SQL_SAVE_FINGERPRINT_DETAILS = "insert into fingerprintdetails(user_fingerprint, userAgent, language, colorDepth, pixelRatio, hardwareConcurrency, screenResolution, availableScreenResolution, timezoneOffset, timezone, sessionStorage, localStorage, indexedDb, addBehavior, openDatabase, cpuClass, platform, plugins, canvas, webgl, webglVendorAndRenderer, useAdBlock, hasLiedLanguages, hasLiedResolution, hasLiedOs, hasLiedBrowser, touchSupport, fonts, audio, fontsFlash, enumerateDevices) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    private static final String SQL_IS_FINGERPRINT_DUPLICATED = "select count(*) from fingerprintdetails fpd where fpd.user_fingerprint=?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer isFingerprintDuplicaded(String fp){
        return jdbcTemplate.queryForObject(SQL_IS_FINGERPRINT_DUPLICATED,Integer.class,fp);
    }

    @Override
    public FingerprintDetails getFingerprintDetailsByFingerprint(String fp) {
        return jdbcTemplate.queryForObject(SQL_GET_FINGERPRINT_DETAILS_BY_FINGERPRINT,new FingerprintDetailsMapper());
    }

    @Override
    public int saveFingerprintDetails(FingerprintDetails fingerprintDetails) {
        return jdbcTemplate.update(SQL_SAVE_FINGERPRINT_DETAILS,fingerprintDetails.getFingerprint(),fingerprintDetails.getUserAgent(),fingerprintDetails.getLanguage(),fingerprintDetails.getColorDepth(),fingerprintDetails.getPixelRatio(),fingerprintDetails.getHardwareConcurrency(),fingerprintDetails.getScreenResolution(),fingerprintDetails.getAvailableScreenResolution(),fingerprintDetails.getTimezoneOffset(),fingerprintDetails.getTimezone(),fingerprintDetails.isSessionStorage(),fingerprintDetails.isLocalStorage(),fingerprintDetails.isIndexedDb(),fingerprintDetails.isAddBehavior(),fingerprintDetails.isOpenDatabase(),fingerprintDetails.getCpuClass(),fingerprintDetails.getPlatform(),fingerprintDetails.getPlugins(),fingerprintDetails.getCanvas(),fingerprintDetails.getWebgl(),fingerprintDetails.getWebglVendorAndRenderer(),fingerprintDetails.isUseAdBlock(),fingerprintDetails.isHasLiedLanguages(),fingerprintDetails.isHasLiedResolution(),fingerprintDetails.isHasLiedOs(),fingerprintDetails.isHasLiedBrowser(),fingerprintDetails.getTouchSupport(),fingerprintDetails.getFonts(),fingerprintDetails.getAudio(), fingerprintDetails.getFontsFlash(), fingerprintDetails.getEnumerateDevices());
    }
}
