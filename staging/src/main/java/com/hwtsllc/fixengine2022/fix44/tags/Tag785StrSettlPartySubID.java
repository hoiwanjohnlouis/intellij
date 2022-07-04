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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  785
 *  SettlPartySubID
 *  String
 *  <p></p>
 *  PartySubID value within a settlement parties component.
 *  <p></p>
 *  Same values as  PartySubID (523)
 */
public class Tag785StrSettlPartySubID extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_SETTL_PARTY_SUB_ID
            = "SuttonFoster-Tag785StrSettlPartySubID";
    public final static String TESTB_STR_SETTL_PARTY_SUB_ID
            = "KelliOhara-Tag785StrSettlPartySubID";

    public Tag785StrSettlPartySubID(MyStringType dataValue) {
        setFixType(FIX44.FIX785_STR_SETTL_PARTY_SUB_ID);
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
        return toEnumIDString()
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
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
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
        Tag785StrSettlPartySubID tagData;

        tagData = new Tag785StrSettlPartySubID(new MyStringType(TESTA_STR_SETTL_PARTY_SUB_ID) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag785StrSettlPartySubID(new MyStringType(TESTB_STR_SETTL_PARTY_SUB_ID) );
        System.out.println(tagData.toVerboseString());
    }
}
