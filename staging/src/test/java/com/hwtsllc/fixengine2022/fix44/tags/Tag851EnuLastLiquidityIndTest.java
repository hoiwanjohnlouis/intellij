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

import com.hwtsllc.fixengine2022.fix44.enums.Enum851LastLiquidityInd;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag851EnuLastLiquidityIndTest {
    Tag851EnuLastLiquidityInd tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum851LastLiquidityInd oneEnum : Enum851LastLiquidityInd.values()) {
            tagData = new Tag851EnuLastLiquidityInd(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum851LastLiquidityInd oneEnum : Enum851LastLiquidityInd.values()) {
            tagData = new Tag851EnuLastLiquidityInd(oneEnum);
            assertEquals( "FIX851_ENU_LAST_LIQUIDITY_IND", tagData.toFIXLabelString());
            assertEquals( "851", tagData.toFIXIDString());
            assertEquals( "LAST_LIQUIDITY_IND", tagData.toEnumNameString());
            assertEquals( "LastLiquidityInd", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum851LastLiquidityInd oneEnum : Enum851LastLiquidityInd.values()) {
            tagData = new Tag851EnuLastLiquidityInd(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  851
         *  LastLiquidityInd
         *  int
         *  <p>    1 - Added Liquidity
         *  <p>    2 - Removed Liquidity
         *  <p>    3 - Liquidity Routed Out
         */
        tagData = new Tag851EnuLastLiquidityInd( Enum851LastLiquidityInd.ADDED );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag851EnuLastLiquidityInd( Enum851LastLiquidityInd.REMOVED );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag851EnuLastLiquidityInd( Enum851LastLiquidityInd.ROUTED_OUT );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum851LastLiquidityInd oneEnum : Enum851LastLiquidityInd.values()) {
            tagData = new Tag851EnuLastLiquidityInd(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum851LastLiquidityInd oneEnum : Enum851LastLiquidityInd.values()) {
            tagData = new Tag851EnuLastLiquidityInd(oneEnum);
            assertEquals( "Tag851EnuLastLiquidityInd\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
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