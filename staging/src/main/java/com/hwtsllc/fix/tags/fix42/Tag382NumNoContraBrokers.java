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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.datatypes.MyNumInGroupType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  382
 *  NoContraBrokers
 *  NumInGroup
 *  <p></p>
 *  The number of ContraBroker (375) entries.
 */
public class Tag382NumNoContraBrokers extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyNumInGroupType dataValue;

    public final static int TESTA_NUM_NO_CONTRA_BROKERS
            = 382;
    public final static int TESTB_NUM_NO_CONTRA_BROKERS
            = 82;

    public Tag382NumNoContraBrokers(MyNumInGroupType dataValue) {
        setFixType(FIX42.FIX382_NUM_NO_CONTRA_BROKERS);
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
        Tag382NumNoContraBrokers tagData;

        tagData = new Tag382NumNoContraBrokers(new MyNumInGroupType(TESTA_NUM_NO_CONTRA_BROKERS) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag382NumNoContraBrokers(new MyNumInGroupType(TESTB_NUM_NO_CONTRA_BROKERS) );
        System.out.println(tagData.toVerboseString());
    }
}
