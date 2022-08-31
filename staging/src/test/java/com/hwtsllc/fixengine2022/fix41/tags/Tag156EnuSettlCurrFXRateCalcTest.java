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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.MyEnumFXRateCalc;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag156EnuSettlCurrFXRateCalcTest {
    Tag156EnuSettlCurrFXRateCalc tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumFXRateCalc oneEnum : MyEnumFXRateCalc.values()) {
            tagData = new Tag156EnuSettlCurrFXRateCalc(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumFXRateCalc oneEnum : MyEnumFXRateCalc.values()) {
            tagData = new Tag156EnuSettlCurrFXRateCalc(oneEnum);
            assertEquals( "FIX156_SETTL_CURR_FX_RATE_CALC", tagData.toEnumLabelString());
            assertEquals( "156", tagData.toEnumIDString());
            assertEquals( "SETTL_CURR_FX_RATE_CALC", tagData.toEnumNameString());
            assertEquals( "SettlCurrFxRateCalc", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumFXRateCalc oneEnum : MyEnumFXRateCalc.values()) {
            tagData = new Tag156EnuSettlCurrFXRateCalc(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  156 (same as 156, 1046,)
         *  SettlCurrFxRateCalc
         *  char
         *  <p>    M - Multiply
         *  <p>    D - Divide
         */
        tagData = new Tag156EnuSettlCurrFXRateCalc(MyEnumFXRateCalc.MULTIPLY);
        assertEquals( "M", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag156EnuSettlCurrFXRateCalc(MyEnumFXRateCalc.DIVIDE);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (MyEnumFXRateCalc oneEnum : MyEnumFXRateCalc.values()) {
            tagData = new Tag156EnuSettlCurrFXRateCalc(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumFXRateCalc oneEnum : MyEnumFXRateCalc.values()) {
            tagData = new Tag156EnuSettlCurrFXRateCalc(oneEnum);
            assertEquals( "Tag156EnuSettlCurrFXRateCalc\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
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