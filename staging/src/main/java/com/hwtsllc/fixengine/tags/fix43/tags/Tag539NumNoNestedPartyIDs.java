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

package com.hwtsllc.fixengine.tags.fix43.tags;

import com.hwtsllc.fixengine.datatypes.FIX43;
import com.hwtsllc.fixengine.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  539
 *  NoNestedPartyIDs
 *  NumInGroup
 *  <p></p>
 *  Number of NestedPartyID (524), NestedPartyIDSource (525), and NestedPartyRole (538) entries
 */
public class Tag539NumNoNestedPartyIDs extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyNumInGroupType dataValue;

    public final static int TESTA_NUM_NO_NESTED_PARTY_IDS = 539;
    public final static int TESTB_NUM_NO_NESTED_PARTY_IDS = 935;

    public Tag539NumNoNestedPartyIDs(MyNumInGroupType dataValue) {
        setFixType(FIX43.FIX539_NUM_NO_NESTED_PARTY_IDS);
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
        Tag539NumNoNestedPartyIDs tagData;

        tagData = new Tag539NumNoNestedPartyIDs(new MyNumInGroupType(TESTA_NUM_NO_NESTED_PARTY_IDS) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag539NumNoNestedPartyIDs(new MyNumInGroupType(TESTB_NUM_NO_NESTED_PARTY_IDS) );
        System.out.println(tagData.toVerboseString());
    }
}
