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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyEnumAcctIDSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  660 (same as 660, 661)
 *  AcctIDSource
 *  int
 *  <p>
 *  Used to identify the source of the Account (1) code.
 *  This is especially useful if the account is a new account
 *  that the Respondent may not have set up yet in their system.
 *  <p></p>
 *  661 (same as 660, 601)
 *  AllocAcctIDSource
 *  int
 *  <p>
 *  Used to identify the source of the AllocAccount (79) code.
 *      See AcctIDSource (660) for valid values.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - BIC
 *  <p>    2 - SID Code
 *  <p>    3 - TFM (GSPTA)
 *  <p>    4 - OMGEO (Alert ID)
 *  <p>    5 - DTCC Code
 *  <p>    99 - Other (custom or proprietary)
 */
class Tag660EnuAcctIDSourceTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX660_ENU_ACCT_ID_SOURCE;
        assertEquals( "660", fixData.toEnumIDString());
        assertEquals( "ACCT_ID_SOURCE", fixData.toEnumNameString());
        assertEquals( "AcctIDSource", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0660Test() {
        Tag660EnuAcctIDSource tagData;
        MyEnumAcctIDSource oneElement;

        oneElement = MyEnumAcctIDSource.BIC;
        tagData = new Tag660EnuAcctIDSource( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "660", tagData.toEnumIDString());
        assertEquals( "ACCT_ID_SOURCE", tagData.toEnumNameString());
        assertEquals( "AcctIDSource", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag660EnuAcctIDSource(MyEnumAcctIDSource.SID);
        assertEquals( MyEnumAcctIDSource.SID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag660EnuAcctIDSource(MyEnumAcctIDSource.TFM);
        assertEquals( MyEnumAcctIDSource.TFM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag660EnuAcctIDSource(MyEnumAcctIDSource.OMGEO);
        assertEquals( MyEnumAcctIDSource.OMGEO.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag660EnuAcctIDSource(MyEnumAcctIDSource.DTCC);
        assertEquals( MyEnumAcctIDSource.DTCC.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag660EnuAcctIDSource(MyEnumAcctIDSource.OTHER);
        assertEquals( MyEnumAcctIDSource.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag660EnuAcctIDSource tagData;

        // loop around the ENUM and process
        for ( MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag660EnuAcctIDSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag660EnuAcctIDSource tagData;

        // loop around the ENUM and process
        for (MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag660EnuAcctIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag660EnuAcctIDSource tagData;

        // loop around the ENUM and process
        for (MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag660EnuAcctIDSource(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag660EnuAcctIDSource tagData;

        // loop around the ENUM and process
        for (MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag660EnuAcctIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag660EnuAcctIDSource tagData;

        // loop around the ENUM and process
        for (MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            tagData = new Tag660EnuAcctIDSource(oneEnum);
            assertEquals( "Tag660EnuAcctIDSource\n" +
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