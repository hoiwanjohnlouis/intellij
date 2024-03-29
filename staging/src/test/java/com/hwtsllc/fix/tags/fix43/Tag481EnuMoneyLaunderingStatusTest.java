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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.enums.fix43.Enum481MoneyLaunderingStatus;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag481EnuMoneyLaunderingStatusTest {
    Tag481EnuMoneyLaunderingStatus tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum481MoneyLaunderingStatus oneEnum : Enum481MoneyLaunderingStatus.values()) {
            tagData = new Tag481EnuMoneyLaunderingStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum481MoneyLaunderingStatus oneEnum : Enum481MoneyLaunderingStatus.values()) {
            tagData = new Tag481EnuMoneyLaunderingStatus(oneEnum);
            assertEquals( "FIX481_ENU_MONEY_LAUNDERING_STATUS", tagData.toFIXLabelString());
            assertEquals( "481", tagData.toFIXIDString());
            assertEquals( "MONEY_LAUNDERING_STATUS", tagData.toFIXNameString());
            assertEquals( "MoneyLaunderingStatus", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum481MoneyLaunderingStatus oneEnum : Enum481MoneyLaunderingStatus.values()) {
            tagData = new Tag481EnuMoneyLaunderingStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  481
         *  MoneyLaunderingStatus
         *  char
         *  <p>    Y - Passed
         *  <p>    N - Not Checked
         */
        tagData = new Tag481EnuMoneyLaunderingStatus( Enum481MoneyLaunderingStatus.PASSED );
        assertEquals( "Y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag481EnuMoneyLaunderingStatus( Enum481MoneyLaunderingStatus.NOT_CHECKED );
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    1 - Exempt - Below the Limit
         *  <p>    2 - Exempt - Client Money Type exemption
         *  <p>    3 - Exempt - Authorised Credit or financial institution
         */
        tagData = new Tag481EnuMoneyLaunderingStatus( Enum481MoneyLaunderingStatus.EXEMPT_BELOW_LIMIT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag481EnuMoneyLaunderingStatus( Enum481MoneyLaunderingStatus.EXEMPT_CLIENT_MONEY );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag481EnuMoneyLaunderingStatus( Enum481MoneyLaunderingStatus.EXEMPT_AUTHORISED );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum481MoneyLaunderingStatus oneEnum : Enum481MoneyLaunderingStatus.values()) {
            tagData = new Tag481EnuMoneyLaunderingStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum481MoneyLaunderingStatus oneEnum : Enum481MoneyLaunderingStatus.values()) {
            tagData = new Tag481EnuMoneyLaunderingStatus(oneEnum);
            assertEquals( "Tag481EnuMoneyLaunderingStatus\n" +
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