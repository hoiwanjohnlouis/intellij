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

import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  195
 *  LastForwardPoints
 *  PriceOffset
 *  <p></p>
 *  F/X forward points added to LastSpotRate (94).
 *  May be a negative value. Expressed in decimal form.
 *  <p></p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
class Tag195PxoLastForwardPointsTest {
    @Test
    void PrintTest() {
        Tag195PxoLastForwardPoints tagData;
        double oneElement;

        oneElement = Tag195PxoLastForwardPoints.TESTA_PXO_LAST_FORWARD_POINTS;
        tagData = new Tag195PxoLastForwardPoints( new MyPriceOffsetType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag195PxoLastForwardPoints.TESTB_PXO_LAST_FORWARD_POINTS;
        tagData = new Tag195PxoLastForwardPoints( new MyPriceOffsetType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag195PxoLastForwardPoints tagData;
        double oneElement;

        oneElement = Tag195PxoLastForwardPoints.TESTA_PXO_LAST_FORWARD_POINTS;
        tagData = new Tag195PxoLastForwardPoints( new MyPriceOffsetType( oneElement ));
        verifyAll( tagData, oneElement );

        oneElement = Tag195PxoLastForwardPoints.TESTB_PXO_LAST_FORWARD_POINTS;
        tagData = new Tag195PxoLastForwardPoints( new MyPriceOffsetType( oneElement ));
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag195PxoLastForwardPoints tagData, final double oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag195PxoLastForwardPoints tagData ) {
        assertEquals( "FIX195_PXO_LAST_FORWARD_POINTS", tagData.toEnumLabelString());
        assertEquals( "195", tagData.toEnumIDString());
        assertEquals( "LAST_FORWARD_POINTS", tagData.toEnumNameString());
        assertEquals( "LastForwardPoints", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag195PxoLastForwardPoints tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag195PxoLastForwardPoints tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag195PxoLastForwardPoints tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag195PxoLastForwardPoints tagData ) {
        assertEquals( "Tag195PxoLastForwardPoints\n" +
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