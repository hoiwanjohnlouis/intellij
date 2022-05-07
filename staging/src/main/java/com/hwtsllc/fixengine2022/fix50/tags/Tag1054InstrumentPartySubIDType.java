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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPartySubIDType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  1054 (same as 786, 803, 805, 807, 954, 1054, 1064, 1122)
 *  InstrumentPartySubIDType
 *  Type of InstrumentPartySubID (1053) value.
 *          Same values as  PartySubIDType (803)
 *  Valid values:
 *      1 - Firm
 *      2 - Person
 *      3 - System
 *      4 - Application
 *      5 - Full legal name of firm
 *      6 - Postal address
 *      7 - Phone number
 *      8 - Email address
 *      9 - Contact name
 *      10 - Securities account number (for settlement instructions)
 *      11 - Registration number (for settlement instructions and confirmations)
 *      12 - Registered address (for confirmation purposes)
 *      13 - Regulatory status (for confirmation purposes)
 *      14 - Registration name (for settlement instructions)
 *      15 - Cash account number (for settlement instructions)
 *      16 - BIC
 *      17 - CSD participant member code
 *      18 - Registered address
 *      19 - Fund account name
 *      20 - Telex number
 *      21 - Fax number
 *      22 - Securities account name
 *      23 - Cash account name
 *      24 - Department
 *      25 - Location desk
 *      26 - Position account type
 *      27 - Security locate ID
 *      28 - Market maker
 *      29 - Eligible counterparty
 *      30 - Professional client
 *      31 - Location
 *      32 - Execution venue
 *
 *  or any value conforming to the data type Reserved4000Plus
 */
public class Tag1054InstrumentPartySubIDType extends FIX50Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumPartySubIDType dataValue;

    public final static MyEnumPartySubIDType TESTA_ENU_INSTRUMENT_PARTY_SUB_ID_TYPE
            = MyEnumPartySubIDType.APPLICATION;
    public final static MyEnumPartySubIDType TESTB_ENU_INSTRUMENT_PARTY_SUB_ID_TYPE
            = MyEnumPartySubIDType.ELIGIBLE_COUNTERPARTY;

    public Tag1054InstrumentPartySubIDType(MyEnumPartySubIDType dataValue) {
        setFixType(FIX50.FIX1054_ENU_INSTRUMENT_PARTY_SUB_ID_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1054InstrumentPartySubIDType tagData;

        tagData = new Tag1054InstrumentPartySubIDType(TESTA_ENU_INSTRUMENT_PARTY_SUB_ID_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag1054InstrumentPartySubIDType(TESTB_ENU_INSTRUMENT_PARTY_SUB_ID_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
