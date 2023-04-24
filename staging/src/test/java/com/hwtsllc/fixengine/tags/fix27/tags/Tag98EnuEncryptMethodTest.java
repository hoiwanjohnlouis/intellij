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

package com.hwtsllc.fixengine.tags.fix27.tags;

import com.hwtsllc.fixengine.tags.fix27.enums.Enum98EncryptMethod;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag98EnuEncryptMethodTest {
    Tag98EnuEncryptMethod tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum98EncryptMethod oneEnum : Enum98EncryptMethod.values()) {
            tagData = new Tag98EnuEncryptMethod(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum98EncryptMethod oneEnum : Enum98EncryptMethod.values()) {
            tagData = new Tag98EnuEncryptMethod(oneEnum);
            assertEquals( "FIX98_ENU_ENCRYPT_METHOD", tagData.toFIXLabelString());
            assertEquals( "ENCRYPT_METHOD", tagData.toFIXNameString());
            assertEquals( "98", tagData.toFIXIDString());
            assertEquals( "EncryptMethod", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum98EncryptMethod oneEnum : Enum98EncryptMethod.values()) {
            tagData = new Tag98EnuEncryptMethod(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  98
         *  <p>    0 - None / Other
         *  <p>    1 - PKCS (Proprietary)
         *  <p>    2 - DES (ECB Mode)
         *  <p>    3 - PKCS / DES (Proprietary)
         *  <p>    4 - PGP / DES (Defunct)
         */
        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.NONE_OR_OTHER);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.PKCS);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.DES_ECB);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.PKCS_DES);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.PGP_DES);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - PGP / DES-MD5 (See app note on FIX website)
         *  <p>    6 - PEM / DES-MD5 (see app note on FIX website)
         */
        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.PGP_DES_MD5);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag98EnuEncryptMethod(Enum98EncryptMethod.PEM_DES_MD5);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum98EncryptMethod oneEnum : Enum98EncryptMethod.values()) {
            tagData = new Tag98EnuEncryptMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum98EncryptMethod oneEnum : Enum98EncryptMethod.values()) {
            tagData = new Tag98EnuEncryptMethod(oneEnum);
            assertEquals( "Tag98EnuEncryptMethod\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}