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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  98
 *  EncryptMethod
 *  int
 *  Method of encryption.
 *  Valid values:
 *      0 - None / Other
 *      1 - PKCS (Proprietary)
 *      2 - DES (ECB Mode)
 *      3 - PKCS / DES (Proprietary)
 *      4 - PGP / DES (Defunct)
 *
 *      5 - PGP / DES-MD5 (See app note on FIX web site)
 *      6 - PEM / DES-MD5 (see app note on FIX web site)
 */
class Enum98EncryptMethodTest {
    @Test
    void Enum0098Test() {
        Enum98EncryptMethod enumType;

        /*
         * 0-6 msg types
         */
        enumType = Enum98EncryptMethod.NONE_OR_OTHER;
        assertEquals("0", enumType.getID());
        assertEquals("NONE_OR_OTHER", enumType.getName());
        assertEquals("0 - None / Other", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum98EncryptMethod.PKCS;
        assertEquals("1", enumType.getID());
        assertEquals("PKCS", enumType.getName());
        assertEquals("1 - PKCS (Proprietary)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum98EncryptMethod.DES_ECB;
        assertEquals("2", enumType.getID());
        assertEquals("DES_ECB", enumType.getName());
        assertEquals("2 - DES (ECB Mode)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum98EncryptMethod.PKCS_DES;
        assertEquals("3", enumType.getID());
        assertEquals("PKCS_DES", enumType.getName());
        assertEquals("3 - PKCS / DES (Proprietary)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum98EncryptMethod.PGP_DES;
        assertEquals("4", enumType.getID());
        assertEquals("PGP_DES", enumType.getName());
        assertEquals("4 - PGP / DES (Defunct)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum98EncryptMethod.PGP_DES_MD5;
        assertEquals("5", enumType.getID());
        assertEquals("PGP_DES_MD5", enumType.getName());
        assertEquals("5 - PGP / DES-MD5 (See app note on FIX web site)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum98EncryptMethod.PEM_DES_MD5;
        assertEquals("6", enumType.getID());
        assertEquals("PEM_DES_MD5", enumType.getName());
        assertEquals("6 - PEM / DES-MD5 (see app note on FIX web site)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}