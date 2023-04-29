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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.MyCurrencyType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag676CcyLegBenchmarkCurveCurrencyTest {
    Tag676CcyLegBenchmarkCurveCurrency tagData;
    String [] TestArray = {
            Tag676CcyLegBenchmarkCurveCurrency.TESTA_CCY_LEG_BENCHMARK_CURVE_CURRENCY,
            Tag676CcyLegBenchmarkCurveCurrency.TESTB_CCY_LEG_BENCHMARK_CURVE_CURRENCY
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ));
            assertEquals( "FIX676_CCY_LEG_BENCHMARK_CURVE_CURRENCY", tagData.toFIXLabelString());
            assertEquals( "676", tagData.toFIXIDString());
            assertEquals( "LEG_BENCHMARK_CURVE_CURRENCY", tagData.toFIXNameString());
            assertEquals( "LegBenchmarkCurveCurrency", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ));
            assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  676
         *  LegBenchmarkCurveCurrency
         *  Currency
         */

        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ));
            assertEquals( oneElement, tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag676CcyLegBenchmarkCurveCurrency( new MyCurrencyType( oneElement ));
            assertEquals( "Tag676CcyLegBenchmarkCurveCurrency\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}