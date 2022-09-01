/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  98
 *  EncryptMethod
 *  int
 *  <p></p>
 *  Method of encryption.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - None / Other
 *  <p>    1 - PKCS (Proprietary)
 *  <p>    2 - DES (ECB Mode)
 *  <p>    3 - PKCS / DES (Proprietary)
 *  <p>    4 - PGP / DES (Defunct)
 *  <p></p>
 *  <p>    5 - PGP / DES-MD5 (See app note on FIX website)
 *  <p>    6 - PEM / DES-MD5 (see app note on FIX website)
 */
class Enum98EncryptMethodTest {
    @Test
    void Enum0098Test() {
        Enum98EncryptMethod enumType;

        /*
         * 0-6 msg types
         */
        enumType = Enum98EncryptMethod.NONE_OR_OTHER;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("NONE_OR_OTHER", enumType.toEnumNameString());
        assertEquals("0 - None / Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum98EncryptMethod.PKCS;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("PKCS", enumType.toEnumNameString());
        assertEquals("1 - PKCS (Proprietary)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum98EncryptMethod.DES_ECB;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("DES_ECB", enumType.toEnumNameString());
        assertEquals("2 - DES (ECB Mode)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum98EncryptMethod.PKCS_DES;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("PKCS_DES", enumType.toEnumNameString());
        assertEquals("3 - PKCS / DES (Proprietary)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum98EncryptMethod.PGP_DES;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("PGP_DES", enumType.toEnumNameString());
        assertEquals("4 - PGP / DES (Defunct)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum98EncryptMethod.PGP_DES_MD5;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("PGP_DES_MD5", enumType.toEnumNameString());
        assertEquals("5 - PGP / DES-MD5 (See app note on FIX web site)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum98EncryptMethod.PEM_DES_MD5;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("PEM_DES_MD5", enumType.toEnumNameString());
        assertEquals("6 - PEM / DES-MD5 (see app note on FIX web site)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}