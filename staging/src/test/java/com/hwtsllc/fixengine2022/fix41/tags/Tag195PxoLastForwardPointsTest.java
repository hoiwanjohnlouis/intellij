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

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyPriceOffsetType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  195
 *  LastForwardPoints
 *  PriceOffset
 *  <p>
 *  F/X forward points added to LastSpotRate (94).
 *  May be a negative value. Expressed in decimal form.
 *  <p>
 *  For example, 61.99 points is expressed and sent as 0.006199
 */
class Tag195PxoLastForwardPointsTest {
    @Test
    void FIX0195Test() {
        FIX41 fixData = FIX41.FIX195_PXO_LAST_FORWARD_POINTS;
        assertEquals( "195", fixData.toEnumIDString());
        assertEquals( "LAST_FORWARD_POINTS", fixData.toEnumNameString());
        assertEquals( "LastForwardPoints", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0195Test() {
        Tag195PxoLastForwardPoints tagData;

        tagData = new Tag195PxoLastForwardPoints(
                new MyPriceOffsetType(Tag195PxoLastForwardPoints.TESTA_PXO_LAST_FORWARD_POINTS));
        assertEquals( Tag195PxoLastForwardPoints.TESTA_PXO_LAST_FORWARD_POINTS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag195PxoLastForwardPoints(
                new MyPriceOffsetType(Tag195PxoLastForwardPoints.TESTB_PXO_LAST_FORWARD_POINTS));
        assertEquals( Tag195PxoLastForwardPoints.TESTB_PXO_LAST_FORWARD_POINTS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PXO_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag195PxoLastForwardPoints tagData;

        tagData = new Tag195PxoLastForwardPoints(
                new MyPriceOffsetType(Tag195PxoLastForwardPoints.TESTB_PXO_LAST_FORWARD_POINTS));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag195PxoLastForwardPoints tagData;

        tagData = new Tag195PxoLastForwardPoints(
                new MyPriceOffsetType(Tag195PxoLastForwardPoints.TESTB_PXO_LAST_FORWARD_POINTS));
        assertEquals( Tag195PxoLastForwardPoints.TESTB_PXO_LAST_FORWARD_POINTS, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PRC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag195PxoLastForwardPoints tagData;

        tagData = new Tag195PxoLastForwardPoints(
                new MyPriceOffsetType(Tag195PxoLastForwardPoints.TESTB_PXO_LAST_FORWARD_POINTS));
        assertEquals( tagData.toEnumIDString() + "=" + Tag195PxoLastForwardPoints.TESTB_PXO_LAST_FORWARD_POINTS,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag195PxoLastForwardPoints tagData;

        tagData = new Tag195PxoLastForwardPoints(
                new MyPriceOffsetType(Tag195PxoLastForwardPoints.TESTB_PXO_LAST_FORWARD_POINTS));
        assertEquals( String.valueOf(Tag195PxoLastForwardPoints.TESTB_PXO_LAST_FORWARD_POINTS),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag195PxoLastForwardPoints tagData;

        tagData = new Tag195PxoLastForwardPoints(
                new MyPriceOffsetType(Tag195PxoLastForwardPoints.TESTA_PXO_LAST_FORWARD_POINTS));
        assertEquals( "Tag195PxoLastForwardPoints\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag195PxoLastForwardPoints.TESTA_PXO_LAST_FORWARD_POINTS + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" +
                                            Tag195PxoLastForwardPoints.TESTA_PXO_LAST_FORWARD_POINTS + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}