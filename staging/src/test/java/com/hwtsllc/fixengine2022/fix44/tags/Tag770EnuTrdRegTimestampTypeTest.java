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
import com.hwtsllc.fixengine2022.fix44.enums.Enum770TrdRegTimestampType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  770
 *  TrdRegTimestampType
 *  int
 *  <p></p>
 *  Traded / Regulatory timestamp type.
 *  <p></p>
 *  Note of Applicability:
 *  <p>    Values are required in US futures markets by the CFTC to
 *         support computerized trade reconstruction.
 *  <p></p>
 *      (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Execution Time
 *  <p>    2 - Time In
 *  <p>    3 - Time Out
 *  <p>    4 - Broker Receipt
 *  <p>    5 - Broker Execution
 *  <p></p>
 *  <p>    6 - Desk Receipt
 */
class Tag770EnuTrdRegTimestampTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX770_ENU_TRD_REG_TIMESTAMP_TYPE;
        assertEquals( "770", fixData.toEnumIDString());
        assertEquals( "TRD_REG_TIMESTAMP_TYPE", fixData.toEnumNameString());
        assertEquals( "TrdRegTimestampType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0770Test() {
        Tag770EnuTrdRegTimestampType tagData;
        Enum770TrdRegTimestampType oneElement;

        oneElement = Enum770TrdRegTimestampType.EXECUTION_TIME;
        tagData = new Tag770EnuTrdRegTimestampType( oneElement );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "770", tagData.toEnumIDString());
        assertEquals( "TRD_REG_TIMESTAMP_TYPE", tagData.toEnumNameString());
        assertEquals( "TrdRegTimestampType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.TIME_IN);
        assertEquals( Enum770TrdRegTimestampType.TIME_IN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.TIME_OUT);
        assertEquals( Enum770TrdRegTimestampType.TIME_OUT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.BROKER_RECEIPT);
        assertEquals( Enum770TrdRegTimestampType.BROKER_RECEIPT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.BROKER_EXECUTION);
        assertEquals( Enum770TrdRegTimestampType.BROKER_EXECUTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType.DESK_RECEIPT);
        assertEquals( Enum770TrdRegTimestampType.DESK_RECEIPT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag770EnuTrdRegTimestampType tagData;

        // loop around the ENUM and process
        for ( Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            tagData = new Tag770EnuTrdRegTimestampType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag770EnuTrdRegTimestampType tagData;

        // loop around the ENUM and process
        for (Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            tagData = new Tag770EnuTrdRegTimestampType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag770EnuTrdRegTimestampType tagData;

        // loop around the ENUM and process
        for (Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            tagData = new Tag770EnuTrdRegTimestampType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag770EnuTrdRegTimestampType tagData;

        // loop around the ENUM and process
        for (Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            tagData = new Tag770EnuTrdRegTimestampType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag770EnuTrdRegTimestampType tagData;

        // loop around the ENUM and process
        for (Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            tagData = new Tag770EnuTrdRegTimestampType(oneEnum);
            assertEquals( "Tag770EnuTrdRegTimestampType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}