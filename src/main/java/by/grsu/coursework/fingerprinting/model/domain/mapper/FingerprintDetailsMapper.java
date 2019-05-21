package by.grsu.coursework.fingerprinting.model.domain.mapper;

import by.grsu.coursework.fingerprinting.model.domain.entity.FingerprintDetails;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FingerprintDetailsMapper implements RowMapper<FingerprintDetails> {
    @Override
    public FingerprintDetails mapRow(ResultSet resultSet, int i) throws SQLException {
        FingerprintDetails fingerprintDetails = new FingerprintDetails();
        fingerprintDetails.setFingerprint(resultSet.getString("user_fingerprint"));
        fingerprintDetails.setUserAgent(resultSet.getString("userAgent"));
        fingerprintDetails.setLanguage(resultSet.getString("language"));
        fingerprintDetails.setColorDepth(resultSet.getString("colorDepth"));
        fingerprintDetails.setPixelRatio(resultSet.getString("pixelRatio"));
        fingerprintDetails.setHardwareConcurrency(resultSet.getString("hardwareConcurrency"));
        fingerprintDetails.setScreenResolution(resultSet.getString("screenResolution"));
        fingerprintDetails.setAvailableScreenResolution(resultSet.getString("availableScreenResolution"));
        fingerprintDetails.setTimezoneOffset(resultSet.getString("timezoneOffset"));
        fingerprintDetails.setTimezone(resultSet.getString("timezone"));
        fingerprintDetails.setSessionStorage(resultSet.getInt("sessionStorage")==1);
        fingerprintDetails.setLocalStorage(resultSet.getInt("localStorage")==1);
        fingerprintDetails.setIndexedDb(resultSet.getInt("indexedDB")==1);
        fingerprintDetails.setAddBehavior(resultSet.getInt("addBehavior")==1);
        fingerprintDetails.setOpenDatabase(resultSet.getInt("openDatabase")==1);
        fingerprintDetails.setCpuClass(resultSet.getString("cpuClass"));
        fingerprintDetails.setPlatform(resultSet.getString("platform"));
        fingerprintDetails.setPlugins(resultSet.getString("plugins"));
        fingerprintDetails.setCanvas(resultSet.getString("canvas"));
        fingerprintDetails.setWebgl(resultSet.getString("webgl"));
        fingerprintDetails.setWebglVendorAndRenderer(resultSet.getString("webglVendorAndRenderer"));
        fingerprintDetails.setUseAdBlock(resultSet.getInt("adBlock")==1);
        fingerprintDetails.setHasLiedLanguages(resultSet.getInt("hasLiedLanguages")==1);
        fingerprintDetails.setHasLiedResolution(resultSet.getInt("hasLiedResolution")==1);
        fingerprintDetails.setHasLiedOs(resultSet.getInt("hasLiedOs")==1);
        fingerprintDetails.setHasLiedBrowser(resultSet.getInt("hasLiedBrowser")==1);
        fingerprintDetails.setTouchSupport(resultSet.getString("touchSupport"));
        fingerprintDetails.setFonts(resultSet.getString("fonts"));
        fingerprintDetails.setAudio(resultSet.getString("audio"));
        fingerprintDetails.setFontsFlash(resultSet.getString("fontsFlash"));
        fingerprintDetails.setEnumerateDevices(resultSet.getString("enumerateDevices"));
        return fingerprintDetails;
    }
}
