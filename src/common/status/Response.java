/**
 * Enum for response either OK or NOT_OK
 *
 * Author:Subodh Kumar
 * Version: 1.0
 * Since:2022-11-23
 */
package common.status;

public enum Response {
    OK {
        @Override
        public String toString() {
            return "Password is OK";
        }
    },
    NOT_OK {
        @Override
        public String toString() {
            return "Password is never OK";
        }
    },
}
