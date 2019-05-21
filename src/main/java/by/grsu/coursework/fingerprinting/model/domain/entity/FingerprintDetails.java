package by.grsu.coursework.fingerprinting.model.domain.entity;


import java.io.Serializable;

public class FingerprintDetails implements Serializable {
    private String fingerprint;
    private String userAgent;
    private String language;
    private String colorDepth;
    private String pixelRatio;
    private String hardwareConcurrency;
    private String screenResolution;
    private String availableScreenResolution;
    private String timezoneOffset;
    private String timezone;
    private boolean sessionStorage;
    private boolean localStorage;
    private boolean indexedDb;
    private boolean addBehavior;
    private boolean openDatabase;
    private String cpuClass;
    private String platform;
    private String plugins;
    private String canvas;
    private String webgl;
    private String webglVendorAndRenderer;
    private boolean useAdBlock;
    private boolean hasLiedLanguages;
    private boolean hasLiedResolution;
    private boolean hasLiedOs;
    private boolean hasLiedBrowser;
    private String touchSupport;
    private String fonts;
    private String fontsFlash;
    private String audio;
    private String enumerateDevices;

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getColorDepth() {
        return colorDepth;
    }

    public void setColorDepth(String colorDepth) {
        this.colorDepth = colorDepth;
    }

    public String getPixelRatio() {
        return pixelRatio;
    }

    public void setPixelRatio(String pixelRatio) {
        this.pixelRatio = pixelRatio;
    }

    public String getHardwareConcurrency() {
        return hardwareConcurrency;
    }

    public void setHardwareConcurrency(String hardwareConcurrency) {
        this.hardwareConcurrency = hardwareConcurrency;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getAvailableScreenResolution() {
        return availableScreenResolution;
    }

    public void setAvailableScreenResolution(String availableScreenResolution) {
        this.availableScreenResolution = availableScreenResolution;
    }

    public String getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public boolean isSessionStorage() {
        return sessionStorage;
    }

    public void setSessionStorage(boolean sessionStorage) {
        this.sessionStorage = sessionStorage;
    }

    public boolean isLocalStorage() {
        return localStorage;
    }

    public void setLocalStorage(boolean localStorage) {
        this.localStorage = localStorage;
    }

    public boolean isIndexedDb() {
        return indexedDb;
    }

    public void setIndexedDb(boolean indexedDb) {
        this.indexedDb = indexedDb;
    }

    public boolean isAddBehavior() {
        return addBehavior;
    }

    public void setAddBehavior(boolean addBehavior) {
        this.addBehavior = addBehavior;
    }

    public boolean isOpenDatabase() {
        return openDatabase;
    }

    public void setOpenDatabase(boolean openDatabase) {
        this.openDatabase = openDatabase;
    }

    public String getCpuClass() {
        return cpuClass;
    }

    public void setCpuClass(String cpuClass) {
        this.cpuClass = cpuClass;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlugins() {
        return plugins;
    }

    public void setPlugins(String plugins) {
        this.plugins = plugins;
    }

    public String getCanvas() {
        return canvas;
    }

    public void setCanvas(String canvas) {
        this.canvas = canvas;
    }

    public String getWebgl() {
        return webgl;
    }

    public void setWebgl(String webgl) {
        this.webgl = webgl;
    }

    public String getWebglVendorAndRenderer() {
        return webglVendorAndRenderer;
    }

    public void setWebglVendorAndRenderer(String webglVendorAndRenderer) {
        this.webglVendorAndRenderer = webglVendorAndRenderer;
    }

    public boolean isUseAdBlock() {
        return useAdBlock;
    }

    public void setUseAdBlock(boolean useAdBlock) {
        this.useAdBlock = useAdBlock;
    }

    public boolean isHasLiedLanguages() {
        return hasLiedLanguages;
    }

    public void setHasLiedLanguages(boolean hasLiedLanguages) {
        this.hasLiedLanguages = hasLiedLanguages;
    }

    public boolean isHasLiedResolution() {
        return hasLiedResolution;
    }

    public void setHasLiedResolution(boolean hasLiedResolution) {
        this.hasLiedResolution = hasLiedResolution;
    }

    public boolean isHasLiedOs() {
        return hasLiedOs;
    }

    public void setHasLiedOs(boolean hasLiedOs) {
        this.hasLiedOs = hasLiedOs;
    }

    public boolean isHasLiedBrowser() {
        return hasLiedBrowser;
    }

    public void setHasLiedBrowser(boolean hasLiedBrowser) {
        this.hasLiedBrowser = hasLiedBrowser;
    }

    public String getTouchSupport() {
        return touchSupport;
    }

    public void setTouchSupport(String touchSupport) {
        this.touchSupport = touchSupport;
    }

    public String getFonts() {
        return fonts;
    }

    public void setFonts(String fonts) {
        this.fonts = fonts;
    }

    public String getFontsFlash() {
        return fontsFlash;
    }

    public void setFontsFlash(String fontsFlash) {
        this.fontsFlash = fontsFlash;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getEnumerateDevices() {
        return enumerateDevices;
    }

    public void setEnumerateDevices(String enumerateDevices) {
        this.enumerateDevices = enumerateDevices;
    }

    @Override
    public String toString() {
        return "FingerprintDetails{" +
                "fingerprint='" + fingerprint + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", language='" + language + '\'' +
                ", colorDepth='" + colorDepth + '\'' +
                ", pixelRatio='" + pixelRatio + '\'' +
                ", hardwareConcurrency='" + hardwareConcurrency + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", availableScreenResolution='" + availableScreenResolution + '\'' +
                ", timezoneOffset='" + timezoneOffset + '\'' +
                ", timezone='" + timezone + '\'' +
                ", sessionStorage=" + sessionStorage +
                ", localStorage=" + localStorage +
                ", indexedDb=" + indexedDb +
                ", addBehavior=" + addBehavior +
                ", openDatabase=" + openDatabase +
                ", cpuClass='" + cpuClass + '\'' +
                ", platform='" + platform + '\'' +
                ", plugins='" + plugins + '\'' +
                ", canvas='" + canvas + '\'' +
                ", webgl='" + webgl + '\'' +
                ", webglVendorAndRenderer='" + webglVendorAndRenderer + '\'' +
                ", useAdBlock=" + useAdBlock +
                ", hasLiedLanguages=" + hasLiedLanguages +
                ", hasLiedResolution=" + hasLiedResolution +
                ", hasLiedOs=" + hasLiedOs +
                ", hasLiedBrowser=" + hasLiedBrowser +
                ", touchSupport='" + touchSupport + '\'' +
                ", fonts='" + fonts + '\'' +
                ", fontsFlash='" + fontsFlash + '\'' +
                ", audio='" + audio + '\'' +
                ", enumerateDevices='" + enumerateDevices + '\'' +
                '}';
    }
}
