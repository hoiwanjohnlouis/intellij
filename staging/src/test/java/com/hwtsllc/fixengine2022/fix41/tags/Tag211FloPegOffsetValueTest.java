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

import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  211
 *  PegOffsetValue
 *  float
 *  <p></p>
 *  Amount (signed) added to the peg for a pegged order in the context of the PegOffsetType (836)
 *  <p></p>
 *  (Prior to FIX 4.4 this field was of type PriceOffset)
 */
class Tag211FloPegOffsetValueTest {
    Tag211FloPegOffsetValue tagData;
    float [] TestArray = {
            Tag211FloPegOffsetValue.TESTA_FLO_PEG_DIFFERENCE,
            Tag211FloPegOffsetValue.TESTB_FLO_PEG_DIFFERENCE
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag211FloPegOffsetValue( new MyFloatType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag211FloPegOffsetValue( new MyFloatType( oneElement ));
            assertEquals( "FIX211_FLO_PEG_DIFFERENCE", tagData.toEnumLabelString());
            assertEquals( "211", tagData.toEnumIDString());
            assertEquals( "PEG_DIFFERENCE", tagData.toEnumNameString());
            assertEquals( "PegDifference", tagData.toEnumDescriptionString());
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
            tagData = new Tag211FloPegOffsetValue( new MyFloatType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag211FloPegOffsetValue( new MyFloatType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag211FloPegOffsetValue( new MyFloatType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag211FloPegOffsetValue( new MyFloatType( oneElement ));
            assertEquals( "Tag211FloPegOffsetValue\n" +
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