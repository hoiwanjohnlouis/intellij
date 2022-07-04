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
import com.hwtsllc.fixengine2022.fix43.enums.Enum481MoneyLaunderingStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  481
 *  MoneyLaunderingStatus
 *  char
 *  <p></p>
 *  A one character code identifying Money laundering status.
 *  <p></p>
 *  Valid values:
 *  <p>    Y - Passed
 *  <p>    N - Not Checked
 *  <p>    1 - Exempt - Below the Limit
 *  <p>    2 - Exempt - Client Money Type exemption
 *  <p>    3 - Exempt - Authorised Credit or financial institution
 */
class Tag481EnuMoneyLaunderingStatusTest {
    @Test
    void FIX0481Test() {
        FIX43 fixData = FIX43.FIX481_ENU_MONEY_LAUNDERING_STATUS;
        assertEquals( "481", fixData.toEnumIDString());
        assertEquals( "MONEY_LAUNDERING_STATUS", fixData.toEnumNameString());
        assertEquals( "MoneyLaunderingStatus", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0481Test() {
        Tag481EnuMoneyLaunderingStatus tagData;

        /*
         * Y, types
         */
        tagData = new Tag481EnuMoneyLaunderingStatus( Enum481MoneyLaunderingStatus.PASSED );
        assertEquals( Enum481MoneyLaunderingStatus.PASSED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         *  N, types
         */
        tagData = new Tag481EnuMoneyLaunderingStatus( Enum481MoneyLaunderingStatus.NOT_CHECKED );
        assertEquals( Enum481MoneyLaunderingStatus.NOT_CHECKED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         * 1-3, types
         */
        tagData = new Tag481EnuMoneyLaunderingStatus( Enum481MoneyLaunderingStatus.EXEMPT_BELOW_LIMIT );
        assertEquals( Enum481MoneyLaunderingStatus.EXEMPT_BELOW_LIMIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag481EnuMoneyLaunderingStatus( Enum481MoneyLaunderingStatus.EXEMPT_CLIENT_MONEY );
        assertEquals( Enum481MoneyLaunderingStatus.EXEMPT_CLIENT_MONEY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag481EnuMoneyLaunderingStatus( Enum481MoneyLaunderingStatus.EXEMPT_AUTHORISED );
        assertEquals( Enum481MoneyLaunderingStatus.EXEMPT_AUTHORISED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag481EnuMoneyLaunderingStatus tagData;

        // loop around the ENUM and process
        for ( Enum481MoneyLaunderingStatus oneEnum : Enum481MoneyLaunderingStatus.values()) {
            tagData = new Tag481EnuMoneyLaunderingStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag481EnuMoneyLaunderingStatus tagData;

        // loop around the ENUM and process
        for (Enum481MoneyLaunderingStatus oneEnum : Enum481MoneyLaunderingStatus.values()) {
            tagData = new Tag481EnuMoneyLaunderingStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag481EnuMoneyLaunderingStatus tagData;

        // loop around the ENUM and process
        for (Enum481MoneyLaunderingStatus oneEnum : Enum481MoneyLaunderingStatus.values()) {
            tagData = new Tag481EnuMoneyLaunderingStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag481EnuMoneyLaunderingStatus tagData;

        // loop around the ENUM and process
        for (Enum481MoneyLaunderingStatus oneEnum : Enum481MoneyLaunderingStatus.values()) {
            tagData = new Tag481EnuMoneyLaunderingStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag481EnuMoneyLaunderingStatus tagData;

        // loop around the ENUM and process
        for (Enum481MoneyLaunderingStatus oneEnum : Enum481MoneyLaunderingStatus.values()) {
            tagData = new Tag481EnuMoneyLaunderingStatus(oneEnum);
            assertEquals( "Tag481EnuMoneyLaunderingStatus\n" +
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