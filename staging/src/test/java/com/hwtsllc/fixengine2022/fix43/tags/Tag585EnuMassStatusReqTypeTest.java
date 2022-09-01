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

import com.hwtsllc.fixengine2022.fix43.enums.Enum585MassStatusReqType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag585EnuMassStatusReqTypeTest {
    Tag585EnuMassStatusReqType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum585MassStatusReqType oneEnum : Enum585MassStatusReqType.values()) {
            tagData = new Tag585EnuMassStatusReqType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum585MassStatusReqType oneEnum : Enum585MassStatusReqType.values()) {
            tagData = new Tag585EnuMassStatusReqType(oneEnum);
            assertEquals( "FIX585_ENU_MASS_STATUS_REQ_TYPE", tagData.toFIXLabelString());
            assertEquals( "585", tagData.toFIXIDString());
            assertEquals( "MASS_STATUS_REQ_TYPE", tagData.toEnumNameString());
            assertEquals( "MassStatusReqType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum585MassStatusReqType oneEnum : Enum585MassStatusReqType.values()) {
            tagData = new Tag585EnuMassStatusReqType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  585
         *  MassStatusReqType
         *  int
         *  <p>    1 - Status for orders for a Security
         *  <p>    2 - Status for orders for an Underlying Security
         *  <p>    3 - Status for orders for a Product
         *  <p>    4 - Status for orders for a CFICode
         *  <p>    5 - Status for orders for a SecurityType
         */
        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_SECURITY );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_UNDERLYING );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_PRODUCT );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_CFICODE );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_SECURITYTYPE );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Status for orders for a trading session
         *  <p>    7 - Status for all orders
         *  <p>    8 - Status for orders for a PartyID
         */
        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_SESSION );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ALL_ORDERS );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_PARTYID );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum585MassStatusReqType oneEnum : Enum585MassStatusReqType.values()) {
            tagData = new Tag585EnuMassStatusReqType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum585MassStatusReqType oneEnum : Enum585MassStatusReqType.values()) {
            tagData = new Tag585EnuMassStatusReqType(oneEnum);
            assertEquals( "Tag585EnuMassStatusReqType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}