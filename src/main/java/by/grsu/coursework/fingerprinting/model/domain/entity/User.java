package by.grsu.coursework.fingerprinting.model.domain.entity;

public class User {

    public User() {
    }

    private String fingerprint;
    private String username;
    private FingerprintDetails fingerprintDetails;

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public FingerprintDetails getFingerprintDetails() {
        return fingerprintDetails;
    }

    public void setFingerprintDetails(FingerprintDetails fingerprintDetails) {
        this.fingerprintDetails = fingerprintDetails;
    }
}
