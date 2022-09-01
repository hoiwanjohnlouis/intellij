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

import com.hwtsllc.fixengine2022.fix42.enums.Enum291FinancialStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag291EnuFinancialStatusTest {
    Tag291EnuFinancialStatus tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum291FinancialStatus oneEnum : Enum291FinancialStatus.values()) {
            tagData = new Tag291EnuFinancialStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum291FinancialStatus oneEnum : Enum291FinancialStatus.values()) {
            tagData = new Tag291EnuFinancialStatus(oneEnum);
            assertEquals( "FIX291_ENU_FINANCIAL_STATUS", tagData.toFIXLabelString());
            assertEquals( "291", tagData.toEnumIDString());
            assertEquals( "FINANCIAL_STATUS", tagData.toEnumNameString());
            assertEquals( "FinancialStatus", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum291FinancialStatus oneEnum : Enum291FinancialStatus.values()) {
            tagData = new Tag291EnuFinancialStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  291
         *  FinancialStatus
         *  MultipleCharValue
         *  <p>    1-3 msg types
         *  <p>    BANKRUPT( "1", "BANKRUPT", "1 - Bankrupt" ),
         *  <p>    PENDING_DELISTING( "2", "PENDING_DELISTING", "2 - Pending delisting" ),
         *  <p>    RESTRICTED( "3", "RESTRICTED", "3 - Restricted" ),
         */
        tagData = new Tag291EnuFinancialStatus(Enum291FinancialStatus.BANKRUPT);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag291EnuFinancialStatus(Enum291FinancialStatus.PENDING_DELISTING);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag291EnuFinancialStatus(Enum291FinancialStatus.RESTRICTED);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum291FinancialStatus oneEnum : Enum291FinancialStatus.values()) {
            tagData = new Tag291EnuFinancialStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum291FinancialStatus oneEnum : Enum291FinancialStatus.values()) {
            tagData = new Tag291EnuFinancialStatus(oneEnum);
            assertEquals( "Tag291EnuFinancialStatus\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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