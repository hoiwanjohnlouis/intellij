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

import com.hwtsllc.fix.datatypes.MyAmtType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  900
 *  TotalNetValue
 *  Amt
 *  <p></p>
 *  TotalNetValue is determined as follows:
 *  <p></p>
 *  At the initial collateral assignment TotalNetValue is the sum of
 *  (UnderlyingStartValue * (1-haircut)).
 *  <p></p>
 *  In a collateral substitution TotalNetValue is the sum of
 *  (UnderlyingCurrentValue * (1-haircut)).
 *  <p></p>
 *  For listed derivatives clearing margin management,
 *  this is the collateral value which equals
 *  (Market value * haircut)
 */
class Tag900AmtTotalNetValueTest {
    Tag900AmtTotalNetValue tagData;
    double [] TestArray = {
            Tag900AmtTotalNetValue.TESTA_AMT_TOTAL_NET_VALUE,
            Tag900AmtTotalNetValue.TESTB_AMT_TOTAL_NET_VALUE
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ));
            assertEquals( "FIX900_AMT_TOTAL_NET_VALUE", tagData.toFIXLabelString());
            assertEquals( "900", tagData.toFIXIDString());
            assertEquals( "TOTAL_NET_VALUE", tagData.toFIXNameString());
            assertEquals( "TotalNetValue", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ));
            assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ));
            assertEquals( String.valueOf( oneElement ), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( double oneElement : TestArray ) {
            tagData = new Tag900AmtTotalNetValue( new MyAmtType( oneElement ));
            assertEquals( "Tag900AmtTotalNetValue\n" +
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