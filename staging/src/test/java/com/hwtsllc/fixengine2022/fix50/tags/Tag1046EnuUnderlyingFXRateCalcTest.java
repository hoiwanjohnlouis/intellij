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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyEnumFXRateCalc;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  156 (same as 156, 1046,)
 *  SettlCurrFxRateCalc
 *  char
 *  <p>
 *  Specifies whether or not SettlCurrFxRate (55) should be multiplied or divided.
 *  <p></p>
 *  1046
 *  UnderlyingFXRateCalc
 *  char
 *  <p>
 *  Specifies whether the UnderlyingFxRate (1045) should be multiplied or divided.
 *  <p></p>
 *  Valid values:
 *  <p></p>
 *  <p>    M - Multiply
 *  <p>    D - Divide
 */
class Tag1046EnuUnderlyingFXRateCalcTest {
    @Test
    void FIX1046Test() {
        FIX50 fixData = FIX50.FIX1046_ENU_UNDERLYING_FX_RATE_CALC;
        assertEquals( "1046", fixData.toEnumIDString());
        assertEquals( "UNDERLYING_FX_RATE_CALC", fixData.toEnumNameString());
        assertEquals( "UnderlyingFXRateCalc", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1046Test() {
        Tag1046EnuUnderlyingFXRateCalc tagData;

        tagData = new Tag1046EnuUnderlyingFXRateCalc(MyEnumFXRateCalc.MULTIPLY);
        assertEquals( MyEnumFXRateCalc.MULTIPLY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1046EnuUnderlyingFXRateCalc(MyEnumFXRateCalc.DIVIDE);
        assertEquals( MyEnumFXRateCalc.DIVIDE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1046EnuUnderlyingFXRateCalc tagData;

        // loop around the ENUM and process
        for ( MyEnumFXRateCalc oneEnum : MyEnumFXRateCalc.values()) {
            tagData = new Tag1046EnuUnderlyingFXRateCalc(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1046EnuUnderlyingFXRateCalc tagData;

        // loop around the ENUM and process
        for (MyEnumFXRateCalc oneEnum : MyEnumFXRateCalc.values()) {
            tagData = new Tag1046EnuUnderlyingFXRateCalc(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1046EnuUnderlyingFXRateCalc tagData;

        // loop around the ENUM and process
        for (MyEnumFXRateCalc oneEnum : MyEnumFXRateCalc.values()) {
            tagData = new Tag1046EnuUnderlyingFXRateCalc(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1046EnuUnderlyingFXRateCalc tagData;

        // loop around the ENUM and process
        for (MyEnumFXRateCalc oneEnum : MyEnumFXRateCalc.values()) {
            tagData = new Tag1046EnuUnderlyingFXRateCalc(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1046EnuUnderlyingFXRateCalc tagData;

        // loop around the ENUM and process
        for (MyEnumFXRateCalc oneEnum : MyEnumFXRateCalc.values()) {
            tagData = new Tag1046EnuUnderlyingFXRateCalc(oneEnum);
            assertEquals( "Tag1046EnuUnderlyingFXRateCalc\n" +
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