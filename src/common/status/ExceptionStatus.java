/**
 * Enum for different Exception status
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.status;

public enum ExceptionStatus {
    PASSWORD_LENGTH_ERROR {
        @Override
        public String toString() {
            return "Password should be larger than 8 chars";
        }
    },
    PASSWORD_CONTAIN_NULL_ERROR {
        @Override
        public String toString() {
            return "Password should not be null";
        }
    },
    PASSWORD_LOWERCASE_ERROR {
        @Override
        public String toString() {
            return "Password should have one lowercase letter at least";
        }
    },
    PASSWORD_NUMBER_ERROR {
        @Override
        public String toString() {
            return "password should have one number at least";
        }
    },
    PASSWORD_UPPERCASE_ERROR {
        @Override
        public String toString() {
            return "password should have one uppercase letter at least";
        }
    }
}
