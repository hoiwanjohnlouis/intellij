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

package com.hwtsllc.fix.tags.fix41;

import com.hwtsllc.fix.datatypes.FIX41;
import com.hwtsllc.fix.datatypes.FIX41Abstract;
import com.hwtsllc.fix.datatypes.MyNumInGroupType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  199
 *  NoIOIQualifiers
 *  NumInGroup
 *  <p></p>
 *  Number of repeating groups of IOIQualifiers (04).
 */
public class Tag199NumNoIOIQualifiers extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyNumInGroupType dataValue;

    public final static int TESTA_NUM_NO_IOI_QUALIFIERS
            = 3;
    public final static int TESTB_NUM_NO_IOI_QUALIFIERS
            = 4;

    public Tag199NumNoIOIQualifiers(MyNumInGroupType dataValue) {
        setFixType(FIX41.FIX199_NUM_NO_IOI_QUALIFIERS);
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
        Tag199NumNoIOIQualifiers tagData;

        tagData = new Tag199NumNoIOIQualifiers(new MyNumInGroupType(TESTA_NUM_NO_IOI_QUALIFIERS) );
        System.out.println( tagData.toVerboseString() );

        tagData = new Tag199NumNoIOIQualifiers(new MyNumInGroupType(TESTB_NUM_NO_IOI_QUALIFIERS) );
        System.out.println( tagData.toVerboseString() );
    }
}
