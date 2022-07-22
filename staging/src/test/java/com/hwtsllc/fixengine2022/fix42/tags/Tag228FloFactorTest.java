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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  228
 *  Factor
 *  float
 *  <p></p>
 *  For Fixed Income: Amortization Factor for deriving Current face from Original face for
 *  ABS or MBS securities, note the fraction may be greater than, equal to or less than .
 *  <p></p>
 *  In TIPS securities this is the Inflation index.
 *  <p></p>
 *  Qty * Factor * Price = Gross Trade Amount
 *  <p></p>
 *  For Derivatives: Contract Value Factor by which price must be adjusted
 *  to determine the true nominal value of one futures/options contract.
 *  <p></p>
 *  (Qty * Price) * Factor = Nominal Value
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag228FloFactorTest {
    @Test
    void PrintTest() {
        Tag228FloFactor tagData;
        float oneElement;

        oneElement = Tag228FloFactor.TESTA_FLO_FACTOR;
        tagData = new Tag228FloFactor( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag228FloFactor.TESTB_FLO_FACTOR;
        tagData = new Tag228FloFactor( new MyFloatType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag228FloFactor tagData;
        float oneElement;

        oneElement = Tag228FloFactor.TESTA_FLO_FACTOR;
        tagData = new Tag228FloFactor( new MyFloatType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag228FloFactor.TESTB_FLO_FACTOR;
        tagData = new Tag228FloFactor( new MyFloatType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag228FloFactor tagData, final float oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag228FloFactor tagData ) {
        assertEquals( "FIX228_FLO_FACTOR", tagData.toEnumLabelString());
        assertEquals( "228", tagData.toEnumIDString());
        assertEquals( "FACTOR", tagData.toEnumNameString());
        assertEquals( "Factor", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag228FloFactor tagData, final float oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag228FloFactor tagData, final float oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag228FloFactor tagData, final float oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag228FloFactor tagData ) {
        assertEquals( "Tag228FloFactor\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}