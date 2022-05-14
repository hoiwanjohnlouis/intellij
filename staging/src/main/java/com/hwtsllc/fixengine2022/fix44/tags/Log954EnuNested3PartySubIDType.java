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
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPartySubIDType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  786 (same as 786, 803, 805, 807, 954, 1054, 1064, 1122)
 *  SettlPartySubIDType
 *  int
 *  <p>
 *  Type of SettlPartySubID (785) value.
 *  <p>
 *  Same values as  PartySubIDType (803)
 *  <p></p>
 *  803
 *  PartySubIDType
 *  int
 *  <p>
 *  Type of PartySubID (523) value
 *  <p>
 *  4000+  = Reserved and available for bi-laterally agreed upon user defined values
 *  <p></p>
 *  805
 *  NestedPartySubIDType
 *  int
 *  <p>
 *  Type of NestedPartySubID (545) value.
 *  <p>
 *  Same values as  PartySubIDType (803)
 *  <p></p>
 *  807
 *  Nested2PartySubIDType
 *  int
 *  <p>
 *  Type of Nested2PartySubID (760) value. Second instance of <NestedParties>.
 *  <p>
 *  Same values as  PartySubIDType (803)
 *  <p></p>
 *  954
 *  Nested3PartySubIDType
 *  int
 *  <p>
 *  PartySubIDType value within a "third instance" Nested repeating group.
 *  <p>
 *  Same values as  PartySubIDType (803)
 *  <p></p>
 *  1054
 *  InstrumentPartySubIDType
 *  int
 *  <p>
 *  Type of InstrumentPartySubID (1053) value.
 *  <p>
 *  Same values as  PartySubIDType (803)
 *  <p></p>
 *  1064
 *  UndlyInstrumentPartySubIDType
 *  int
 *  <p>
 *  Type of underlying InstrumentPartySubID (1053) value.
 *  <p>
 *  Same values as  PartySubIDType (803)
 *  <p></p>
 *  1122
 *  RootPartySubIDType
 *  int
 *  <p>
 *  Type of RootPartySubID (1121) value.
 *  <p>
 *  Same values as PartySubIDType (803)
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Firm
 *  <p>    2 - Person
 *  <p>    3 - System
 *  <p>    4 - Application
 *  <p>    5 - Full legal name of firm
 *  <p></p>
 *  <p>    6 - Postal address
 *  <p>    7 - Phone number
 *  <p>    8 - Email address
 *  <p>    9 - Contact name
 *  <p>    10 - Securities account number (for settlement instructions)
 *  <p></p>
 *  <p>    11 - Registration number (for settlement instructions and confirmations)
 *  <p>    12 - Registered address (for confirmation purposes)
 *  <p>    13 - Regulatory status (for confirmation purposes)
 *  <p>    14 - Registration name (for settlement instructions)
 *  <p>    15 - Cash account number (for settlement instructions)
 *  <p></p>
 *  <p>    16 - BIC
 *  <p>    17 - CSD participant member code
 *  <p>    18 - Registered address
 *  <p>    19 - Fund account name
 *  <p>    20 - Telex number
 *  <p></p>
 *  <p>    21 - Fax number
 *  <p>    22 - Securities account name
 *  <p>    23 - Cash account name
 *  <p>    24 - Department
 *  <p>    25 - Location desk
 *  <p></p>
 *  <p>    26 - Position account type
 *  <p>    27 - Security locate ID
 *  <p>    28 - Market maker
 *  <p>    29 - Eligible counterparty
 *  <p>    30 - Professional client
 *  <p></p>
 *  <p>    31 - Location
 *  <p>    32 - Execution venue
 *  <p>
 *  <p>    or any value conforming to the data type Reserved4000Plus
 */
public class Log954EnuNested3PartySubIDType extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyEnumPartySubIDType dataValue;

    public final static MyEnumPartySubIDType TESTA_ENU_NESTED_3_PARTY_SUB_ID_TYPE
            = MyEnumPartySubIDType.CASH_ACCOUNT_NAME;
    public final static MyEnumPartySubIDType TESTB_ENU_NESTED_3_PARTY_SUB_ID_TYPE
            = MyEnumPartySubIDType.POSTAL_ADDRESS;

    public Log954EnuNested3PartySubIDType(MyEnumPartySubIDType dataValue) {
        setFixType(FIX44.FIX954_ENU_NESTED_3_PARTY_SUB_ID_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
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
        Log954EnuNested3PartySubIDType tagData;

        tagData = new Log954EnuNested3PartySubIDType(TESTA_ENU_NESTED_3_PARTY_SUB_ID_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log954EnuNested3PartySubIDType(TESTB_ENU_NESTED_3_PARTY_SUB_ID_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}