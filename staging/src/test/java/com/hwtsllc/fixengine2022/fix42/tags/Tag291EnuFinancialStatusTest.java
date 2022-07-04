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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum291FinancialStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  291
 *  FinancialStatus
 *  MultipleCharValue
 *  <p>
 *  Identifies a firm's or a security's financial status
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    BANKRUPT( "1", "BANKRUPT", "1 - Bankrupt" ),
 *  <p>    PENDING_DELISTING( "2", "PENDING_DELISTING", "2 - Pending delisting" ),
 *  <p>    RESTRICTED( "3", "RESTRICTED", "3 - Restricted" ),
 */
class Tag291EnuFinancialStatusTest {
    @Test
    void FIX0291Test() {
        FIX42 fixData = FIX42.FIX291_ENU_FINANCIAL_STATUS;
        assertEquals( "291", fixData.toEnumIDString());
        assertEquals( "FINANCIAL_STATUS", fixData.toEnumNameString());
        assertEquals( "FinancialStatus", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0291Test() {
        Tag291EnuFinancialStatus tagData;

        /*
         * 1-3 msg types
         */
        tagData = new Tag291EnuFinancialStatus(Enum291FinancialStatus.BANKRUPT);
        assertEquals( Enum291FinancialStatus.BANKRUPT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag291EnuFinancialStatus(Enum291FinancialStatus.PENDING_DELISTING);
        assertEquals( Enum291FinancialStatus.PENDING_DELISTING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag291EnuFinancialStatus(Enum291FinancialStatus.RESTRICTED);
        assertEquals( Enum291FinancialStatus.RESTRICTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag291EnuFinancialStatus tagData;

        // loop around the ENUM and process
        for (Enum291FinancialStatus oneEnum : Enum291FinancialStatus.values()) {
            tagData = new Tag291EnuFinancialStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag291EnuFinancialStatus tagData;

        // loop around the ENUM and process
        for (Enum291FinancialStatus oneEnum : Enum291FinancialStatus.values()) {
            tagData = new Tag291EnuFinancialStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag291EnuFinancialStatus tagData;

        // loop around the ENUM and process
        for (Enum291FinancialStatus oneEnum : Enum291FinancialStatus.values()) {
            tagData = new Tag291EnuFinancialStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag291EnuFinancialStatus tagData;

        // loop around the ENUM and process
        for (Enum291FinancialStatus oneEnum : Enum291FinancialStatus.values()) {
            tagData = new Tag291EnuFinancialStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag291EnuFinancialStatus tagData;

        // loop around the ENUM and process
        for (Enum291FinancialStatus oneEnum : Enum291FinancialStatus.values()) {
            tagData = new Tag291EnuFinancialStatus(oneEnum);
            assertEquals( "Tag291EnuFinancialStatus\n" +
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