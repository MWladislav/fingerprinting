package by.grsu.coursework.fingerprinting.model.dao.interfaces;

import by.grsu.coursework.fingerprinting.model.domain.entity.FingerprintDetails;

public interface FingerprintDetailsDao {

    FingerprintDetails getFingerprintDetailsByFingerprint(String fp);

    int saveFingerprintDetails(FingerprintDetails fingerprintDetails);

    Integer isFingerprintDuplicaded(String fp);
}
