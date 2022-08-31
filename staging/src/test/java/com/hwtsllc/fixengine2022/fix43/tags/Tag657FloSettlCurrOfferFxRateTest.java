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

class Tag657FloSettlCurrOfferFxRateTest {
    Tag657FloSettlCurrOfferFxRate tagData;
    float [] TestArray = {
            Tag657FloSettlCurrOfferFxRate.TESTA_FLO_SETTL_CURR_OFFER_FX_RATE,
            Tag657FloSettlCurrOfferFxRate.TESTB_FLO_SETTL_CURR_OFFER_FX_RATE
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag657FloSettlCurrOfferFxRate( new MyFloatType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag657FloSettlCurrOfferFxRate( new MyFloatType( oneElement ));
            assertEquals( "FIX657_FLO_SETTL_CURR_OFFER_FX_RATE", tagData.toEnumLabelString());
            assertEquals( "657", tagData.toEnumIDString());
            assertEquals( "SETTL_CURR_OFFER_FX_RATE", tagData.toEnumNameString());
            assertEquals( "SettlCurrOfferFxRate", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag657FloSettlCurrOfferFxRate( new MyFloatType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  657
         *  SettlCurrOfferFxRate
         *  float
         */

        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag657FloSettlCurrOfferFxRate( new MyFloatType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( float oneElement : TestArray ) {
            tagData = new Tag657FloSettlCurrOfferFxRate( new MyFloatType( oneElement ));
            assertEquals( "Tag657FloSettlCurrOfferFxRate\n" +
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