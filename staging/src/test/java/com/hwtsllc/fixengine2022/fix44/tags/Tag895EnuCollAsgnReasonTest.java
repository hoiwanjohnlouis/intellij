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
import com.hwtsllc.fixengine2022.fix44.enums.Enum895CollAsgnReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  895
 *  CollAsgnReason
 *  int
 *  <p></p>
 *  Reason for Collateral Assignment
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Initial
 *  <p>    1 - Scheduled
 *  <p>    2 - Time Warning
 *  <p>    3 - Margin Deficiency
 *  <p>    4 - Margin Excess
 *  <p></p>
 *  <p>    5 - Forward Collateral Demand
 *  <p>    6 - Event of default
 *  <p>    7 - Adverse tax event
 */
class Tag895EnuCollAsgnReasonTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX895_ENU_COLL_ASGN_REASON;
        assertEquals( "895", fixData.toEnumIDString());
        assertEquals( "COLL_ASGN_REASON", fixData.toEnumNameString());
        assertEquals( "CollAsgnReason", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0895Test() {
        Tag895EnuCollAsgnReason tagData;
        Enum895CollAsgnReason oneElement;

        oneElement = Enum895CollAsgnReason.INITIAL;
        tagData = new Tag895EnuCollAsgnReason( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "895", tagData.toEnumIDString());
        assertEquals( "COLL_ASGN_REASON", tagData.toEnumNameString());
        assertEquals( "CollAsgnReason", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.SCHEDULED );
        assertEquals( Enum895CollAsgnReason.SCHEDULED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.TIME_WARNING );
        assertEquals( Enum895CollAsgnReason.TIME_WARNING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.MARGIN_DEFICIENCY );
        assertEquals( Enum895CollAsgnReason.MARGIN_DEFICIENCY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.MARGIN_EXCESS );
        assertEquals( Enum895CollAsgnReason.MARGIN_EXCESS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.FORWARD_COLLATERAL_DEMAND );
        assertEquals( Enum895CollAsgnReason.FORWARD_COLLATERAL_DEMAND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.EVENT_OF_DEFAULT );
        assertEquals( Enum895CollAsgnReason.EVENT_OF_DEFAULT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag895EnuCollAsgnReason( Enum895CollAsgnReason.ADVERSE_TAX_EVENT );
        assertEquals( Enum895CollAsgnReason.ADVERSE_TAX_EVENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag895EnuCollAsgnReason tagData;

        // loop around the ENUM and process
        for ( Enum895CollAsgnReason oneEnum : Enum895CollAsgnReason.values()) {
            tagData = new Tag895EnuCollAsgnReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag895EnuCollAsgnReason tagData;

        // loop around the ENUM and process
        for (Enum895CollAsgnReason oneEnum : Enum895CollAsgnReason.values()) {
            tagData = new Tag895EnuCollAsgnReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag895EnuCollAsgnReason tagData;

        // loop around the ENUM and process
        for (Enum895CollAsgnReason oneEnum : Enum895CollAsgnReason.values()) {
            tagData = new Tag895EnuCollAsgnReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag895EnuCollAsgnReason tagData;

        // loop around the ENUM and process
        for (Enum895CollAsgnReason oneEnum : Enum895CollAsgnReason.values()) {
            tagData = new Tag895EnuCollAsgnReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag895EnuCollAsgnReason tagData;

        // loop around the ENUM and process
        for (Enum895CollAsgnReason oneEnum : Enum895CollAsgnReason.values()) {
            tagData = new Tag895EnuCollAsgnReason(oneEnum);
            assertEquals( "Tag895EnuCollAsgnReason\n" +
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