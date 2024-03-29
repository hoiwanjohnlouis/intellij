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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.enums.fix42.Enum286OpenCLoseSettlFlag;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag286EnuOpenCloseSettleFlagTest {
    Tag286EnuOpenCloseSettleFlag tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum286OpenCLoseSettlFlag oneEnum : Enum286OpenCLoseSettlFlag.values()) {
            tagData = new Tag286EnuOpenCloseSettleFlag(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum286OpenCLoseSettlFlag oneEnum : Enum286OpenCLoseSettlFlag.values()) {
            tagData = new Tag286EnuOpenCloseSettleFlag(oneEnum);
            assertEquals( "FIX286_ENU_OPEN_CLOSE_SETTLE_FLAG", tagData.toFIXLabelString());
            assertEquals( "286", tagData.toFIXIDString());
            assertEquals( "OPEN_CLOSE_SETTLE_FLAG", tagData.toFIXNameString());
            assertEquals( "OpenCloseSettleFlag", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum286OpenCLoseSettlFlag oneEnum : Enum286OpenCLoseSettlFlag.values()) {
            tagData = new Tag286EnuOpenCloseSettleFlag(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  286
         *  OpenCloseSettleFlag
         *  MultipleCharValue
         *  <p>    0-5 msg types
         *  <p>    "0 - Daily Open / Close / Settlement entry"
         *  <p>    "1 - Session Open / Close / Settlement entry"
         *  <p>    "2 - Delivery Settlement entry"
         *  <p>    "3 - Expected entry"
         *  <p>    "4 - Entry from previous business day"
         */
        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.DELIVERY_SETTLEMENT);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.EXPECTED);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.PREVIOUS_BUSINESS_DAY);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "5 - Theoretical Price value"
         */
        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.THEORETICAL_PRICE_VALUE);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum286OpenCLoseSettlFlag oneEnum : Enum286OpenCLoseSettlFlag.values()) {
            tagData = new Tag286EnuOpenCloseSettleFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum286OpenCLoseSettlFlag oneEnum : Enum286OpenCLoseSettlFlag.values()) {
            tagData = new Tag286EnuOpenCloseSettleFlag(oneEnum);
            assertEquals( "Tag286EnuOpenCloseSettleFlag\n" +
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