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

package com.hwtsllc.fixengine.tags.fix42.tags;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  267
 *  NoMDEntryTypes
 *  NumInGroup
 *  <p></p>
 *  Number of MDEntryType (269) fields requested.
 */
public class Tag267NumNoMDEntryTypes extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyNumInGroupType dataValue;

    public final static int TESTA_NUM_NO_MD_ENTRY_TYPES
            = 267;
    public final static int TESTB_NUM_NO_MD_ENTRY_TYPES
            = 67;

    public Tag267NumNoMDEntryTypes(MyNumInGroupType dataValue) {
        setFixType(FIX42.FIX267_NUM_NO_MD_ENTRY_TYPES);
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
        Tag267NumNoMDEntryTypes tagData;

        tagData = new Tag267NumNoMDEntryTypes(new MyNumInGroupType(TESTA_NUM_NO_MD_ENTRY_TYPES) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag267NumNoMDEntryTypes(new MyNumInGroupType(TESTB_NUM_NO_MD_ENTRY_TYPES) );
        System.out.println(tagData.toVerboseString());
    }
}
