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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  520
 *  ContAmtValue
 *  float
 *  <p></p>
 *  Value of Contract Amount,
 *  <p></p>
 *  e.g. a financial amount or percentage as indicated by ContAmtType (519).
 */
class Tag520FloContAmtValueTest {
    Tag520FloContAmtValue tagData;
    float [] TestArray = {
            Tag520FloContAmtValue.TESTA_FLO_CONT_AMT_VALUE,
            Tag520FloContAmtValue.TESTB_FLO_CONT_AMT_VALUE
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ));
            assertEquals( "FIX520_FLO_CONT_AMT_VALUE", tagData.toEnumLabelString());
            assertEquals( "520", tagData.toEnumIDString());
            assertEquals( "CONT_AMT_VALUE", tagData.toEnumNameString());
            assertEquals( "ContAmtValue", tagData.toEnumDescriptionString());
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
            tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_FLO_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag520FloContAmtValue( new MyFloatType( oneElement ));
            assertEquals( "Tag520FloContAmtValue\n" +
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