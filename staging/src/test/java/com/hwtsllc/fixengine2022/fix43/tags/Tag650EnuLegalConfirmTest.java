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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum650LegalConfirm;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  650
 *  LegalConfirm
 *  Boolean
 *  <p>
 *  Indicates that this message is to serve as the final and legal confirmation.
 *  <p>
 *  Valid values:
 *  <p>    N - Does not constitute a Legal Confirm
 *  <p>    Y - Legal Confirm
 */
class Tag650EnuLegalConfirmTest {
    @Test
    void FIX0650Test() {
        FIX43 fixData = FIX43.FIX650_ENU_LEGAL_CONFIRM;
        assertEquals( "650", fixData.toEnumIDString());
        assertEquals( "LEGAL_CONFIRM", fixData.toEnumNameString());
        assertEquals( "LegalConfirm", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0650Test() {
        Tag650EnuLegalConfirm tagData;

        tagData = new Tag650EnuLegalConfirm(Enum650LegalConfirm.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag650EnuLegalConfirm(Enum650LegalConfirm.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag650EnuLegalConfirm tagData;

        // loop around the ENUM and process
        for ( Enum650LegalConfirm oneEnum : Enum650LegalConfirm.values()) {
            tagData = new Tag650EnuLegalConfirm(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag650EnuLegalConfirm tagData;

        // loop around the ENUM and process
        for (Enum650LegalConfirm oneEnum : Enum650LegalConfirm.values()) {
            tagData = new Tag650EnuLegalConfirm(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag650EnuLegalConfirm tagData;

        // loop around the ENUM and process
        for (Enum650LegalConfirm oneEnum : Enum650LegalConfirm.values()) {
            tagData = new Tag650EnuLegalConfirm(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag650EnuLegalConfirm tagData;

        // loop around the ENUM and process
        for (Enum650LegalConfirm oneEnum : Enum650LegalConfirm.values()) {
            tagData = new Tag650EnuLegalConfirm(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag650EnuLegalConfirm tagData;

        // loop around the ENUM and process
        for (Enum650LegalConfirm oneEnum : Enum650LegalConfirm.values()) {
            tagData = new Tag650EnuLegalConfirm(oneEnum);
            assertEquals( "Tag650EnuLegalConfirm\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}