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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum854QtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  854
 *  QtyType
 *  int
 *  <p></p>
 *  Type of quantity specified in a quantity field:
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Units (shares, par, currency)
 *  <p>    1 - Contracts (if used - must specify ContractMultiplier (tag 231))
 *  <p>    2 - Units of Measure per Time Unit
 *          (if used - must specify UnitofMeasure (tag 996) and TimeUnit (tag 997))
 */
class Tag854EnuQtyTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX854_ENU_QTY_TYPE;
        assertEquals( "854", fixData.toFIXIDString());
        assertEquals( "QTY_TYPE", fixData.toFIXNameString());
        assertEquals( "QtyType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0854Test() {
        Tag854EnuQtyType tagData;
        Enum854QtyType oneElement;

        oneElement = Enum854QtyType.UNITS;
        tagData = new Tag854EnuQtyType( oneElement );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "854", tagData.toFIXIDString());
        assertEquals( "QTY_TYPE", tagData.toFIXNameString());
        assertEquals( "QtyType", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag854EnuQtyType( Enum854QtyType.CONTRACTS );
        assertEquals( Enum854QtyType.CONTRACTS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag854EnuQtyType( Enum854QtyType.MEASURE_PER_TIME );
        assertEquals( Enum854QtyType.MEASURE_PER_TIME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag854EnuQtyType tagData;

        // loop around the ENUM and process
        for ( Enum854QtyType oneEnum : Enum854QtyType.values()) {
            tagData = new Tag854EnuQtyType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag854EnuQtyType tagData;

        // loop around the ENUM and process
        for (Enum854QtyType oneEnum : Enum854QtyType.values()) {
            tagData = new Tag854EnuQtyType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag854EnuQtyType tagData;

        // loop around the ENUM and process
        for (Enum854QtyType oneEnum : Enum854QtyType.values()) {
            tagData = new Tag854EnuQtyType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag854EnuQtyType tagData;

        // loop around the ENUM and process
        for (Enum854QtyType oneEnum : Enum854QtyType.values()) {
            tagData = new Tag854EnuQtyType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag854EnuQtyType tagData;

        // loop around the ENUM and process
        for (Enum854QtyType oneEnum : Enum854QtyType.values()) {
            tagData = new Tag854EnuQtyType(oneEnum);
            assertEquals( "Tag854EnuQtyType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}