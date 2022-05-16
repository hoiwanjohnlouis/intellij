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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix27.enums.Enum98EncryptMethod;
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
class Tag98EnuEncryptMethodTest {
    @Test
    void FIX0098Test() {
        FIX27 fixData = FIX27.FIX98_ENU_ENCRYPT_METHOD;
        assertEquals( "ENCRYPT_METHOD", fixData.toFIXNameString());
        assertEquals( "98", fixData.toFIXIDString());
        assertEquals( "EncryptMethod", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0098Test() {
        Tag98EnuEncryptMethod tagData;

        /*
         * 0-6 EncryptMethod types
         */
        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.NONE_OR_OTHER);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.PKCS);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.DES_ECB);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.PKCS_DES);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.PGP_DES);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.PGP_DES_MD5);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.PEM_DES_MD5);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}