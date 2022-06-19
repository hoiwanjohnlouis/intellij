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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  670
 *  NoLegAllocs
 *  NumInGroup
 *  <p></p>
 *  Number of Allocations for the leg
 */
public class Tag670NumNoLegAllocs extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyNumInGroupType dataValue;

    public final static int TESTA_NUM_NO_LEG_ALLOCS
            = 670;
    public final static int TESTB_NUM_NO_LEG_ALLOCS
            = 70;

    public Tag670NumNoLegAllocs(MyNumInGroupType dataValue) {
        setFixType( FIX44.FIX670_NUM_NO_LEG_ALLOCS );
        this.dataValue = dataValue;
    }

    public int getDataValue() {
        return this.dataValue.getDataValue();
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
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag670NumNoLegAllocs tagData;

        tagData = new Tag670NumNoLegAllocs(new MyNumInGroupType( TESTA_NUM_NO_LEG_ALLOCS ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag670NumNoLegAllocs(new MyNumInGroupType( TESTB_NUM_NO_LEG_ALLOCS ) );
        System.out.println(tagData.toVerboseString());
    }
}