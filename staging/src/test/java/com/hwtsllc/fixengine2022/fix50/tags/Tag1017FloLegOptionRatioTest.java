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

import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1017
 *  LegOptionRatio
 *  float
 *  <p>
 *  Expresses the risk of an option leg
 *  <p></p>
 *  Value must be between -1 and 1.
 *  <p></p>
 *  A Call Option will require a ratio value between 0 and 1
 *  <p></p>
 *  A Put Option will require a ratio value between -1 and 0
 */
class Tag1017FloLegOptionRatioTest {
    Tag1017FloLegOptionRatio tagData;
    float [] TestArray = {
            Tag1017FloLegOptionRatio.TESTA_FLO_LEG_OPTION_RATIO,
            Tag1017FloLegOptionRatio.TESTB_FLO_LEG_OPTION_RATIO
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag1017FloLegOptionRatio( new MyFloatType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag1017FloLegOptionRatio( new MyFloatType( oneElement ));
            assertEquals( "FIX1017_FLO_LEG_OPTION_RATIO", tagData.toEnumLabelString());
            assertEquals( "1017", tagData.toEnumIDString());
            assertEquals( "LEG_OPTION_RATIO", tagData.toEnumNameString());
            assertEquals( "LegOptionRatio", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag1017FloLegOptionRatio( new MyFloatType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag1017FloLegOptionRatio( new MyFloatType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag1017FloLegOptionRatio( new MyFloatType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag1017FloLegOptionRatio( new MyFloatType( oneElement ));
            assertEquals( "Tag1017FloLegOptionRatio\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}