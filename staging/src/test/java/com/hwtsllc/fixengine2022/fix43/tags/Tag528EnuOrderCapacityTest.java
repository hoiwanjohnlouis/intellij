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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum528OrderCapacity;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  528
 *  OrderCapacity
 *  char
 *  <p></p>
 *  Designates the capacity of the firm placing the order.
 *  <p>
 *  (as of FIX 4.3, this field replaced Rule80A (tag 47)
 *  <p>
 *  used in conjunction with OrderRestrictions (529) field)
 *  <p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    A - Agency
 *  <p>    G - Proprietary
 *  <p>    I - Individual
 *  <p>    P - Principal
 *              (Note for CMS purposes, "Principal" includes "Proprietary")
 *  <p>    R - Riskless Principal
 *  <p></p>
 *  <p>    W - Agent for Other Member
 */
class Tag528EnuOrderCapacityTest {
    @Test
    void FIX0528Test() {
        FIX43 fixData = FIX43.FIX528_ENU_ORDER_CAPACITY;
        assertEquals( "528", fixData.toFIXIDString());
        assertEquals( "ORDER_CAPACITY", fixData.toFIXNameString());
        assertEquals( "OrderCapacity", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0528Test() {
        Tag528EnuOrderCapacity tagData;

        /*
         *  A, G, I, P, R, and W types
         */
        tagData = new Tag528EnuOrderCapacity( Enum528OrderCapacity.AGENCY );
        assertEquals( Enum528OrderCapacity.AGENCY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag528EnuOrderCapacity( Enum528OrderCapacity.PROPRIETARY );
        assertEquals( Enum528OrderCapacity.PROPRIETARY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag528EnuOrderCapacity( Enum528OrderCapacity.INDIVIDUAL );
        assertEquals( Enum528OrderCapacity.INDIVIDUAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag528EnuOrderCapacity( Enum528OrderCapacity.PRINCIPAL );
        assertEquals( Enum528OrderCapacity.PRINCIPAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag528EnuOrderCapacity( Enum528OrderCapacity.RISKLESS_PRINCIPAL );
        assertEquals( Enum528OrderCapacity.RISKLESS_PRINCIPAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag528EnuOrderCapacity( Enum528OrderCapacity.AGENT_FOR_OTHER_MEMBER );
        assertEquals( Enum528OrderCapacity.AGENT_FOR_OTHER_MEMBER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}