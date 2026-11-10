package deltazero.amarok.utils;

public final class UpdateUtil {
    private UpdateUtil() {}

    public enum UpdateChannel {
        RELEASE, BETA;

        public static UpdateChannel fromString(String value) {
            try {
                return valueOf(value.toUpperCase());
            } catch (Exception e) {
                return RELEASE;
            }
        }
    }
}
