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
import com.hwtsllc.fixengine2022.fix44.enums.Enum750TradeRequestStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  750
 *  TradeRequestStatus
 *  int
 *  <p></p>
 *  Status of Trade Request.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Accepted
 *  <p>    1 - Completed
 *  <p>    2 - Rejected
 */
class Tag750EnuTradeRequestStatusTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX750_ENU_TRADE_REQUEST_STATUS;
        assertEquals( "750", fixData.toEnumIDString());
        assertEquals( "TRADE_REQUEST_STATUS", fixData.toEnumNameString());
        assertEquals( "TradeRequestStatus", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0750Test() {
        Tag750EnuTradeRequestStatus tagData;
        Enum750TradeRequestStatus oneElement;

        oneElement = Enum750TradeRequestStatus.ACCEPTED;
        tagData = new Tag750EnuTradeRequestStatus( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "750", tagData.toEnumIDString());
        assertEquals( "TRADE_REQUEST_STATUS", tagData.toEnumNameString());
        assertEquals( "TradeRequestStatus", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag750EnuTradeRequestStatus(Enum750TradeRequestStatus.COMPLETED);
        assertEquals( Enum750TradeRequestStatus.COMPLETED.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag750EnuTradeRequestStatus(Enum750TradeRequestStatus.REJECTED);
        assertEquals( Enum750TradeRequestStatus.REJECTED.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag750EnuTradeRequestStatus tagData;

        // loop around the ENUM and process
        for ( Enum750TradeRequestStatus oneEnum : Enum750TradeRequestStatus.values()) {
            tagData = new Tag750EnuTradeRequestStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag750EnuTradeRequestStatus tagData;

        // loop around the ENUM and process
        for (Enum750TradeRequestStatus oneEnum : Enum750TradeRequestStatus.values()) {
            tagData = new Tag750EnuTradeRequestStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag750EnuTradeRequestStatus tagData;

        // loop around the ENUM and process
        for (Enum750TradeRequestStatus oneEnum : Enum750TradeRequestStatus.values()) {
            tagData = new Tag750EnuTradeRequestStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag750EnuTradeRequestStatus tagData;

        // loop around the ENUM and process
        for (Enum750TradeRequestStatus oneEnum : Enum750TradeRequestStatus.values()) {
            tagData = new Tag750EnuTradeRequestStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag750EnuTradeRequestStatus tagData;

        // loop around the ENUM and process
        for (Enum750TradeRequestStatus oneEnum : Enum750TradeRequestStatus.values()) {
            tagData = new Tag750EnuTradeRequestStatus(oneEnum);
            assertEquals( "Tag750EnuTradeRequestStatus\n" +
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