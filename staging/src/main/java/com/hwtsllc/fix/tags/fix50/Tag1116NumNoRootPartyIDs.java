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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.FIX50;
import com.hwtsllc.fix.datatypes.FIX50Abstract;
import com.hwtsllc.fix.datatypes.MyNumInGroupType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  1116
 *  NoRootPartyIDs
 *  NumInGroup
 *  <p>
 *  Number of RootPartyID (1117), RootPartyIDSource (1118), and RootPartyRole (1119) entries
 */
public class Tag1116NumNoRootPartyIDs extends FIX50Abstract implements LogValuePairString, LogVerboseString {
    private final MyNumInGroupType dataValue;

    public final static int TESTA_NUM_NO_ROOT_PARTY_IDS
            = 1116;
    public final static int TESTB_NUM_NO_ROOT_PARTY_IDS
            = 16;

    public Tag1116NumNoRootPartyIDs(MyNumInGroupType dataValue) {
        setFixType(FIX50.FIX1116_NUM_NO_ROOT_PARTY_IDS);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag1116NumNoRootPartyIDs tagData;

        tagData = new Tag1116NumNoRootPartyIDs(new MyNumInGroupType(TESTA_NUM_NO_ROOT_PARTY_IDS) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1116NumNoRootPartyIDs(new MyNumInGroupType(TESTB_NUM_NO_ROOT_PARTY_IDS) );
        System.out.println(tagData.toVerboseString());
    }
}
