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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1019
 *  InstrumentPartyID
 *  String
 *  <p>
 *  PartyID value within an instrument party repeating group.
 *  <p>
 *  Same values as PartyID (448)
 */
public class Tag1019StrInstrumentPartyID extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_INSTRUMENT_PARTY_ID
            = "BilboBaggins-Tag1019StrInstrumentPartyID";
    public final static String TESTB_STR_INSTRUMENT_PARTY_ID
            = "Gandalf-Tag1019StrInstrumentPartyID";

    public Tag1019StrInstrumentPartyID(MyStringType dataValue) {
        setFixType(FIX50.FIX1019_STR_INSTRUMENT_PARTY_ID);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(dataValue.toString());
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
        Tag1019StrInstrumentPartyID tagData;

        tagData = new Tag1019StrInstrumentPartyID(new MyStringType(TESTA_STR_INSTRUMENT_PARTY_ID) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag1019StrInstrumentPartyID(new MyStringType(TESTB_STR_INSTRUMENT_PARTY_ID) );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}