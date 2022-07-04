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
import com.hwtsllc.fixengine2022.fix42.enums.Enum286OpenCLoseSettlFlag;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  286
 *  OpenCloseSettleFlag
 *  MultipleCharValue
 *  <p>
 *  Flag that identifies a market data entry. (Prior to FIX 4.3 this field was of type char)
 *  <p></p>
 *  Valid values:
 *  <p>    0-5 msg types
 *  <p>    "0 - Daily Open / Close / Settlement entry"
 *  <p>    "1 - Session Open / Close / Settlement entry"
 *  <p>    "2 - Delivery Settlement entry"
 *  <p>    "3 - Expected entry"
 *  <p>    "4 - Entry from previous business day"
 *  <p>    "5 - Theoretical Price value"
 */
class Tag286EnuOpenCloseSettleFlagTest {
    @Test
    void FIX0286Test() {
        FIX42 fixData = FIX42.FIX286_ENU_OPEN_CLOSE_SETTLE_FLAG;
        assertEquals( "286", fixData.toEnumIDString());
        assertEquals( "OPEN_CLOSE_SETTLE_FLAG", fixData.toEnumNameString());
        assertEquals( "OpenCloseSettleFlag", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0286Test() {
        Tag286EnuOpenCloseSettleFlag tagData;

        /*
         * 0-5 msg types
         */
        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT);
        assertEquals( Enum286OpenCLoseSettlFlag.DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT);
        assertEquals( Enum286OpenCLoseSettlFlag.SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.DELIVERY_SETTLEMENT);
        assertEquals( Enum286OpenCLoseSettlFlag.DELIVERY_SETTLEMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.EXPECTED);
        assertEquals( Enum286OpenCLoseSettlFlag.EXPECTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.PREVIOUS_BUSINESS_DAY);
        assertEquals( Enum286OpenCLoseSettlFlag.PREVIOUS_BUSINESS_DAY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag.THEORETICAL_PRICE_VALUE);
        assertEquals( Enum286OpenCLoseSettlFlag.THEORETICAL_PRICE_VALUE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag286EnuOpenCloseSettleFlag tagData;

        // loop around the ENUM and process
        for (Enum286OpenCLoseSettlFlag oneEnum : Enum286OpenCLoseSettlFlag.values()) {
            tagData = new Tag286EnuOpenCloseSettleFlag(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag286EnuOpenCloseSettleFlag tagData;

        // loop around the ENUM and process
        for (Enum286OpenCLoseSettlFlag oneEnum : Enum286OpenCLoseSettlFlag.values()) {
            tagData = new Tag286EnuOpenCloseSettleFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag286EnuOpenCloseSettleFlag tagData;

        // loop around the ENUM and process
        for (Enum286OpenCLoseSettlFlag oneEnum : Enum286OpenCLoseSettlFlag.values()) {
            tagData = new Tag286EnuOpenCloseSettleFlag(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag286EnuOpenCloseSettleFlag tagData;

        // loop around the ENUM and process
        for (Enum286OpenCLoseSettlFlag oneEnum : Enum286OpenCLoseSettlFlag.values()) {
            tagData = new Tag286EnuOpenCloseSettleFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag286EnuOpenCloseSettleFlag tagData;

        // loop around the ENUM and process
        for (Enum286OpenCLoseSettlFlag oneEnum : Enum286OpenCLoseSettlFlag.values()) {
            tagData = new Tag286EnuOpenCloseSettleFlag(oneEnum);
            assertEquals( "Tag286EnuOpenCloseSettleFlag\n" +
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