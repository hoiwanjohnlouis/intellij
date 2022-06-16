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
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
import com.hwtsllc.fixengine2022.fix44.enums.Enum851LastLiquidityInd;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  851
 *  LastLiquidityInd
 *  int
 *  <p></p>
 *  Indicator to identify whether this fill was a result of a liquidity provider providing
 *  or liquidity taker taking the liquidity.
 *  <p></p>
 *  Applicable only for OrdStatus of Partial or Filled.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Added Liquidity
 *  <p>    2 - Removed Liquidity
 *  <p>    3 - Liquidity Routed Out
 */
class Tag851EnuLastLiquidityIndTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX851_ENU_LAST_LIQUIDITY_IND;
        assertEquals( "851", fixData.toFIXIDString());
        assertEquals( "LAST_LIQUIDITY_IND", fixData.toFIXNameString());
        assertEquals( "LastLiquidityInd", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0851Test() {
        Tag851EnuLastLiquidityInd tagData;
        Enum665ConfirmStatus oneElement;

        tagData = new Tag851EnuLastLiquidityInd( Enum851LastLiquidityInd.ADDED );
        assertEquals( Enum851LastLiquidityInd.ADDED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "851", fixData.toFIXIDString());
        assertEquals( "LAST_LIQUIDITY_IND", fixData.toFIXNameString());
        assertEquals( "LastLiquidityInd", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        tagData = new Tag851EnuLastLiquidityInd( Enum851LastLiquidityInd.REMOVED );
        assertEquals( Enum851LastLiquidityInd.REMOVED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag851EnuLastLiquidityInd( Enum851LastLiquidityInd.ROUTED_OUT );
        assertEquals( Enum851LastLiquidityInd.ROUTED_OUT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag851EnuLastLiquidityInd tagData;

        // loop around the ENUM and process
        for ( Enum851LastLiquidityInd oneEnum : Enum851LastLiquidityInd.values()) {
            tagData = new Tag851EnuLastLiquidityInd(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag851EnuLastLiquidityInd tagData;

        // loop around the ENUM and process
        for (Enum851LastLiquidityInd oneEnum : Enum851LastLiquidityInd.values()) {
            tagData = new Tag851EnuLastLiquidityInd(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag851EnuLastLiquidityInd tagData;

        // loop around the ENUM and process
        for (Enum851LastLiquidityInd oneEnum : Enum851LastLiquidityInd.values()) {
            tagData = new Tag851EnuLastLiquidityInd(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag851EnuLastLiquidityInd tagData;

        // loop around the ENUM and process
        for (Enum851LastLiquidityInd oneEnum : Enum851LastLiquidityInd.values()) {
            tagData = new Tag851EnuLastLiquidityInd(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag851EnuLastLiquidityInd tagData;

        // loop around the ENUM and process
        for (Enum851LastLiquidityInd oneEnum : Enum851LastLiquidityInd.values()) {
            tagData = new Tag851EnuLastLiquidityInd(oneEnum);
            assertEquals( "Tag851EnuLastLiquidityInd\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}